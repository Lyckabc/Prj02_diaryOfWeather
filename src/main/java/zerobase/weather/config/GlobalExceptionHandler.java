/****************************************************
 **                                                 **
 **        weather                          **
 **        GlobalExceptionHandler                                  **
 **        Made by Toji                          **
 **        2024-03-03 :오전 6:54                         **
 **        https://github.com/lyckabc               **
 **                                                 **
 ****************************************************/
package zerobase.weather.config;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public Exception handleAllException() {
        System.out.println("error from GlobalExceptionHandler");
        return new Exception();
    }

}
