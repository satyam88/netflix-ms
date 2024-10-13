package com.example.netflix_ms;

import org.springframework.web.bind.annotation.GetMapping;

public class hindimovies {
    @GetMapping("/hindimovies")
    public String getData() {return  "Welcome to Hindi Movies Collections" ; }
}
