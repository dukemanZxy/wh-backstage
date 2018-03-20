package com.zxy.whbackstage.common.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 分页请求通用参数
 */

@Data
public class PageRequest implements Serializable {

    /**
     * 每页显示条数
     */
    private Integer size;

    /**
     * 当前页
     */
    private Integer page;

    /**
     * 排序字段
     */
    private String sortName;

    /**
     * 排序方式
     */
    private String sortBy;

}
