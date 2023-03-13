package ru.moshnikov.sortServer.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import ru.moshnikov.sortServer.aspect.LoggingAnnotatedMethodsAspect;

@Configuration
@EnableAspectJAutoProxy
public class ContextConfiguration {

    @Value("ru.moshnikov.sortServer.controller")
    private String profilePackage;


    @Bean
    public LoggingAnnotatedMethodsAspect aspectAnnotated() {
        return new LoggingAnnotatedMethodsAspect(profilePackage);
    }
}
