package by.bulbach.exceptionspringbootstarter.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "starter-copyright")
public class ExceptionStarterProperties {

    private String author;
}
