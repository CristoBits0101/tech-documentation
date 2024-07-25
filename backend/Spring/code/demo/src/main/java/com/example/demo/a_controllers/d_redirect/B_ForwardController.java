package com.example.demo.a_controllers.d_redirect;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/forward-to-function")
@Controller
public class B_ForwardController {
    
    @GetMapping("/forward-to-bye")
    public String forwardController() {
        return "forward:bye";
    }

    public String bye() {
        return "bye";
    }

}
