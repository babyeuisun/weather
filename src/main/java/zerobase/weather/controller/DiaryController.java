package zerobase.weather.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;
import zerobase.weather.domain.Diary;
import zerobase.weather.service.DiaryService;

import java.time.LocalDate;
import java.util.List;

@RestController
public class DiaryController {
    private final DiaryService diaryService;

    public DiaryController(DiaryService diaryService) {
        this.diaryService = diaryService;
    }


    @PostMapping("/create/diary")
    @Operation(summary = "일기 텍스트와 날씨 이용해서 db 저장")
    void createDiary(@RequestParam LocalDate date, @RequestBody String text){
        diaryService.createDiary(date, text);
    }

    @GetMapping("/read/diary")
    @Operation(summary = "선택한 날짜의 일기를 가져옵니다")
    List<Diary> readDiary(@RequestParam LocalDate date){
        return diaryService.readDiary(date);
    }
    @GetMapping("/read/diaries")
    @Operation(summary = "선택한 날짜의 기간들의 모든 일기들을 가져옵니다")
    List<Diary> readDiaries(@RequestParam LocalDate startDate,LocalDate endDate){
        return diaryService.readDiaries(startDate,endDate);
    }
    @PutMapping("/update/diary")
    void updateDiary(@RequestParam LocalDate date,@RequestBody String text){
        diaryService.updateDiary(date,text);
    }
    @DeleteMapping("/delete/diary")
    void deleteDiary(@RequestParam LocalDate date){
        diaryService.deleteDiary(date);
    }
}
