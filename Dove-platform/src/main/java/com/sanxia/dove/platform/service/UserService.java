package com.sanxia.dove.platform.service;

import com.sanxia.dove.platform.entity.system.User;

public interface UserService{
    /**
     * 判断用户是否可以登陆，不能则返回null Description：<br/>
     */
    User login(String account, String password);
}
