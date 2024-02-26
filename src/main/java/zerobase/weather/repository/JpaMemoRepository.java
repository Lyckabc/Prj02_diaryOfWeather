/****************************************************
 **                                                 **
 **        weather                          **
 **        JpaMemoRepository                                  **
 **        Made by Toji                          **
 **        2024-02-27 :오전 4:08                         **
 **        https://github.com/lyckabc               **
 **                                                 **
 ****************************************************/
package zerobase.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zerobase.weather.domain.Memo;

@Repository
public interface JpaMemoRepository extends JpaRepository<Memo, Integer> {

}
