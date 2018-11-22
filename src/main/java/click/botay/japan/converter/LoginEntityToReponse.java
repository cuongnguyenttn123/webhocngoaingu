package click.botay.japan.converter;

import click.botay.japan.domain.LoginResponse;
import click.botay.japan.entity.LoginEntity;
import org.springframework.stereotype.Component;

@Component
public class LoginEntityToReponse {
    LoginResponse converte(LoginEntity loginEntity){
        LoginResponse loginResponse = new LoginResponse();
        loginResponse.setId(loginEntity.getUserid());
        loginResponse.setUserName(loginEntity.getUserName());
        loginResponse.setPassWord(loginEntity.getPassWord());
        return loginResponse;
    }
}
