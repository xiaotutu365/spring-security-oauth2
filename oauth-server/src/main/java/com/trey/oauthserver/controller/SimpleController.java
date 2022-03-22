package com.trey.oauthserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author turui
 */
@RestController
public class SimpleController {
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(1);
        integers.add(5);
        integers.add(19);
        integers.add(6);
        List<Integer> collect = integers.stream()
                .filter(x -> x > 2)
                .map(x -> {return plus(x, 1);})
                .filter(x -> x > 10)
                .collect(Collectors.toList());
        System.out.println(collect);
    }

    public static Integer plus(Integer a, Integer b) {
        if(a == 19) {
            throw new RuntimeException("error");
        }
        return a + b;
    }
}