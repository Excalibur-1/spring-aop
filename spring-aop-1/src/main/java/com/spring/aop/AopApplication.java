package com.spring.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gxl
 */
@RestController
@SpringBootApplication
public class AopApplication {

  private final Chinese chinese;

  @Autowired
  public AopApplication(Chinese chinese) {
    this.chinese = chinese;
  }

  @GetMapping("/test")
  public void test() {
    chinese.eat("面");
    System.out.println(chinese.getClass());
  }

  public static void main(String[] args) {
    SpringApplication.run(AopApplication.class, args);
  }

}
