package com.kevin.springcloudtest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringcloudtestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudtestApplication.class, args);
	}
	
	//在BookRepository 要直接用http://localhost:8080 直接打的話, 那這裡的inner class就註解起來吧
//	@RestController
//    class SimpleController {
//
//        @GetMapping
//        public Map hello() {
//            Map map = new HashMap();
//            map.put("say", "hello");
//            return map;
//        }
//    }
}
