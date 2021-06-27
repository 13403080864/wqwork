package com.springboot.dao;

import com.springboot.pojo.Department;
import com.springboot.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import static org.apache.catalina.security.SecurityUtil.remove;

/**
 * @author
 * @since 2021-06-22 10:55
 */
/*
public class EmployeeDao {
    //模拟数据库中的数据
    private static Map<Integer, Employee> employees = null;

    //员工有所属部门
    @Autowired
    private DepartmentDao departmentDao;
    static {
        employees = new HashMap<Integer,Employee>(); //创建一个表

        employees.put(1001,new Employee("张三","485263962@qq.com",0,new Department(101,"教学部"));
        employees.put(1002,new Employee("张四","485263962@qq.com",1,new Department(102,"教研部"));
        employees.put(1003,new Employee("张五","485263962@qq.com",0,new Department(103,"教学部"));
        employees.put(1004,new Employee("张六","485263962@qq.com",1,new Department(104,"教学部"));
        employees.put(1005,new Employee("张七","485263962@qq.com",0,new Department(105,"后勤部"));
    }

   //主键自增长
    private static Integer InitId = 1006;

    //增加员工
    public void save(Employee employee){
        if(employee.getId() == null){
            employee.setId(initId++);
        }

        employee.setDepartment(departmentDao.getDepartmentById(employee.getDeparment().getId()));
        employee.put(employee.getId(),employee);
    }

    //查询所有员工
    public Collection<Employee> getAll(){
        return employees.values();
    }

    //通过id查询员工
    public Employee getEmployeeById(Integer id){
        return employees.get(id);
    }

    //通过id删除员工
    public void delete(Integer id){
        employees.remove(id);
    }

}*/
