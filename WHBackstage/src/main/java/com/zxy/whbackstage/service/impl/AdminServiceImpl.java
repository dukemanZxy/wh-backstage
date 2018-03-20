package com.zxy.whbackstage.service.impl;

import com.zxy.whbackstage.model.Admin;
import com.zxy.whbackstage.repository.AdminMapper;
import com.zxy.whbackstage.service.AdminService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional(readOnly = true)
public class AdminServiceImpl implements AdminService {

    @Resource
    private AdminMapper adminMapper;

    @Override
    public Admin findAdminByIdentification(Admin admin) {
        return this.adminMapper.findAdminByIdentification(admin);
    }
}
