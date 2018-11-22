package click.botay.japan.repository;

import click.botay.japan.entity.LoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface LoginRepository extends JpaRepository<LoginEntity, Long> {
    @Query(value = "select V FROM LoginEntity V WHERE V.userName LIKE ?1 AND V.passWord LIKE ?2")
    LoginEntity findAllByUserNameAndPassWord(String userName, String passWord);
    //viet ham dateUser them session vao;
    LoginEntity findAllBySession(String session);

}
