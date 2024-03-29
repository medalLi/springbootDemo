package springboot4_mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import springboot4_mybatis.bean.EchartsDemoData;


//或者@MapperScan将接口扫描装配到容器中
@Mapper
public interface EchartsDemoDataMapper {
    @Select("SELECT * FROM echartsdomedata;")
    public EchartsDemoData getdata();
    //public void insertEmp(Employee employee);
}
