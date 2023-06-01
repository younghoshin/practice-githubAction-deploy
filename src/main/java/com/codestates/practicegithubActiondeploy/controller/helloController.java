package com.codestates.practicegithubActiondeploy.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

    @GetMapping("/")
    public String getmappingHello(){
        return "Hello World, Practice-githubAction-deploy!";
    }
}
