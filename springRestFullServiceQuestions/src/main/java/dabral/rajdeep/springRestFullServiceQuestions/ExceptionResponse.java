package dabral.rajdeep.springRestFullServiceQuestions;

import java.util.Date;

public class ExceptionResponse {
    private Date date;
    private String errorMessage;

    public ExceptionResponse(Date date, String errorMessage) {
        this.date = date;
        this.errorMessage = errorMessage;
    }

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getErrorMessage() {
        return errorMessage;
    }
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
