package springboot4_mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import springboot4_mybatis.bean.EchartsDemoData;


//或者@MapperScan将接口扫描装配到容器中
@Mapper
public interface EchartsDemoDataMapper_V2 {
    public EchartsDemoData getdata1();
    //public void insertEmp(Employee employee);
}
