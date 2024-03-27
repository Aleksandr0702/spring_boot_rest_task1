package com.example.spring_boot_rest_task1.authorization.repository;

import com.example.spring_boot_rest_task1.authorization.model.Authorities;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        if ("admin".equals(user) && "password".equals(password)) {
            return Arrays.asList(Authorities.READ, Authorities.WRITE, Authorities.DELETE);
        } else if ("user".equals(user) && "password".equals(password)) {
            return Collections.singletonList(Authorities.READ);
        } else {
            return Collections.emptyList();
        }
    }
}

