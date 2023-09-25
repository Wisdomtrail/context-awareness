package context_awareness.config;

import context_awareness.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"context_awareness.*"})
public class AppConfig {

    @Bean
    public User user(){
        return new User(1,"S");
    }
}
