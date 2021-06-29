package com.example.springwebsecrity;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
public class SpringwebsecrityApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringwebsecrityApplication.class, args);
	//	InMemoryUserDetailsManager inMemoryUserDetailsManager=(InMemoryUserDetailsManager)context.getBean("inMemoryUserDetailsManager");
	//	UserDetails userDetail=inMemoryUserDetailsManager.loadUserByUsername("user");
	//	System.out.println("**************user info ***********88");
	//	System.out.println(userDetail.getUsername());
	//	System.out.println(userDetail.getPassword());
	//	System.out.println(userDetail.getAuthorities());
		//inMemoryUserDetailsManager.changePassword(userDetail.getPassword(), "demo");
	}

	//  @Bean
		public CommandLineRunner commandLineRunner(ApplicationContext ctx){
			return (args) -> {
				System.out.println("ctx.getBeanDefinitionCount()"+ctx.getBeanDefinitionCount());	
						Arrays.stream(ctx.getBeanDefinitionNames())
						.sorted()
						.forEach(name->System.out.println(name));
			};
	  }
	
}
