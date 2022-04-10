package com.rusvlp.urlshortener.pagesController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class ShortenController{
    @GetMapping("")
    public String main(){
        return "shorten";
    }
}
