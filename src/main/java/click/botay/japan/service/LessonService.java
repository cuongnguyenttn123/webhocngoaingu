package click.botay.japan.service;

import click.botay.japan.domain.LessonResponse;
import click.botay.japan.domain.LessonUpsertRequest;
import java.util.List;

public interface LessonService {
    List<LessonResponse> getLessons();
    void createLesson(LessonUpsertRequest request);
}
