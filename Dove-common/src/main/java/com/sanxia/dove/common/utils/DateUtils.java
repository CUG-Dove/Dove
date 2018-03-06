package com.sanxia.dove.common.utils;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Description: 用于时间工具
 * Date: 2018-1-29
 *
 *@author dove
 *
 * */

public class DateUtils {

    public static String format(Timestamp time, String pattern){
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(new Date(time.getTime()));
    }

    public static String format(Date time, String pattern){
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(time);
    }

    public static Date parse(String date, String pattern){
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        try {
            return sdf.parse(date);
        }catch (ParseException e){
            return null;
        }
    }
}
