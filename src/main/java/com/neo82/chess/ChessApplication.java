package com.neo82.chess;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@RestController
public class ChessApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(ChessApplication.class, args);
	}

	@GetMapping({"/chess", "/"})
	public ModelAndView chess() {
		return new ModelAndView("chess.html");
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/img/**").addResourceLocations("classpath:/img/");
		registry.addResourceHandler("/js/**").addResourceLocations("classpath:/js/");
	}
}
