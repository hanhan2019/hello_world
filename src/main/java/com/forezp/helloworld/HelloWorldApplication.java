package com.forezp.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication

@RestController
public class HelloWorldApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class, args);
    }
//    @GetMapping("/hi")
//    public String hi(){
//        return "hi,I'm forefzvvp!!!！";
//    }
    public class HelloController{
      @GetMapping("/hello")
      public String index(){
        return "hi,I'm forefzsssssdtttgsvvp!!!！";
      }
    }
}
