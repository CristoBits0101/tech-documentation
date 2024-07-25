package com.example.demo.d_controllers.dc_receive;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/json")
@RestController
public class DCD_JsonController {

    @GetMapping("/object")
    public Object name(@RequestBody Object object) {
        return object;
    }

}
