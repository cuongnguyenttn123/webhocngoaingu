package click.botay.japan.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "grammar")
public class GrammarEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "tennguphap")
    private String tenNguPhap;
    @Column(name = "cautruc")
    private String cauTruc;
    @Column(name = "cachdung")
    private String cachDung;
    @Column(name = "vidu")
    private String viDu;
    @Column(name = "chuthich")
    private String chuThich;

    @ManyToMany
    @JoinTable(
            name = "lessons_grammar",
            joinColumns = @JoinColumn(name = "grammar_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "lesson_id", referencedColumnName = "id"))
    private Set<LessonEntity> lessonEntity;

    public long getId() {
        return id;
    }

    public void setId(long idGrammar) {
        this.id = id;
    }

    public String getTenNguPhap() {
        return tenNguPhap;
    }

    public void setTenNguPhap(String tenNguPhap) {
        this.tenNguPhap = tenNguPhap;
    }

    public String getCauTruc() {
        return cauTruc;
    }

    public void setCauTruc(String cauTruc) {
        this.cauTruc = cauTruc;
    }

    public String getCachDung() {
        return cachDung;
    }

    public void setCachDung(String cachDung) {
        this.cachDung = cachDung;
    }

    public String getViDu() {
        return viDu;
    }

    public void setViDu(String viDu) {
        this.viDu = viDu;
    }

    public String getChuThich() {
        return chuThich;
    }

    public void setChuThich(String chuThich) {
        this.chuThich = chuThich;
    }

    public Set<LessonEntity> getLessonEntity() {
        return lessonEntity;
    }

    public void setLessonEntity(Set<LessonEntity> lessonEntity) {
        this.lessonEntity = lessonEntity;
    }
}
