package com.trey.oauthclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @author turui
 */
@RestController
public class SimpleController {
    @GetMapping("/hello")
    public String hello(Principal principal) {
        return "hello, " + principal.getName();
    }
}
