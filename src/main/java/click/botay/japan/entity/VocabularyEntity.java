package click.botay.japan.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "vocabulary")
public class VocabularyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "tuvung")
    private String tuVung;
    @Column(name = "kanji")
    private String kanJi;
    @Column(name = "phienam")
    private String phienAm;
    @Column(name = "nghia")
    private String nghia;
    @Column(name = "vidu")
    private String viDu;

    @ManyToMany
    @JoinTable(
            name = "lessons_vocabulary",
            joinColumns = @JoinColumn(name = "vocabulary_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "lesson_id", referencedColumnName = "id"))
    private Set<LessonEntity> lessonEntity;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTuVung() {
        return tuVung;
    }

    public void setTuVung(String tuVung) {
        this.tuVung = tuVung;
    }

    public String getKanJi() {
        return kanJi;
    }

    public void setKanJi(String kanJi) {
        this.kanJi = kanJi;
    }

    public String getPhienAm() {
        return phienAm;
    }

    public void setPhienAm(String phienAm) {
        this.phienAm = phienAm;
    }

    public String getNghia() {
        return nghia;
    }

    public void setNghia(String nghia) {
        this.nghia = nghia;
    }

    public String getViDu() {
        return viDu;
    }

    public void setViDu(String viDu) {
        this.viDu = viDu;
    }

    public Set<LessonEntity> getLessonEntity() {
        return lessonEntity;
    }

    public void setLessonEntity(Set<LessonEntity> lessonEntity) {
        this.lessonEntity = lessonEntity;
    }
}
