package by.bulbach.exceptionspringbootstarter.exception;

import org.springframework.stereotype.Component;

@Component
public class InvalidRequestException extends RuntimeException{

    public InvalidRequestException(String message) {
        super(message);
    }

    public InvalidRequestException(String message, Throwable cause) {
        super(message, cause);
    }
}
