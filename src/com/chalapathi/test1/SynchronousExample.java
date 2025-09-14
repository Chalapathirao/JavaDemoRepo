package com.chalapathi.test1;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class SynchronousExample {
    public static void main(String[] args) {
        // Create HttpClient instance with basic settings
        try (HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)         // Specify HTTP/2
                .connectTimeout(Duration.ofSeconds(20))      // Set connection timeout
                .build()) {

            // Build the HttpRequest
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://postman-echo.com/get"))
                    .GET()
                    .header("User-Agent", "Java 11 HttpClient")
                    .build();

            try {
                // Send the request synchronously and get a response
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                System.out.println("Status Code: " + response.statusCode());
                System.out.println("Response Headers: " + response.headers());
                System.out.println("Response Body: " + response.body());
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

