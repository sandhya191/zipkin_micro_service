package com.example.microservices.zipkindistributedtracingserver;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

/**
 * 
 * @author Sandhya
 * Zipkin is used in server SpringBoot application
 *
 */

@SpringBootApplication
@EnableZipkinServer
public class ZipkinDistributedTracingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinDistributedTracingServerApplication.class, args);
	}
}
