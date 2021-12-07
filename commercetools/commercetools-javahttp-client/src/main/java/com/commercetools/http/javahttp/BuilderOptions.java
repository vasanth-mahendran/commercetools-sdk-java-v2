
package com.commercetools.http.javahttp;

import java.net.http.HttpClient;

@FunctionalInterface
public interface BuilderOptions {
    HttpClient.Builder plus(HttpClient.Builder builder);
}
