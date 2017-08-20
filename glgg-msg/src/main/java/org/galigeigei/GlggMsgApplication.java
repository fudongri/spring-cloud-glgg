package org.galigeigei;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class GlggMsgApplication {

	@Value("${str.val}")
	private String str;

	@RequestMapping("/hello")
	public String hello(){
		return str;
	}

	public static void main(String[] args) {
		SpringApplication.run(GlggMsgApplication.class, args);
	}
}
