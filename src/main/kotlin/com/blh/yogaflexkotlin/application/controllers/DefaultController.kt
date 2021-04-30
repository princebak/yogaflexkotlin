package com.blh.yogaflexkotlin.application.controllers

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class DefaultController {

    // ALL GETS ENDPOINTS

    @GetMapping("/")
    fun home(model: Model): String{
        model.addAttribute("pageTitle", "home")
        return "home"
    }
    @GetMapping("/about")
    fun about(model: Model): String{
        model.addAttribute("pageTitle", "about")
        return "about"
    }
    @GetMapping("/blog-home")
    fun blogHome(model: Model): String{
        model.addAttribute("pageTitle", "blog")
        return "blog-home"
    }
    @GetMapping("/blog-single")
    fun blogSingle(model: Model): String{
        model.addAttribute("pageTitle", "blog")
        return "blog-single"
    }
    @GetMapping("/contact")
    fun contact(model: Model): String{
        model.addAttribute("pageTitle", "contact")
        return "contact"
    }
    @GetMapping("/courses")
    fun courses(model: Model): String{
        model.addAttribute("pageTitle", "pages")
        return "courses"
    }
    @GetMapping("/elements")
    fun elements(model: Model): String{
        model.addAttribute("pageTitle", "pages")
        return "elements"
    }
    @GetMapping("/schedule")
    fun schedule(model: Model): String {
        model.addAttribute("pageTitle", "pages")
        return "schedule"
    }
    @GetMapping("/trainers")
    fun trainers(model: Model): String {
        model.addAttribute("pageTitle", "trainers")
        return "trainers"
    }
}