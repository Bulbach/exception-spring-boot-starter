package by.bulbach.exceptionspringbootstarter.exception;

import org.springframework.stereotype.Component;

@Component
public class PersonNotFoundException extends RuntimeException{

    public PersonNotFoundException(String message) {
        super(message);
    }

    public PersonNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
