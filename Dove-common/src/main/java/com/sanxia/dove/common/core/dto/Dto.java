/**
 * Project Name:Dove-common
 * File Name:Dto.java
 * package com.sanxia.dove.common.core.dto;
 * Date:2018年3月7日上午10:27:41
 *
 */
package com.sanxia.dove.common.core.dto;

/**
 * Description:<br/>
 * Date:2018年3月7日上午10:27:41
 *
 * @author ly
 * @version
 * @see
 */
public class Dto<T> extends BaseDto {
    
    public static final Dto<Object> SUCCESS = new Dto<Object>(new Object());

    private T data;                 // 返回的数据结果

    public Dto(){
    }

    public Dto(T t) {
        this.data = t;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
