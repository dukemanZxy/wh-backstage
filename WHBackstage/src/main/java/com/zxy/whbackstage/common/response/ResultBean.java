package com.zxy.whbackstage.common.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.io.Serializable;

/**
 * 通用返回信息类
 *
 * @param <T> 需要返回给前台的数据对象
 */

@Data
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class ResultBean<T extends Serializable> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 状态
     */
    private int code = HttpStatus.OK.value();

    /**
     * 说明
     */
    private String msg = "成功";

    /**
     * 返回的具体对象
     */
    private T data;

    public ResultBean() {
        super();
    }

    public ResultBean(T data) {
        super();
        this.data = data;
    }

    public ResultBean(Throwable e) {
        super();
        this.code = HttpStatus.INTERNAL_SERVER_ERROR.value();
        this.msg = e.getMessage();
    }

}
