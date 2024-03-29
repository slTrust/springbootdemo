package hello.configuration;

import hello.mapper.UserMapper;
import hello.service.User;
import hello.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfiguration {
    @Bean
    public UserService someDummyBean1(UserMapper userMapper) {
        return new UserService(userMapper);
    }
}