package com.lvnt.service;

import com.lvnt.model.User;

/**
 * Created by lvnt
 */
public interface UserService {

    User findByUsername(String username);

    User findByEmail(String email);

    User saveUser(User user);

}
