package com.training.demo.controllers.redirect;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequestMapping("/forward-to-function")
@Controller
public class ForwardController {

    
    @GetMapping("/forward-to-bye")
    public String forwardController() {
        return "forward:bye";
    }

    @GetMapping("/bye-execution")
    public String bye() {
        return "bye";
    }

}
