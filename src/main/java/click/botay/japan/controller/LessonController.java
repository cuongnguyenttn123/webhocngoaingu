package click.botay.japan.controller;

import click.botay.japan.domain.LessonResponse;
import click.botay.japan.domain.LessonUpsertRequest;
import click.botay.japan.service.LessonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lessons")
public class LessonController {

    private final LessonService lessonService;

    public LessonController(LessonService lessonService) {
        this.lessonService = lessonService;
    }

    @GetMapping
    public List<LessonResponse> getLessons() {
        return lessonService.getLessons();

    }

    @PostMapping
    public void createLesson(@RequestBody LessonUpsertRequest request) {
        lessonService.createLesson(request);
    }
}
