package com.example.springproject;

import org.springframework.web.bind.annotation.*;

//@RestController - designates class as a controller, where you can declare endpoints
@RestController
public class FirstController {

    //@GetMapping - declares method as an endpoint for Get method
    @GetMapping("/hello")
    public String hello(){
        return "Yello";
    }
    //@PostMapping - declares method as an endpoint for Post method
    @PostMapping("post")
    public String post(@RequestBody String message){ //@RequestBody - converts http/JSON requests to java objects
        return "message: " + message;
    }

    @PostMapping("post-order")
    public String post(@RequestBody Order order){
        return "message: " + order.toString();
    }

    @PostMapping("post-order-record")
    public String post(@RequestBody OrderRecord order){
        return "message: " + order.toString();
    }

    @GetMapping("/hello/{user-name}")
    public String pathVar(@PathVariable("user-name") String userName){ //PathVariable
        return "Yello " + userName;
    }
}
