package com.rakesh.rest.webservices.restful_web_services.helloworld;

import org.springframework.web.bind.annotation.*;

//Rest API
@RestController
public class HelloWorldController {
    // / Hello World

//    @RequestMapping(method = RequestMethod.GET, path = "/hello-world")
    @GetMapping("/hello-world")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping("/hello-world-bean")
    public HelloWorldNBean helloWorldBean(){
        return new HelloWorldNBean("Hello World Bean");
    }

    @GetMapping("/hello-world/path-variable/{name}")
    public HelloWorldNBean helloWorldPathVariable(@PathVariable String name){
        return new HelloWorldNBean(String.format("Hello World, " + name));
    }
}
