package com.spring.aop;

import org.springframework.stereotype.Component;

/**
 * @author gxl
 */
@Component
public class Chinese implements Person {

  @Timer
  @Override
  public void sayHello(String name) {
    System.out.println("Hello," + name);
  }

  /**
   * 吃东西
   *
   * @param food 食物
   */
  @Timer
  public void eat(String food) {
    System.out.println("我正在吃：" + food);
  }

}
