package com.crm.demo.crm.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping
    public String test() {
        return "Hello";
    }

    @PostMapping
    public String testPost(){
        return "Hello Post";
    }

    @PutMapping("/{id}")
    public String testPut(@PathVariable Integer id) {
        return "Hello Put. ID = " + id;
    }

}
