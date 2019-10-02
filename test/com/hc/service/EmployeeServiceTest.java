package com.hc.service;

import com.hc.entity.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml" })
public class EmployeeServiceTest {
    @Resource
    EmployeeService employeeService;

    @Test
    public void testEmpService(){
        List<Employee> list = employeeService.getEmployeeList();
        for(Employee employee : list){
            System.out.println(employee);
        }
    }
}
