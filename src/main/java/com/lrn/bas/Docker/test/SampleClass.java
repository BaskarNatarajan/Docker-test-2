package com.lrn.bas.Docker.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleClass {
    @RequestMapping("/status")
    @SuppressWarnings("static-method")
    public String status() {

        return "OK";
    }

}
