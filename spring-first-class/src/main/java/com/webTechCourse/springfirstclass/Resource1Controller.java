package com.webTechCourse.springfirstclass;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Resource1Controller {

  private static final String temp = "";
  private final AtomicLong counter = new AtomicLong();

  @CrossOrigin(origins = "http://localhost:9000")
  @GetMapping("/resource1")
  public Resource1 getResource1(
    @RequestParam(required = false, defaultValue = "Cohort 6") String name
  ) {
    return new Resource1(counter.incrementAndGet(), String.format(temp, name));
  }
}
