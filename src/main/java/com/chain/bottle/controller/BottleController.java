package com.chain.bottle.controller;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chain.bottle.model.BottleModel;

@RestController
public class BottleController {
	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/test")
    public BottleModel dealTest(@RequestParam(value="name", defaultValue="World") String name) {
        return new BottleModel(counter.incrementAndGet(), String.format(template, name));
    }
    
    @RequestMapping("/test51")
    public BottleModel dealTest1(@RequestParam(value="name", defaultValue="World") String name) {
        return new BottleModel(counter.incrementAndGet(), String.format(template, name));
    }
}
