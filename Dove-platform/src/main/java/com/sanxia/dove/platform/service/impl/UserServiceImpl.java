package com.sanxia.dove.platform.service.impl;

import com.sanxia.dove.common.utils.MD5Tools;
import com.sanxia.dove.platform.entity.system.User;
import com.sanxia.dove.platform.mapper.UserMapper;
import com.sanxia.dove.platform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 判断用户是否可以登陆，不能则返回null
     * @param account
     * @param password
     * @return
     */

    @Override
    public User login(String account, String password) {
        String passwordMD5 = MD5Tools.encode(password);
        User user = userMapper.loginByAccountAndPsd(account, passwordMD5);
        return user;
    }
}
