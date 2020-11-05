package com.newdyoung.service;

import com.newdyoung.pojo.User;

public interface UserService {

    User checkUser(String username,String password);
}
