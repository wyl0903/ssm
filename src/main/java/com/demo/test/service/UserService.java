package com.demo.test.service;

import com.demo.test.model.User;

import java.util.List;

/**
 * Created by ylwu on 2017/6/15.
 */
public interface UserService {
    /**
     * 查找所有用户
     * @return
     * @throws Exception
     */
    List<User> findUser()throws Exception;
}
