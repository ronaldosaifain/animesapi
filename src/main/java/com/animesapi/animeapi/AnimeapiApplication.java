package com.animesapi.animeapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan("com.animesapi.repository")
@ComponentScan("com.animesapi.resources")
@ComponentScan("com.animesapi.config")
@EntityScan("com.animesapi.domain")
@SpringBootApplication

@EnableJpaRepositories("com.animesapi.repository")
public class AnimeapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnimeapiApplication.class, args);
	}

}
