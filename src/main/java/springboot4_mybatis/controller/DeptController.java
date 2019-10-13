package springboot4_mybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import springboot4_mybatis.bean.Department;
import springboot4_mybatis.bean.Employee;
import springboot4_mybatis.mapper.DepartmentMapper;
import springboot4_mybatis.mapper.EmployeeMapper;


@RestController
public class DeptController {
//    @Autowired
    DepartmentMapper departmentMapper;
   @Autowired
   EmployeeMapper employeeMapper;


    @GetMapping("/dept/{id}")
    public Department getDepartment(@PathVariable("id") Integer id){
        return departmentMapper.getDeptById(id);
    }

    @GetMapping("/dept")
    public Department insertDept(Department department){
        departmentMapper.insertDept(department);
        return department;
    }

    @GetMapping("/emp/{id}")
    public Employee getEmp(@PathVariable("id") int id){
        return employeeMapper.getEmpById(id);
    }


}
