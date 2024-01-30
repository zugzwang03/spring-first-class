package com.webTechCourse.springfirstclass;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {
    public static final String template = "Hello %s";
    public final AtomicLong counter = new AtomicLong();

    @GetMapping("/resource")
    public Resource getResource(@RequestParam(value = "name", defaultValue = "Cohort 6") String name) {
        return new Resource(counter.getAndIncrement(), String.format(template, name));
    }
}
