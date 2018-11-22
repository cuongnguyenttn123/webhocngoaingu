package click.botay.japan.converter;

import click.botay.japan.domain.LessonResponse;
import click.botay.japan.entity.LessonEntity;
import org.springframework.stereotype.Component;

@Component
public class LessonEntityToResponseConverter {

    public LessonResponse convert(LessonEntity entity) {
        LessonResponse response = new LessonResponse();
        response.setId(entity.getId());
        response.setTitle(entity.getTitle());
        response.setDescription(entity.getDescription());
        response.setVocabularyEntities(VocabularyEntityToReponse.coverterList(entity.getVocabularyEntities()));
        return response;
    }
}
