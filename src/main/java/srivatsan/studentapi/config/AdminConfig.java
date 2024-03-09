package srivatsan.studentapi.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import srivatsan.studentapi.model.Admin;

@Configuration
public class AdminConfig {
    @Bean
    public Admin admin(){
        return new Admin();
    }
}
