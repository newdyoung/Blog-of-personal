package com.newdyoung.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/index")
    public String index() {
//        int i = 9/0;
//        String blog = null;
//        if (blog == null) {
//            throw  new NotFoundException("博客不存在");
//        }
        return "index";
    }

    @GetMapping("/blog")
    public String blog() {
        return "blog";

    }

}
