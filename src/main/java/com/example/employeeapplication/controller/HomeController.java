package com.example.employeeapplication.controller;

        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String callEmployee()
    {
        return "redirect:/employees/list";
    }
}