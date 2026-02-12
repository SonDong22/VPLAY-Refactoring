package pocopoco_vplay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@ComponentScan(basePackages = {"pocopoco_vplay"})
public class VplayApplication {

	public static void main(String[] args) {
		SpringApplication.run(VplayApplication.class, args);
	}

}
