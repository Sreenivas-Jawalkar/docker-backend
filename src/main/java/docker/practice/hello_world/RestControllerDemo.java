package docker.practice.hello_world;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerDemo {
    @GetMapping("/")
    public String helloWorld(){
        return "Hello World Sreenivas Rao! welcome to tcs...";
    }
    @GetMapping("/api")
    public String myTcsHelloWorld(){
        return "Welcome to tcs sreenivas Working????";
    }
}
