package se.johan.lektion_2.uppgift1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home() {
        // Redirect till statisk fil
        return "redirect:/home.html";
    }
}