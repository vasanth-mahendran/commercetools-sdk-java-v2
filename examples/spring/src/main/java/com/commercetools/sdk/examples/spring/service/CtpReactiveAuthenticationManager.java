package com.commercetools.sdk.examples.spring.service;

import com.commercetools.api.defaultconfig.ServiceRegion;
import com.commercetools.sdk.examples.spring.config.MeClientFilter;
import com.commercetools.sdk.examples.spring.config.TokenGrantedAuthority;
import io.vrap.rmf.base.client.AuthenticationToken;
import io.vrap.rmf.base.client.HttpClientSupplier;
import io.vrap.rmf.base.client.VrapHttpClient;
import io.vrap.rmf.base.client.oauth2.GlobalCustomerPasswordTokenSupplier;
import io.vrap.rmf.base.client.oauth2.TokenStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.authentication.ReactiveAuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.SpringSecurityCoreVersion;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import org.springframework.web.server.WebSession;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
@EnableAutoConfiguration
public class CtpReactiveAuthenticationManager implements ReactiveAuthenticationManager {
    VrapHttpClient client;

    @Value(value = "${ctp.client.id}")
    private String clientId;

    @Value(value = "${ctp.client.secret}")
    private String clientSecret;

    @Value(value = "${ctp.project.key}")
    private String projectKey;

    @Autowired
    public CtpReactiveAuthenticationManager() {
        this.client = HttpClientSupplier.of().get();
    }

    @Override
    public Mono<Authentication> authenticate(Authentication authentication) {

        if (authentication instanceof UsernamePasswordAuthenticationToken) {
            GlobalCustomerPasswordTokenSupplier supplier = new GlobalCustomerPasswordTokenSupplier(
                    clientId,
                    clientSecret,
                    authentication.getName(),
                    authentication.getCredentials().toString(),
                    null,
                    ServiceRegion.GCP_EUROPE_WEST1.getPasswordFlowTokenURL(projectKey),
                    client
            );
            return Mono.fromFuture(() -> supplier.getToken().thenApply(token -> {
                final Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
                GrantedAuthority authority = new TokenGrantedAuthority("ROLE_USER", token);
                Collection<GrantedAuthority> updatedAuthorities = new ArrayList<>();
                updatedAuthorities.add(authority);
                updatedAuthorities.addAll(authorities);

                return new UsernamePasswordAuthenticationToken(authentication.getPrincipal(), "", updatedAuthorities);
            }));
        }
        return null;
    }
}
