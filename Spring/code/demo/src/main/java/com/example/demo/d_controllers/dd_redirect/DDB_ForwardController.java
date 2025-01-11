package com.example.demo.d_controllers.dd_redirect;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/forward-to-function")
@Controller
public class DDB_ForwardController {
    
    @GetMapping("/forward-to-bye")
    public String forwardController() {
        return "forward:bye";
    }

    public String bye() {
        return "bye";
    }

}
