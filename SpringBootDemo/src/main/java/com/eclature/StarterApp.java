package com.eclature;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

import com.eclature.model.Student;

@EnableAutoConfiguration //it does springboot autoconfiguration & creates web server automatically.
@ComponentScan
@SpringBootConfiguration
@PropertySource("classpath:MyProps/abc.properties")
public class StarterApp {

	public static void main(String[] args) {

		SpringApplication application = new SpringApplication(StarterApp.class);
		ConfigurableApplicationContext run = application.run(args);
		Student bean = run.getBean(Student.class); //run method automatically creates webApplicationContext.
		System.out.println(bean.getStudent()+" : "+bean.getName());
		
	}

}
