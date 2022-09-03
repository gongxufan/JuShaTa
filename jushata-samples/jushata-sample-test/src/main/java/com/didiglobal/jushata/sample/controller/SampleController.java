package com.didiglobal.jushata.sample.controller;

import com.didiglobal.jushata.module.JushataModule;
import com.didiglobal.jushata.module.JushataModuleManager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 0x4096.peng@gmail.com
 * @date 2020/10/28
 */
@RestController
public class SampleController {

    @RequestMapping(value = "/test")
    public String test() {

        List<JushataModule> jushataModuleList = JushataModuleManager.getInstance().getModules();



        return "";
    }

}
