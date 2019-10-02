package com.hc.dao;

import com.hc.entity.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring/spring-dao.xml" })
public class EmployeeDaoTest {
    @Resource
    EmployeeDao employeeDao;

    @Test
    public void testList(){
        List<Employee> list = employeeDao.queryAllEmp();
        for (Employee employee : list){
            System.out.println(employee);
        }
    }
}
