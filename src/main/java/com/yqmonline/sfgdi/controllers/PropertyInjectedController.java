package com.yqmonline.sfgdi.controllers;

import com.yqmonline.sfgdi.services.GreetingService;

public class PropertyInjectedController {

  public GreetingService greetingService;

  public String getGreeting() {
    return greetingService.sayGreeting();
  }

}
