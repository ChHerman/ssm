package com.hc.web;

import com.hc.entity.Employee;
import com.hc.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/ssm")
public class EmployeeController {
    @Resource
    EmployeeService employeeService;

    @RequestMapping(value="/list", method = RequestMethod.GET)
    public String list(Model model){
        List<Employee> list = employeeService.getEmployeeList();
        model.addAttribute("list", list);
        return "list";
    }
}
