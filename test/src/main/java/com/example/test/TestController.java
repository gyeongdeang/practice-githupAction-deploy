package com.example.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

@GetMapping("/")
public String index() {

    return "이원용";
}

}
