package com.example.spring_boot_jpa_test.controller;


import com.example.spring_boot_jpa_test.model.Test;
import com.example.spring_boot_jpa_test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/test")
    public Test getTest(@RequestParam("id")Integer id){

        Test t = testService.getOneTest(id);

        return t;
    }

}
