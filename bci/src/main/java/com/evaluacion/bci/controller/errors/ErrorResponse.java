package com.evaluacion.bci.controller.errors;
import org.springframework.http.HttpStatus;

public class ErrorResponse {

    private HttpStatus status;
    private String message;
    //@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyyMMdd hh:mm:ss")
    // private LocalDateTime timeStamp;

    public ErrorResponse() {
       // timeStamp = LocalDateTime.now();
    }

    public ErrorResponse(HttpStatus status) {
    }

    public ErrorResponse(HttpStatus status, String message) {

        this.status = status;
        this.message =  message  ;
    }


    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

   // public LocalDateTime getTimeStamp() {return timeStamp; }

   // public void setTimeStamp(LocalDateTime timeStamp) {this.timeStamp = timeStamp;}

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
