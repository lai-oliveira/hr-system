package br.com.userapi.services.impl;

import br.com.userapi.domain.User;
import br.com.userapi.repositories.UserRepository;
import br.com.userapi.services.UserService;
import br.com.userapi.services.exceptions.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
@Slf4j
public class UserServiceImpl implements UserService {

    private final Environment env;
    private final UserRepository userRepository;

    @Override
    public User findById(Long id) {
        log.info("USER_SERVICE ::: Get request on" + env.getProperty("local.server.port") + "port");
        return userRepository.findById(id).orElseThrow(()-> new ObjectNotFoundException("Object not found"));
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
