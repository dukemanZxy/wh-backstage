package com.zxy.whbackstage.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Admin implements Serializable {
    /**
     * 主键
     */
    private String id;
    /**
     * 登录账号
     */
    private String userName;
    /**
     * 真实姓名
     */
    private String trueName;
    /**
     * 性别(1.男 2.女 3.不详)
     */
    private Integer gender;
    /**
     * 手机号
     */
    private String mobile;
    /**
     * 密码(md5字符串,密码只能重置)
     */
    private String password;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 状态(1.正常 2.禁用 3.异常)
     */
    private Integer status;
    /**
     * 创建人
     */
    private Long founder;
    /**
     * 是否在线(1.在线 2.不在线)
     */
    private Integer isOnline;
    /**
     * 是否受限(1.受限 2.不受限)
     */
    private Integer isLimit;
}
