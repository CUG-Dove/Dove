/**
 * Project Name:Dove-common
 * File Name:Page.java
 * package com.sanxia.dove.common.core.dto;
 * Date:2018年3月7日 上午11:35
 *
 */
package com.sanxia.dove.common.core.dto;

import java.util.List;
import java.util.Map;

/**
 * Description:<br/>
 * Date:2018年3月7日 上午11:35
 * @param <T>
 *
 * @author ly
 * @version
 * @see
 */
public class Page<T> extends BaseDto{

    private PageWrapper<T> data;

    public Page(){
    }

    /**
     *  Description: <br/>
     * @param pageNo    当前页面数
     * @param pageSize 每页记录数
     * @param <E> 泛型
     * @return page 返回一个初始化页数和大小的对象
     */
    public static <E> Page<E> get(int pageNo, int pageSize){
        Page<E> page = new Page<E>();
        PageWrapper<E> data = new PageWrapper<>(pageNo, pageSize);
        page.setDate(data);
        return page;
    }

    /**
     *  Description: <br/>
     * @param pageNo 当前页面数
     * @param pageSize 每页记录数
     * @return page 返回一个初始化页数和大小的map类型对象
     */
    public static Page<Map<String, Object>> getMap(int pageNo, int pageSize){
        Page<Map<String, Object>> page = new Page<Map<String, Object>>();
        PageWrapper<Map<String, Object>> data = new PageWrapper<Map<String, Object>>(pageNo, pageSize);
        page.setDate(data);
        return page;
    }
    public Page(List<T> list){
        this.data = new PageWrapper<T>(list);
    }

    public void setList(List<T> list){
        if (data != null){
            this.data.setList(list);
        }else {
            this.data = new PageWrapper<T>(list);
        }
    }

    public PageWrapper<T> getData() {
        return data;
    }

    public void setDate(PageWrapper<T> data) {
        this.data = data;
    }

    public int findPageNo(){
        return this.data.getPageNo();
    }

    public int findPageSize(){
        return this.data.getPageSize();
    }

    public void setTotal(int total){
        this.data.setTotal(total);
    }

    public void setTotalPage(int total, int pageNo, int pageSize ){
        this.data.setTotal(total);
        this.data.setPageNo(pageNo);
        this.data.setPageSize(pageSize);
    }
}
