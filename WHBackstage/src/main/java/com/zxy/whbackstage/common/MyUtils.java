package com.zxy.whbackstage.common;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class MyUtils {

    @Value("${com.joypay.supplierback.common.MyUtils.randomStr}")
    private String randomStr;
}
