package com.example.demo.a_controllers.d_redirect;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/redirect")
@Controller
public class A_RedirectController {

    @GetMapping("/page")
    public String redirectPage() {
        // redirect @GetMapping("/bye")
        return "redirect:bye";
    }

    @GetMapping("/bye")
    public String bye() {
        // resources/templates/bye.html
        return "bye";
    }

}
