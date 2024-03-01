package by.bulbach.exceptionspringbootstarter.exception;

import org.springframework.stereotype.Component;

@Component
public class CommentNotFoundException extends RuntimeException{

    public CommentNotFoundException(String message) {
        super(message);
    }

    public CommentNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
