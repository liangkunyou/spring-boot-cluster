package com.wy.cluster;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class ClusterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClusterApplication.class, args);
		log.info("======================启动成功============================");
	}
}
