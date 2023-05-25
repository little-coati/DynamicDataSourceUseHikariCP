package com.example.dynamicHikaricp.controller;

import com.example.dynamicHikaricp.service.TestService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Karl
 * @since 2023-05-25
 */
@RestController
@RequestMapping("/test")
@AllArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping("/test1")
    public Integer test1() {
        return testService.test1();
    }

    @GetMapping("/test2")
    public Integer test2() {
        return testService.test2();
    }
}