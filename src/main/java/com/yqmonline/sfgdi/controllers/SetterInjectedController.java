package com.yqmonline.sfgdi.controllers;

import com.yqmonline.sfgdi.services.GreetingService;

public class SetterInjectedController {

  private GreetingService greetingService;

  public void setGreetingService(GreetingService greetingService) {
    this.greetingService = greetingService;
  }
  public String getGreeting() {
    return greetingService.sayGreeting();
  }

}