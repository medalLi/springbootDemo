package springboot4_mybatis.mapper;

import org.apache.ibatis.annotations.*;
import springboot4_mybatis.bean.Department;

//指定这是一个操作数据库的mapper
@Mapper
public interface DepartmentMapper {
    @Select("select * from dept where id=#{id}")
    public Department getDeptById(Integer id);

    @Delete("delete from dept where id=#{id}")
    public int deleteDeptById(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")//主键自增，如果没有主键，这个可以不要
    @Insert("insert into dept(dept_name) values(#{dept_name})")
    public int insertDept(Department department);

    @Update("update dept set dept_name=#{dept_name} where id=#{id}")
    public int updateDept(Department department);
}
