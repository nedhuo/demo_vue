package com.ned.vue.controller;

import com.ned.vue.domain.School;
import com.ned.vue.service.impl.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 关于@ResponseBody
 *
 * 从html等前端页面回来的数据都是以json格式，比如School类型的数据
 * 而在服务器端则为对象类型，中间则需要ResponseBody进行转换
 */
@Controller
@RequestMapping("/school")
@ResponseBody//将domain(entity)对象与json进行绑定
public class SchoolController {
    @Autowired
    private SchoolService schoolService;

    @RequestMapping("/findAll")
    public List<School> findAll() {
        return schoolService.findAll();
    }

    @RequestMapping("/findById")
    public School findById(long sid) {
        return schoolService.findById(sid);
    }
}
