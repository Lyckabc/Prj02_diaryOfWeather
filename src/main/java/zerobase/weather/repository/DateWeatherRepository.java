package zerobase.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zerobase.weather.domain.DateWeather;
import zerobase.weather.domain.Diary;

import java.time.LocalDate;
import java.util.List;

/****************************************************
 **                                                 **
 **        weather                          **
 **        DateWeatherRepository                                  **
 **        Made by Toji                          **
 **        2024-03-03 :오전 3:57                         **
 **        https://github.com/lyckabc               **
 **                                                 **
 ****************************************************/
@Repository
public interface DateWeatherRepository extends JpaRepository<DateWeather, LocalDate> {
    List<DateWeather> findAllByDate(LocalDate localDate);
}
