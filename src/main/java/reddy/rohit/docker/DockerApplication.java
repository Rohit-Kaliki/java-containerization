package reddy.rohit.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class DockerApplication {
  public static void main(String[] args) {
    SpringApplication.run(DockerApplication.class, args);
  }
}
