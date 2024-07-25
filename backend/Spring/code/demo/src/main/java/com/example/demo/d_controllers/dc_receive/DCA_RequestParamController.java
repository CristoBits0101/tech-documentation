package com.example.demo.d_controllers.dc_receive;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/params")
@RestController
public class DCA_RequestParamController {

    @GetMapping("/param")
    public String parameters(@RequestParam(required = false, defaultValue = "Cristo") String name) {
        return name;
    }

}
