package Springtest.Springtest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "Springtest.Springtest")
public class Configarations {

	@Bean
public Company myComp() {
	return new Company(02, "Mukwano LTD", "Luzira");
}
	
}
