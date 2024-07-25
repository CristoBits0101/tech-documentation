package com.example.demo.d_controllers.dd_redirect;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/redirect")
@Controller
public class DDA_RedirectController {

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
