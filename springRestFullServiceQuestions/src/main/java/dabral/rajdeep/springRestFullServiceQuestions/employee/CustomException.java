package dabral.rajdeep.springRestFullServiceQuestions.employee;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
class CustomException extends RuntimeException {
   public CustomException(String errorMessage) {
      super(errorMessage);
   }
}
