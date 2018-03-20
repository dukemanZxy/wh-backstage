package com.zxy.whbackstage.repository;

import com.zxy.whbackstage.model.Admin;
import org.apache.ibatis.annotations.Param;

public interface AdminMapper {
    Admin findAdminByIdentification(@Param(value = "admin")Admin admin);
}
