package click.botay.japan.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "lessons")
public class LessonEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @ManyToMany
    @JoinTable(
            name = "lessons_videos",
            joinColumns = @JoinColumn(name = "lesson_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "video_id", referencedColumnName = "id"))
    private Set<VideoEntity> videos;

    @ManyToMany
    @JoinTable(
            name = "lessons_grammar",
            joinColumns = @JoinColumn(name = "lesson_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "grammar_id", referencedColumnName = "id"))
    private Set<GrammarEntity> grammarEntities;

    @ManyToMany
    @JoinTable(
            name = "lessons_vocabulary",
            joinColumns = @JoinColumn(name = "lesson_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "vocabulary_id", referencedColumnName = "id"))

    private Set<VocabularyEntity> vocabularyEntities;

    public Set<GrammarEntity> getGrammarEntities() {
        return grammarEntities;
    }

    public void setGrammarEntities(Set<GrammarEntity> grammarEntities) {
        this.grammarEntities = grammarEntities;
    }

    public Set<VocabularyEntity> getVocabularyEntities() {
        return vocabularyEntities;
    }

    public void setVocabularyEntities(Set<VocabularyEntity> vocabularyEntities) {
        this.vocabularyEntities = vocabularyEntities;
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

    public Set<VideoEntity> getVideos() {
        return videos;
    }

    public void setVideos(Set<VideoEntity> videos) {
        this.videos = videos;
    }
}
