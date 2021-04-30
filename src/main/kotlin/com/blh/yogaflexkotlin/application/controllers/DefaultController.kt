package com.blh.yogaflexkotlin.application.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class DefaultController {

    // ALL GETS ENDPOINTS

    @GetMapping("/")
    fun home(): String {
        return "index"
    }
    @GetMapping("/about")
    fun about(): String {
        return "about"
    }
    @GetMapping("/blog-home")
    fun blogHome(): String {
        return "blog-home"
    }
    @GetMapping("/blog-single")
    fun blogSingle(): String {
        return "blog-single"
    }
    @GetMapping("/contact")
    fun contact(): String {
        return "contact"
    }
    @GetMapping("/courses")
    fun courses(): String {
        return "courses"
    }
    @GetMapping("/elements")
    fun elements(): String {
        return "elements"
    }
    @GetMapping("/schedule")
    fun schedule(): String {
        return "schedule"
    }
    @GetMapping("/trainers")
    fun trainers(): String {
        return "trainers"
    }
}