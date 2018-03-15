/**
 * Project Name:Dove-common
 * File Name:PageWrapper.java
 * package com.sanxia.dove.common.core.dto;
 * Date:2018年3月7日上午11:15
 *
 */
package com.sanxia.dove.common.core.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Description:<br/>
 * Date:2018年3月7日  上午11:15
 */
public class PageWrapper<T> implements Serializable{

    private Integer total;                  //  总记录数

    private Integer totalPage;              //  总页数

    private Integer pageSize;               //  每页记录数

    private Integer pageNo;                 //  当前页数

    private List<T> list;                   //  数据

    public PageWrapper(){
    }

    public PageWrapper(Integer pageSize, Integer pageNo) {
        this.pageSize = pageSize;
        this.pageNo = pageNo;
    }
    public PageWrapper(List<T> list){
        this.list = list;
    }

    public Integer getTotal() {
        return total;
    }

    /**
     * totalPage 记录总数 = (total / pageSize) + 1;
     */
    public void setTotal(int total, Integer pageNo, Integer pageSize ) {
        this.total = total;
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.totalPage = (total / pageSize) + 1;
    }
    public void setTotal(int total){
        this.total = total;
        this.totalPage = (total / pageSize) + 1;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
