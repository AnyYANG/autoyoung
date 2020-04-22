package com.autoyoung.springcloudautoyoungconsumer;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class TestController {
    @GetMapping("hello")
    public String Hello(@RequestParam String a) {
        return "hello " + a;
    }

    @GetMapping("/echo/{string}")
    public String echo(@PathVariable String string) {
        return "aahello Nacos Discovery " + string;
    }

    @GetMapping("/echo1/{string}")
    public String echo1(@PathVariable String string) {
        return "aa111hello Nacos Discovery " + string;
    }

    @GetMapping("/div")
    public String divide(@RequestParam Integer a, @RequestParam Integer b) {
        return String.valueOf(a / b);
    }

    @GetMapping("/error")
    public ResponseEntity test() {
        return new ResponseEntity("error", HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
