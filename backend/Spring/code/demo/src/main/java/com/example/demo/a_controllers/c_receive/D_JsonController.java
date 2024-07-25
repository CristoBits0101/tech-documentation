package com.example.demo.a_controllers.c_receive;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/json")
@RestController
public class D_JsonController {

    @GetMapping("/object")
    public Object name(@RequestBody Object object) {
        return object;
    }

}
