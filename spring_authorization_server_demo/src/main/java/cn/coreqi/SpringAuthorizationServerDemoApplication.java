package cn.coreqi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringAuthorizationServerDemoApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringAuthorizationServerDemoApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringAuthorizationServerDemoApplication.class, args);
	}

}
