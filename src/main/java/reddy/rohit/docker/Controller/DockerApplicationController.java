package reddy.rohit.docker.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerApplicationController {

  @RequestMapping("/welcome")
  public String serveWelcomeEndPoint() {
    String greeterText = "there";
    String nameFromEnvironmentVariable = System.getenv("NAME");
    if (nameFromEnvironmentVariable != null) {
      greeterText = nameFromEnvironmentVariable;
    }
    return String.format("Hey %s! Welcome to the world of containers.", greeterText);
  }
}
