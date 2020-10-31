package com.example;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;

import java.util.Base64;
import java.util.logging.Logger;

@Controller("/")
public class Base64Controller {

    private final static Logger logger = Logger.getLogger(Base64Controller.class.getName());

    /**
     * Returns the given request body.
     * @param input
     * @return the same as the text parameter
     */
    @Post(uris = {"/convertToBase64"},produces = MediaType.TEXT_PLAIN, consumes = MediaType.APPLICATION_OCTET_STREAM)
    public String echo(@Body byte[] input) {
        logger.info("Request to echo with binary input of length:"+ input.length);
        return Base64.getEncoder().encodeToString(input);
    }
}
