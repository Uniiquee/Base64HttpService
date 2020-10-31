package com.example;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;

@Controller("/")
public class EchoController {

    @Post(uris = {"/echo"},produces = MediaType.TEXT_PLAIN)
    public String echo(@Body String text) {
        return text;
    }

}
