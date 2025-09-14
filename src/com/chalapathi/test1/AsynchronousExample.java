package com.chalapathi.test1;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class AsynchronousExample {
    public static void main(String[] args) throws Exception {
        // Create HttpClient with desired configurations
        CompletableFuture<HttpResponse<String>> futureResponse;
        try (HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .connectTimeout(Duration.ofSeconds(10))
                .build()) {

            // Build HttpRequest for a GET request
            HttpRequest request = HttpRequest.newBuilder()
                    .GET()
                    .uri(URI.create("https://httpbin.org/get"))
                    .header("User-Agent", "Java 11 HttpClient")
                    .build();

            // Send the request asynchronously
            futureResponse = client.sendAsync(request, HttpResponse.BodyHandlers.ofString());
        }

        // Process the response once it is complete
        String responseBody = futureResponse.thenApply(HttpResponse::body)
                .get(5, TimeUnit.SECONDS);
        System.out.println("Response Body: " + responseBody);
    }
}

