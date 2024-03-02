/****************************************************
 **                                                 **
 **        weather                          **
 **        RuntimeException                                  **
 **        Made by Toji                          **
 **        2024-03-03 :오전 6:15                         **
 **        https://github.com/lyckabc               **
 **                                                 **
 ****************************************************/
package zerobase.weather.error;


public class InvalidDate extends RuntimeException {
    private static final String MESSAGE = "너무 과거 혹은 미래의 날짜입니다.";
    public InvalidDate() {
        super(MESSAGE);
    }
}
