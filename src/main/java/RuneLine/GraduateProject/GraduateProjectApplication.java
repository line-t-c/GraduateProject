package RuneLine.GraduateProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraduateProjectApplication {

	public static void main(String[] args) {

		SpringApplication.run(GraduateProjectApplication.class, args);
	}

	public class HelloService {
		public String getMessage(String name) {
			return "Hello " + name;
		}
	}
}
