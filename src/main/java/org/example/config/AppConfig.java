package org.example.config;

import org.example.dao.StudentDao;
import org.example.dao.StudentDaoImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean("studentDao")
    public StudentDao appUserDao(){
        return new StudentDaoImp();
    }

}