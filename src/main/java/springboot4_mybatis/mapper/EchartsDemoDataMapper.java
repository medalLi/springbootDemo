package springboot4_mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import springboot4_mybatis.bean.EchartsDeomData;


//或者@MapperScan将接口扫描装配到容器中
@Mapper
public interface EchartsDemoDataMapper {
    public EchartsDeomData getdata();

    //public void insertEmp(Employee employee);
}
