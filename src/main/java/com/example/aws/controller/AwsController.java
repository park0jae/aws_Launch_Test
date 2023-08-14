package com.example.aws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AwsController {

    @GetMapping
    public String awsTest(){
        return "Aws 배포 테스트입니다.";
    }
}
