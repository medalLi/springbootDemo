package springboot4_mybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import springboot4_mybatis.bean.Department;
import springboot4_mybatis.bean.Employee;
import springboot4_mybatis.mapper.DepartmentMapper;
import springboot4_mybatis.mapper.EmployeeMapper;

import java.util.HashMap;


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

    @GetMapping("/em/{id}")
    public HashMap<String,HashMap<String,Employee>> getEmp(@PathVariable("id") Integer id){
        HashMap<String,Employee> hm = new HashMap<>();
        HashMap<String,HashMap<String,Employee>> bhm = new HashMap<>();
        hm.put("item",employeeMapper.getEmpById(id));
        bhm.put("rows",hm);
        return bhm;
    }

    @GetMapping("/empp/{id}")
    public String getEmp2(@PathVariable("id") Integer id){
        String line = "{\n" +
                "  \"categories\":[\"衬衫\",\"羊毛衫\",\"雪纺衫\",\"裤子\",\"高跟鞋\",\"袜子\"],\n" +
                "  \"data\":[5,20,36,15,20,30]\n" +
                "}\n";
        return line;
    }

    @GetMapping("/emp/{id}")
    public String getEmp1(@PathVariable("id") Integer id){
        String line ="{\n"+
                "  \"status\": 200\n"+
                "  ,\"message\": \"\"\n"+
                "  ,\"total\": 8\n"+
                "  ,\"rows\": {\n"+
                "    \"item\": [{\n"+
                "      \"id\": \"10001\"\n"+
                "      ,\"username\": \"杜甫\"\n"+
                "      ,\"email\": \"xianxin@layui.com\"\n"+
                "      ,\"sex\": \"男\"\n"+
                "      ,\"city\": \"浙江杭州\"\n"+
                "      ,\"sign\": \"点击此处，显示更多。当内容超出时，点击单元格会自动显示更多内容。\"\n"+
                "      ,\"experience\": \"116\"\n"+
                "      ,\"ip\": \"192.168.0.8\"\n"+
                "      ,\"logins\": \"108\"\n"+
                "      ,\"joinTime\": \"2016-10-14\"\n"+
                "    }, {\n"+
                "      \"id\": \"10002\"\n"+
                "      ,\"username\": \"李白\"\n"+
                "      ,\"email\": \"xianxin@layui.com\"\n"+
                "      ,\"sex\": \"男\"\n"+
                "      ,\"city\": \"浙江杭州\"\n"+
                "      ,\"sign\": \"君不见，黄河之水天上来，奔流到海不复回。 君不见，高堂明镜悲白发，朝如青丝暮成雪。 人生得意须尽欢，莫使金樽空对月。 天生我材必有用，千金散尽还复来。 烹羊宰牛且为乐，会须一饮三百杯。 岑夫子，丹丘生，将进酒，杯莫停。 与君歌一曲，请君为我倾耳听。(倾耳听 一作：侧耳听) 钟鼓馔玉不足贵，但愿长醉不复醒。(不足贵 一作：何足贵；不复醒 一作：不愿醒/不用醒) 古来圣贤皆寂寞，惟有饮者留其名。(古来 一作：自古；惟 通：唯) 陈王昔时宴平乐，斗酒十千恣欢谑。 主人何为言少钱，径须沽取对君酌。 五花马，千金裘，呼儿将出换美酒，与尔同销万古愁。\"\n"+
                "      ,\"experience\": \"12.25\"\n"+
                "      ,\"ip\": \"192.168.0.8\"\n"+
                "      ,\"logins\": \"106\"\n"+
                "      ,\"joinTime\": \"2016-10-14\"\n"+
                "    }, {\n"+
                "      \"id\": \"10003\"\n"+
                "      ,\"username\": \"王勃\"\n"+
                "      ,\"email\": \"xianxin@layui.com\"\n"+
                "      ,\"sex\": \"男\"\n"+
                "      ,\"city\": \"浙江杭州\"\n"+
                "      ,\"sign\": \"人生恰似一场修行\"\n"+
                "      ,\"experience\": \"65\"\n"+
                "      ,\"ip\": \"192.168.0.8\"\n"+
                "      ,\"logins\": \"106\"\n"+
                "      ,\"joinTime\": \"2016-10-14\"\n"+
                "    }, {\n"+
                "      \"id\": \"10004\"\n"+
                "      ,\"username\": \"李清照\"\n"+
                "      ,\"email\": \"xianxin@layui.com\"\n"+
                "      ,\"sex\": \"女\"\n"+
                "      ,\"city\": \"浙江杭州\"\n"+
                "      ,\"sign\": \"人生恰似一场修行\"\n"+
                "      ,\"experience\": \"666\"\n"+
                "      ,\"ip\": \"192.168.0.8\"\n"+
                "      ,\"logins\": \"106\"\n"+
                "      ,\"joinTime\": \"2016-10-14\"\n"+
                "    }, {\n"+
                "      \"id\": \"10005\"\n"+
                "      ,\"username\": \"冰心\"\n"+
                "      ,\"email\": \"xianxin@layui.com\"\n"+
                "      ,\"sex\": \"女\"\n"+
                "      ,\"city\": \"浙江杭州\"\n"+
                "      ,\"sign\": \"人生恰似一场修行\"\n"+
                "      ,\"experience\": \"86.05\"\n"+
                "      ,\"ip\": \"192.168.0.8\"\n"+
                "      ,\"logins\": \"106\"\n"+
                "      ,\"joinTime\": \"2016-10-14\"\n"+
                "    }, {\n"+
                "      \"id\": \"10006\"\n"+
                "      ,\"username\": \"贤心\"\n"+
                "      ,\"email\": \"xianxin@layui.com\"\n"+
                "      ,\"sex\": \"男\"\n"+
                "      ,\"city\": \"浙江杭州\"\n"+
                "      ,\"sign\": \"人生恰似一场修行\"\n"+
                "      ,\"experience\": \"12\"\n"+
                "      ,\"ip\": \"192.168.0.8\"\n"+
                "      ,\"logins\": \"106\"\n"+
                "      ,\"joinTime\": \"2016-10-14\"\n"+
                "    }, {\n"+
                "      \"id\": \"10007\"\n"+
                "      ,\"username\": \"贤心\"\n"+
                "      ,\"email\": \"xianxin@layui.com\"\n"+
                "      ,\"sex\": \"男\"\n"+
                "      ,\"city\": \"浙江杭州\"\n"+
                "      ,\"sign\": \"人生恰似一场修行\"\n"+
                "      ,\"experience\": \"16\"\n"+
                "      ,\"ip\": \"192.168.0.8\"\n"+
                "      ,\"logins\": \"106\"\n"+
                "      ,\"joinTime\": \"2016-10-14\"\n"+
                "    }, {\n"+
                "      \"id\": \"10008\"\n"+
                "      ,\"username\": \"贤心\"\n"+
                "      ,\"email\": \"xianxin@layui.com\"\n"+
                "      ,\"sex\": \"男\"\n"+
                "      ,\"city\": \"浙江杭州\"\n"+
                "      ,\"sign\": \"人生恰似一场修行\"\n"+
                "      ,\"experience\": \"106\"\n"+
                "      ,\"ip\": \"192.168.0.8\"\n"+
                "      ,\"logins\": \"106\"\n"+
                "      ,\"joinTime\": \"2016-10-14\"\n"+
                "    }]\n"+
                "  }\n"+
                "}  ";
        return line;
    }


}
