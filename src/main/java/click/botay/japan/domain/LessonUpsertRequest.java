package click.botay.japan.domain;

import java.util.Set;

public class LessonUpsertRequest {
    private String title;
    private String description;
    private Set<Long> videoIds;
    private Set<Long> vocabularyIds;
    private Set<Long> grammarIds;

    public Set<Long> getVocabularyIds() {
        return vocabularyIds;
    }

    public void setVocabularyIds(Set<Long> vocabularyIds) {
        this.vocabularyIds = vocabularyIds;
    }

    public Set<Long> getGrammarIds() {
        return grammarIds;
    }

    public void setGrammarIds(Set<Long> grammarIds) {
        this.grammarIds = grammarIds;
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

    public Set<Long> getVideoIds() {
        return videoIds;
    }

    public void setVideoIds(Set<Long> videoIds) {
        this.videoIds = videoIds;
    }
}
