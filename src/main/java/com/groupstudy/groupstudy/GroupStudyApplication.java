package com.groupstudy.groupstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GroupStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(GroupStudyApplication.class, args);
		Estudo estudo = new Estudo();
		estudo.run();
	}
}
