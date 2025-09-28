package docker.practice.hello_world;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestControllerDemo {
    @Value("${coach.name}")
    private String Cname;
    @Value("${team.name}")
    private String Tname;
    @GetMapping("/")
    public String helloWorld(){
        return Cname + " Hello World Sree";
    }
    @GetMapping("data")
    public String mydum(){
        return Tname + " 2nd get mapping";
    }
}
