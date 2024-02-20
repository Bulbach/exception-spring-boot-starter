package by.bulbach.exceptionspringbootstarter.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableConfigurationProperties(value = ExceptionStarterProperties.class)
@ConditionalOnMissingBean(type = "ControllerExceptionHandler")
public class StarterConfiguration {


}
