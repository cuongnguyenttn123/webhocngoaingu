package click.botay.japan.repository;

import click.botay.japan.entity.GrammarEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Set;

public interface GrammarRepository extends JpaRepository<GrammarEntity, Long> {
    void deleteAllByIdIn(List<Long> ids);
    List<GrammarEntity> findAllByIdIn(Set<Long> ids);
}
