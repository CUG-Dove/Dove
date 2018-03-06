package com.sanxia.dove.common.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Description: 检查格式是否正确
 * Date:2018-1-29
 *
 * @author dove
 * */

public class ValidUtils {

    /**
     * 检查是否是正确的邮箱格式
     */
    public static boolean isEmail(String email) {
        Pattern p = Pattern.compile("^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(\\.([a-zA-Z0-9_-])+)+$");
        Matcher m = p.matcher(email);
        return m.matches();
    }

    /**
     * 检查是否是正确的手机号
     */
    public static boolean isMobilePhone(String phone) {
        Pattern p = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$");
        Matcher m = p.matcher(phone);
        return m.matches();
    }
}
