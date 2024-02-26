/****************************************************
 **                                                 **
 **        weather                          **
 **        Memo                                  **
 **        Made by Toji                          **
 **        2024-02-27 :오전 4:03                         **
 **        https://github.com/lyckabc               **
 **                                                 **
 ****************************************************/
package zerobase.weather.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "memo")
public class Memo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String text;
}
