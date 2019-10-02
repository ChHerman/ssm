package com.hc.service.impl;

import com.hc.dao.EmployeeDao;
import com.hc.entity.Employee;
import com.hc.service.EmployeeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Resource
    EmployeeDao employeeDao;
    @Override
    public List<Employee> getEmployeeList() {
        return employeeDao.queryAllEmp();
    }
}
