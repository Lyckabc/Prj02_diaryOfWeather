package zerobase.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zerobase.weather.domain.Diary;

/****************************************************
 **                                                 **
 **        weather                          **
 **        DiaryRepository                                  **
 **        Made by Toji                          **
 **        2024-02-27 :오후 12:21                         **
 **        https://github.com/lyckabc               **
 **                                                 **
 ****************************************************/
@Repository
public interface DiaryRepository extends JpaRepository<Diary, Integer> {

}
