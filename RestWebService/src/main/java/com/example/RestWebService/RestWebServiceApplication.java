package com.example.RestWebService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;

@SpringBootApplication
@Configuration
public class RestWebServiceApplication {
	
	@Value( "${spring.redis.host}" )
	private String redisHost;
	
	@Value( "${spring.redis.port}" )
	private int redisPort;
	
	@Bean
	public LettuceConnectionFactory redisConnectionFactory() {
		return new LettuceConnectionFactory(new RedisStandaloneConfiguration(redisHost, redisPort));
	}

	public static void main(String[] args) {
		SpringApplication.run(RestWebServiceApplication.class, args);
	}
}
	