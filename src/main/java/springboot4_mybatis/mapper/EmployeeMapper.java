package springboot4_mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import springboot4_mybatis.bean.Employee;

//或者@MapperScan将接口扫描装配到容器中
@Mapper
public interface EmployeeMapper {
    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);
}
