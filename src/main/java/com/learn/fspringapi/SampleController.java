package com.learn.fspringapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// All the APIs for /sample endpoint should come to this controller.
@RequestMapping("/sample")
public class SampleController {
    @GetMapping("/sayhello/{name}")
    public String sayHello(@PathVariable String name){
        return "Hey " + name;
    }
    @GetMapping("/saybye")
    public String sayBye(){
        return "Say Bye!";
    }
}
