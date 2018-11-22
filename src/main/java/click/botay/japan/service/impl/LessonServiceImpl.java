package click.botay.japan.service.impl;

import click.botay.japan.converter.LessonEntityToResponseConverter;
import click.botay.japan.domain.LessonResponse;
import click.botay.japan.domain.LessonUpsertRequest;
import click.botay.japan.entity.LessonEntity;
import click.botay.japan.repository.GrammarRepository;
import click.botay.japan.repository.LessonRepository;
import click.botay.japan.repository.VideoRepository;
import click.botay.japan.repository.VocabularyRepository;
import click.botay.japan.service.LessonService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class LessonServiceImpl implements LessonService {

    private final LessonRepository lessonRepository;
    private final VideoRepository videoRepository;
    private final VocabularyRepository vocabularyRepository;
    private final GrammarRepository grammarRepository;
    private final LessonEntityToResponseConverter converter;

    public LessonServiceImpl(LessonRepository lessonRepository,
                             VideoRepository videoRepository,
                             VocabularyRepository vocabularyRepository,
                             GrammarRepository grammarRepository,
                             LessonEntityToResponseConverter converter) {
        this.lessonRepository = lessonRepository;
        this.videoRepository = videoRepository;
        this.vocabularyRepository = vocabularyRepository;
        this.grammarRepository = grammarRepository;
        this.converter = converter;
    }

    @Override
    public List<LessonResponse> getLessons() {
        return lessonRepository.findAll().stream().map(converter::convert).collect(Collectors.toList());
    }



    @Transactional
    @Override
    public void createLesson(LessonUpsertRequest request) {
        lessonRepository.save(convertToEntity(request));
    }

    private LessonEntity convertToEntity(LessonUpsertRequest request) {
        LessonEntity entity = new LessonEntity();
        entity.setTitle(request.getTitle());
        entity.setDescription(request.getDescription());
        entity.setVideos(new HashSet<>(videoRepository.findAllByIdIn(request.getVideoIds())));
        entity.setGrammarEntities(new HashSet<>(grammarRepository.findAllByIdIn(request.getGrammarIds())));
        entity.setVocabularyEntities(new HashSet<>(vocabularyRepository.findAllByIdIn(request.getVocabularyIds())));
        return entity;
    }
}
