package click.botay.japan.repository;

import click.botay.japan.entity.VideoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Set;

public interface VideoRepository extends JpaRepository<VideoEntity, Long> {
    void deleteAllByIdIn(List<Long> ids);
    List<VideoEntity> findAllByIdIn(Set<Long> ids);

    /*@Query("SELECT v from VideoEntity v where v.url like ?1 and y = ?2")
    void deleteAllByUrlLike(String x, String name);*/
}
