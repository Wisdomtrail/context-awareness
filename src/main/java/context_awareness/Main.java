package context_awareness;


import context_awareness.config.AppConfig;
import context_awareness.repositories.UserRepository;
import context_awareness.repositories.UserRepositoryImpl;
import context_awareness.services.UserService;
import context_awareness.services.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserRepository userRepository = context.getBean(UserRepositoryImpl.class);
        System.out.println(userRepository);

        UserService userService = context.getBean(UserServiceImpl.class);
        System.out.println(userService);
    }
}