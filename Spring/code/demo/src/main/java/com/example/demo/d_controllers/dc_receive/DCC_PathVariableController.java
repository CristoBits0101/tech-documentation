package com.example.demo.d_controllers.dc_receive;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RequestMapping("/path")
@RestController
public class DCC_PathVariableController {

    @GetMapping("/param/{name}")
    public String name(@PathVariable() String name) {
        return name;
    }

}
