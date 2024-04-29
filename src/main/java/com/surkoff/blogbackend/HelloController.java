package com.surkoff.blogbackend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {

    @GetMapping
    public String hello(@PathVariable(required = false) String name) {
        return "Hello" + (name != null && name.trim().length() > 0 ? String.format(", %s") : "") + "!";
    }
}
