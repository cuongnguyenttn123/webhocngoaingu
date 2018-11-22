package click.botay.japan.repository;

import click.botay.japan.entity.VocabularyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Set;

public interface VocabularyRepository extends JpaRepository<VocabularyEntity, Long> {
    void deleteAllByIdIn(Set<Long> ids);
    List<VocabularyEntity> findAllByIdIn(Set<Long> ids);
}
