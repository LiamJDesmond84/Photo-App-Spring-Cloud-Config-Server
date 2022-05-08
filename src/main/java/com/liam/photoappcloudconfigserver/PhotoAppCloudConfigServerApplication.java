package com.liam.photoappcloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class PhotoAppCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhotoAppCloudConfigServerApplication.class, args);
	}

}
