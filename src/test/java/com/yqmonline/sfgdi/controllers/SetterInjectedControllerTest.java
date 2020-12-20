package com.yqmonline.sfgdi.controllers;

import com.yqmonline.sfgdi.services.ConstructorGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

  SetterInjectedController controller;

  @BeforeEach
  void setUp() {
    controller = new SetterInjectedController();
    controller.setGreetingService(new ConstructorGreetingServiceImpl());
  }

  @Test
  void setGreetingService() {
  }

  @Test
  void getGreeting() {
    System.out.println(controller.getGreeting());
  }
}