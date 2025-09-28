package docker.practice.hello_world.coaches;

import docker.practice.hello_world.Coach;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Lazy
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        System.out.println("In Constructor: "+ getClass().getSimpleName());
        return "practice fast bowling for 15 minutes";
    }
}
