package com.example;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;

@Controller("/")
public class EchoController {

    /**
     * Returns the given request body.
     * @param text
     * @return the same as the text parameter
     */
    @Post(uris = {"/echo"},produces = MediaType.TEXT_PLAIN)
    public String echo(@Body String text) {
        return text;
    }

}
