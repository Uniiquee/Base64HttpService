package com.example;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import javax.inject.Inject;


import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest
public class Base64HttpServiceTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client("/")
    HttpClient client;

    @Inject
    EmbeddedApplication application;

    @Test
    void testItWorks() {
        Assertions.assertTrue(application.isRunning());
    }

    @Test
    void testEcho(){
        String response = client.toBlocking().retrieve(HttpRequest.POST("/echo","test"));
        assertEquals("test", response); //)
    }

}
