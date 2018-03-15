/**
 * Project Name:Dove-common
 * File Name:ListWrapper.java
 * package com.sanxia.dove.common.core.dto;
 * Date:2018年3月7日上午10:50
 *
 */
package com.sanxia.dove.common.core.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Description:<br/>
 * Date:2018年3月7日 上午10:50
 *
 * @author ly
 * @version
 * @see
 */
public class ListWrapper<T> implements Serializable{

    public List<T> list;

    public ListWrapper() {
    }

    public ListWrapper(List<T> list) {
        this.list = list;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
