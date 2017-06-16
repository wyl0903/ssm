package com.demo.test.service.impl;

import com.demo.test.mapper.UserMapper;
import com.demo.test.model.User;
import com.demo.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ylwu on 2017/6/15.
 */
@Service
public class UserServiceImpl implements UserService {
    //User接口
    @Autowired
    private UserMapper userMapper;

    public UserServiceImpl(){
        System.out.println("-----------UserServiceImpl-----------");
    }
    public List<User> findUser() throws Exception {
        //调用mapper类中的selectByExample方法，如果传入类型为null，则表示无条件查找
        List<User> users = userMapper.selectByExample(null);
        return users;
    }

}
