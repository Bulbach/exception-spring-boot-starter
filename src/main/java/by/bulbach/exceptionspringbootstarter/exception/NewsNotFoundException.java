package by.bulbach.exceptionspringbootstarter.exception;

import org.springframework.stereotype.Component;

@Component
public class NewsNotFoundException extends RuntimeException {

    public NewsNotFoundException(String message) {
        super(message);
    }

    public NewsNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
