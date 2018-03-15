/**
 * Project Name:Dove-common
 * File Name:ListDto.java
 * package com.sanxia.dove.common.core.dto;
 * Date:2018年3月7日上午10:41
 *
 */
package com.sanxia.dove.common.core.dto;

import java.util.List;

/**
 * Description:<br/>
 * Date:2018年3月7日上午10:41
 *
 * @author
 * @version
 * @see
 */
public class ListDto<T> extends  BaseDto{

    private ListWrapper<T> data;

    public ListDto(){
    }

    public ListDto(List<T> list) {
        this.data = (ListWrapper<T>) list;
    }

    public ListWrapper<T> getData() {
        return data;
    }

    public void setData(ListWrapper<T> data) {
        this.data = data;
    }
    public void setList(List<T> list) {
        this.data = new ListWrapper<T>(list);
    }
}
