package dabral.rajdeep.springRestFullServiceQuestions;

import dabral.rajdeep.springRestFullServiceQuestions.employee.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@ControllerAdvice
@RestController
public class CustomException extends ResponseEntityExceptionHandler {
    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> handleAllExceptions(Exception e, WebRequest request){
      ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), e.getMessage());
        return new ResponseEntity(exceptionResponse , HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @ExceptionHandler(UserNotFoundException.class)
    public final ResponseEntity<Object> handleUserNotFoundExceptions(Exception e, WebRequest request){
        UserNotFoundException exceptionResponse = new UserNotFoundException(e.getMessage());
        return new ResponseEntity(exceptionResponse , HttpStatus.NOT_FOUND);
    }
}
