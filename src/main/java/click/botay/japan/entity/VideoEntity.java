package click.botay.japan.entity;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "videos")
public class VideoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "url")
    private String url;

    @ManyToMany
    @JoinTable(
            name = "lessons_videos",
            joinColumns = @JoinColumn(name = "video_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "lesson_id", referencedColumnName = "id"))
    private Set<LessonEntity> lessons;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Set<LessonEntity> getLessons() {
        return lessons;
    }

    public void setLessons(Set<LessonEntity> lessons) {
        this.lessons = lessons;
    }
}
