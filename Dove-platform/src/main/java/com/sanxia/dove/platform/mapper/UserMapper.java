package com.sanxia.dove.platform.mapper;

import com.sanxia.dove.platform.entity.system.User;

public interface UserMapper {
    User loginByAccountAndPsd(String account, String passwordMD5);

}
