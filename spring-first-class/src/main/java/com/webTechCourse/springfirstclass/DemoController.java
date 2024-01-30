package com.webTechCourse.springfirstclass;

import java.util.Arrays;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController implements ApplicationContextAware {

  private ApplicationContext applicationContext;

  public void setApplicationContext(ApplicationContext applicationContext) {
    this.applicationContext = applicationContext;
  }
  
  @GetMapping("/beans")
  public String[] getBeans() {
    String[] beans = applicationContext.getBeanDefinitionNames();
    Arrays.sort(beans);
    return beans;
  }
}