/****************************************************
 **                                                 **
 **        weather                          **
 **        DiaryController                                  **
 **        Made by Toji                          **
 **        2024-02-27 :오후 12:20                         **
 **        https://github.com/lyckabc               **
 **                                                 **
 ****************************************************/
package zerobase.weather.controller;


import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.*;
import zerobase.weather.domain.Diary;
import zerobase.weather.error.InvalidDate;
import zerobase.weather.service.DiaryService;

import java.time.LocalDate;
import java.util.List;
import zerobase.weather.service.DiaryService;

import java.time.LocalDate;


@RestController
public class DiaryController {
    private final DiaryService diaryService;

    public DiaryController(DiaryService diaryService) {
        this.diaryService = diaryService;
    }

    @PostMapping("/create/diary")
    void createDiary(@RequestParam @DateTimeFormat
            (iso = DateTimeFormat.ISO.DATE) LocalDate date,
                     @RequestBody String text) {
        diaryService.createDiary(date, text);
    }

    @GetMapping("/read/diary")
    List<Diary> readDiary(@RequestParam @DateTimeFormat
            (iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        return diaryService.readDiary(date);
    }

    @GetMapping("/read/diaries")
    List<Diary> readDiaries(@RequestParam @DateTimeFormat
            (iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
                            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
                            LocalDate endDate) {
        return diaryService.readDiaries(startDate, endDate);
    }

    @PutMapping("/update/diary")
    void updateDiary(@RequestParam @DateTimeFormat
            (iso = DateTimeFormat.ISO.DATE) LocalDate date,
                     @RequestBody String text) {
        diaryService.updateDiary(date, text);
    }

    @DeleteMapping("/delete/diary")
    void deleteDiary(@RequestParam @DateTimeFormat
            (iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        diaryService.deleteDiary(date);
    }

    //@ExceptionHandler(InvalidDate.class)
    //ResponseEntity<ErrorResponse> handleLineException(final InvalidDate.class error) {}
}
