package click.botay.japan.service;

import click.botay.japan.domain.LoginUpsertRequest;
import click.botay.japan.entity.LoginEntity;

import java.util.List;

public interface LoginSevice {
    List<LoginEntity> findAll();
    Object[] checkLogin(LoginUpsertRequest loginUpsertRequest);
    void checkOut(String session);
    boolean checkSession(String sesion);


 //   String upDateSession(LoginEntity loginEntity);
}
