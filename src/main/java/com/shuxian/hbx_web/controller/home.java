package com.shuxian.hbx_web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class home {



    @RequestMapping("/version")
    @ResponseBody
    public String getVersion() {
        return "1.0.0";
    }


}
