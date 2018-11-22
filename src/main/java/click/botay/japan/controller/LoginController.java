package click.botay.japan.controller;

import click.botay.japan.domain.LoginUpsertRequest;
import click.botay.japan.entity.LoginEntity;
import click.botay.japan.service.LoginSevice;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/logins")
public class LoginController {
    private final LoginSevice loginSevice;

    public LoginController(LoginSevice loginSevice) {
        this.loginSevice = loginSevice;
    }

    @PostMapping
    public Object[] getUserName(@RequestBody LoginUpsertRequest loginUpsertRequest) {
        return loginSevice.checkLogin(loginUpsertRequest);

    }
    @GetMapping
    public List<LoginEntity> getFindAll(){
        return loginSevice.findAll();
    }
    @DeleteMapping
    public String checkOut(@RequestBody String session){
        loginSevice.checkOut(session);
        return "failed";
    }
    @PutMapping
    public String checkSession(@RequestBody String session){
        boolean index = loginSevice.checkSession(session);
        if (index){
            return "true";
        }
        return "fasle";
    }

}
