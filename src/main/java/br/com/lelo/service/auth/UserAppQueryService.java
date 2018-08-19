package br.com.lelo.service.auth;

import br.com.lelo.domain.UserApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserAppQueryService {

    private UserAppRepository userAppRepository;

    @Autowired
    public UserAppQueryService(UserAppRepository userAppRepository) {
        this.userAppRepository = userAppRepository;
    }

    @Transactional(readOnly = true)
    public Iterable<UserApp> userFindAll() {
        return userAppRepository.findAll();
    }

}
