package com.surkoff.blogbackend;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("hello")
public class HelloController {

    @GetMapping
    public String hello(@RequestParam(required = false) String name) {
        return "Hello" + (name != null && name.trim().length() > 0 ? String.format(", %s", name.trim()) : "") + "!";
    }
}
