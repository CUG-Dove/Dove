/**
 * Project Name:Dove-common
 * File Name:MapDto.java
 * package com.sanxia.dove.common.core.dto;
 * Date:2018年3月7日上午10:56
 *
 */
package com.sanxia.dove.common.core.dto;

import com.sanxia.dove.common.core.utils.DoveConstants;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:<br/>
 */
public class MapDto extends BaseDto{

    public static final MapDto ERROR = new MapDto(DoveConstants.FAIL, "错误");

    private Map<String, Object> data = null;

    public MapDto(){
    }

    public MapDto(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public Map<String, Object> getData() {
        return data;
    }

    /**
     * 初始化一个map, 并往map中添加数据 输入参数：Map<String, Object> map
     */
    public void putInData( Map<String, Object> map){
        if (data == null){
            data = new HashMap<String, Object>();
        }
        if (map != null){
            for (String key : map.keySet()){
                data.put(key, map.keySet());
            }
        }
    }
    /**
     * 初始化一个map, 并往map中添加数据 输入参数：Map<String, String> map
     */
    public void putInData2( Map<String, String> map){
        if (data == null){
            data = new HashMap<String, Object>();
        }
        if (map != null){
            for (String key : map.keySet()){
                data.put(key, map.keySet());
            }
        }
    }
    /**
     * 初始化一个map, 并往map中添加数据 输入参数：String key, Object o
     */
    public void putInData( String key, Object o){
        if (data == null){
            data = new HashMap<String, Object>();
        }
        data.put(key, o);
    }
}
