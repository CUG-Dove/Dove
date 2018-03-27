package com.sanxia.dove.platform.mapper;

import com.sanxia.dove.platform.entity.file.Blog;
import org.apache.ibatis.annotations.Param;

/**
 * Created by zy on 2018/3/27.
 */
public interface BlogMapper {
    /***
     * 插入一篇博客
     * @param blog
     * @return
     */
    int insertBlog(Blog blog);
}
