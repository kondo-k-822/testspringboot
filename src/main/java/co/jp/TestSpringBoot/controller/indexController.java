package co.jp.TestSpringBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("message", "Welcome to the TOP screen!");
        return "home"; // Refers to the 'home.html' template
    }

    @GetMapping("/timeout")
    public String timeoutPage() {
        return "timeout"; // Return the name of the timeout HTML file (e.g., timeout.html)
    }

    @GetMapping("/anotherPage")
    public String anotherPage() {
        return "anotherPage"; // Returns the name of the HTML file (anotherPage.html)
    }
}
