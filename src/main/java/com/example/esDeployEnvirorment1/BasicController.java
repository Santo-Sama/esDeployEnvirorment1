package com.example.esDeployEnvirorment1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/es")
public class BasicController {

    @Autowired
    private Environment environment;

    @GetMapping("/hello")
    public String hello() {
        String fullMessage = "Hello ";
        fullMessage = fullMessage + environment.getProperty("myCustomVarTree.devName");
        fullMessage = fullMessage + " your code is: ";
        fullMessage = fullMessage + environment.getProperty("myCustomVarTree.authCode");
        return fullMessage;
    }
}
