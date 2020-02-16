package com.pankaj.springbootsimple;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Pankaj Khatiwada
 */

@RestController
public class HomeResource {

    @GetMapping("/")
    public String hello(){
        return "Hello";
    }

    @GetMapping("/admin")
    public String admin(){
        return "Admin";
    }

    @GetMapping("/user")
    public String user(){
        return "User";
    }


}
