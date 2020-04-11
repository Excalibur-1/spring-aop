package com.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.aop.BeforeAdvice;
import org.springframework.stereotype.Component;

/**
 * @author gxl
 */
@Aspect
@Component
public class AdviceTest implements BeforeAdvice {

  @Pointcut("@annotation(com.spring.aop.Timer)")
  public void pointCut() {
  }

  @Pointcut("within(com.spring..*)")
  public void test(){}

  @Before("pointCut()")
  public void before(JoinPoint joinPoint) {
    System.out.println("===before执行了===:" + joinPoint.getClass());
  }

  @After("pointCut()")
  public void after(JoinPoint joinPoint) {
    System.out.println("===after执行了===:" + joinPoint.getClass());
  }

}
