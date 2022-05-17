
package com.commercetools.sdk.examples.spring.service;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.project.Project;
import com.newrelic.api.agent.NewRelic;
import com.newrelic.api.agent.Token;

import io.vrap.rmf.base.client.ApiHttpResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
@Component
public class ProjectRepository {
    private final ProjectApiRoot apiRoot;

    @Autowired
    public ProjectRepository(ProjectApiRoot apiRoot) {
        this.apiRoot = apiRoot;
    }

    public Mono<Project> get() {
        Token t = NewRelic.getAgent().getTransaction().getToken();
        return Mono
                .fromFuture(apiRoot.get()
                        .withHttpRequest(apiHttpRequest -> apiHttpRequest.withContext(t))
                        .execute()
                        .thenApply(ApiHttpResponse::getBody))
                .doAfterTerminate(t::expire);
    }
}
