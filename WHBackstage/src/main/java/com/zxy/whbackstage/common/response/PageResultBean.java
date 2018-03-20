package com.zxy.whbackstage.common.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.io.Serializable;
import java.util.List;

@Data
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class PageResultBean<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 状态
     */
    private int code = HttpStatus.OK.value();

    /**
     * 说明
     */
    private String msg = HttpStatus.OK.getReasonPhrase();

    /**
     * 当前页
     */
    private int page;

    /**
     * 每页显示记录数
     */
    private int size;

    /**
     * 总记录数
     */
    private long totalSize;

    /**
     * 总页数
     */
    private int totalPage;

    /**
     * 返回的具体对象
     */
    private List<T> data;

    public PageResultBean() {
        super();
    }

    public PageResultBean(List<T> data, int page, int size, long totalSize, int totalPage) {
        super();
        this.data = data;
        this.page = page;
        this.size = size;
        this.totalPage = totalPage;
        this.totalSize = totalSize;
    }

    public PageResultBean(List<T> data) {
        super();
        this.data = data;
    }

    public PageResultBean(Throwable e) {
        super();
        this.code = HttpStatus.INTERNAL_SERVER_ERROR.value();
        this.msg = e.getMessage();
    }
}
