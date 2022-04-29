package com.exampleproject.JustATest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// When using the RestController, routes will be serialized into JSON.
@RestController
public class HomeRestController {
  
  @RequestMapping("/home-rest")
  public String getHomeString() {
    return "Why, Hello there~!";
  }
}
