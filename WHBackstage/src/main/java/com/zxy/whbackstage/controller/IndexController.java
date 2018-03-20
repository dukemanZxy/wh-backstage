package com.zxy.whbackstage.controller;

import com.zxy.whbackstage.common.MyUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.http.MediaType;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
@Controller
public class IndexController {

    @Resource
    private MyUtils myUtils;

    @RequestMapping(value = "/")
    public ModelAndView index(ModelMap model, HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }

    @RequestMapping("/home")
    public String home() {
        return "main";
    }

    @ResponseBody
    @RequestMapping(value = "/random", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public MyUtils random() {
        return myUtils;
    }
}
