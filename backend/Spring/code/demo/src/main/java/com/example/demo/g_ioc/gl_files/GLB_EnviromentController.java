package com.example.demo.g_ioc.gl_files;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;

public class GLB_EnviromentController {

    @Autowired
    Environment environment;

    @GetMapping("enviroment")
    public Map<String, String> entorno() {

        String developer = environment.getProperty("config.developer", String.class);

        Map<String, String> data = new HashMap<>();

        data.put("developer", developer);

        return data;

    }

}
