package pocopoco_vplay.global.exception;

import org.springframework.http.HttpStatus;

public class ErrorResponse {

    private final int status;
    private final String message;

    public ErrorResponse(ErrorCode errorCode) {
        this.status = errorCode.getStatus().value();
        this.message = errorCode.getMessage();
    }

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}