package com.xulala.SSMTemplate.controller;

import com.xulala.SSMTemplate.entity.AgencyKey;
import com.xulala.SSMTemplate.entity.AjaxMessage;
import com.xulala.SSMTemplate.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by xl on 2018/1/12 0012.
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @Autowired
    private TestService testService;
    @RequestMapping(value = "/do",method = RequestMethod.GET)
    public ModelAndView test(AgencyKey agencyKey){
        ModelAndView mav=new ModelAndView();
        mav.addObject("pageInfo", testService.find())  ;   //增加PageInfo模型
        mav.addObject("courses", "")   ;    //增加Courses模型
        mav.addObject("keyWord", "关键字")   ;   //增加KeyWord关键词
        mav.addObject("lineSizes", new int[]{5,10,15,20,25,30})  ;
        mav.setViewName("/index");
        return mav;
    }
}
