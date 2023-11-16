package phong.ms.phong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("phong.ms.entity")
@ComponentScan(basePackages = "phong.ms")
@EnableJpaRepositories("phong.ms.repository")
public class PhongApplication {
	public static void main(String[] args) {
		SpringApplication.run(PhongApplication.class, args);
	}

}
