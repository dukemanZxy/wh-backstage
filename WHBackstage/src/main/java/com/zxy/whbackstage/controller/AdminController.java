package com.zxy.whbackstage.controller;

import com.zxy.whbackstage.common.response.ResultBean;
import com.zxy.whbackstage.model.Admin;
import com.zxy.whbackstage.service.AdminService;
import org.springframework.http.MediaType;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {
    @Resource
    private AdminService adminService;

    @ResponseBody
    @RequestMapping(value = "/getAdminByIdentification", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResultBean<Admin> getAdminByIdentification(Admin admin) {
        Admin adminRequest = this.adminService.findAdminByIdentification(admin);
        return new ResultBean<>(adminRequest);
    }
}
