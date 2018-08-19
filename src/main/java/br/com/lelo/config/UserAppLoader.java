package br.com.lelo.config;

import br.com.lelo.domain.UserApp;
import br.com.lelo.service.auth.UserAppCommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class UserAppLoader {

    @Autowired
    private UserAppCommandService command;

    @PostConstruct
    public void go() {
        command.save(new UserApp("user@br.com.br", "user"));
        command.save(new UserApp("other@br.com.br", "user2"));
    }

}
