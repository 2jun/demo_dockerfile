package com.example.demodocker.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class MainController {
    @RequestMapping("test01")
    public Object test01(@RequestParam(value = "str", required = false) String str) {
        log.info("str=>>" + str);
        return "str=>>" + str;
    }
}
