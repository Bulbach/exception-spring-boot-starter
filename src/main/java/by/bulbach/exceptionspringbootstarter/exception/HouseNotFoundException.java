package by.bulbach.exceptionspringbootstarter.exception;

import org.springframework.stereotype.Component;

@Component
public class HouseNotFoundException extends RuntimeException {

    public HouseNotFoundException(String message) {
        super(message);
    }

    public HouseNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
