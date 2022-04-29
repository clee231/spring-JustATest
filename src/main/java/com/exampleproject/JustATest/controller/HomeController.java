package com.exampleproject.JustATest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
  
  @RequestMapping("/home")
  public String getHomeString() {
    return "index"; // This is a name of the file in your src/main/resources/templates folder.
  }
}
