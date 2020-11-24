package springboot_OA;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("springboot_OA.mapper")
public class SpringbootOaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootOaApplication.class, args);
	}

}
