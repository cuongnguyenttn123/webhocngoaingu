package click.botay.japan.domain;

import click.botay.japan.entity.GrammarEntity;
import click.botay.japan.entity.VideoEntity;
import click.botay.japan.entity.VocabularyEntity;

import java.util.List;
import java.util.Set;

public class LessonResponse {
    private long id;
    private String title;
    private String description;
    private Set<VideoEntity> videoEntities;
    private Set<VocabularyResponse> vocabularyEntities;
    private Set<GrammarEntity> grammarEntities;

    public Set<VideoEntity> getVideoEntities() {
        return videoEntities;
    }

    public void setVideoEntities(Set<VideoEntity> videoEntities) {
        this.videoEntities = videoEntities;
    }

    public Set<VocabularyResponse> getVocabularyEntities() {
        return vocabularyEntities;
    }

    public void setVocabularyEntities(Set<VocabularyResponse> vocabularyEntities) {
        this.vocabularyEntities = vocabularyEntities;
    }

    public Set<GrammarEntity> getGrammarEntities() {
        return grammarEntities;
    }

    public void setGrammarEntities(Set<GrammarEntity> grammarEntities) {
        this.grammarEntities = grammarEntities;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
