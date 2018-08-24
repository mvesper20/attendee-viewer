package io.rscale.training.attendeeviewer;

import org.springframework.boot.SpringApplication;

import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@EnableCircuitBreaker
@EnableOAuth2Sso
public class AttendeeViewerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AttendeeViewerApplication.class, args);
	}
	

}
