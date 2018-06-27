package com.zz.web;

import com.zz.common.Msg;
import com.zz.entity.Department;
import com.zz.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Zhou Wenzhe
 * @date 2018/6/25
 */
@Controller
public class DepartmentController {

    @Autowired
    private IDepartmentService iDepartmentService;

    /**
     * 返回部门信息
     */
    @RequestMapping("/depts")
    @ResponseBody
    public Msg getDepts(){
        List<Department> list = iDepartmentService.getDepts();
        System.out.println(list);
        return Msg.success().add("depts",list);
    }
}
