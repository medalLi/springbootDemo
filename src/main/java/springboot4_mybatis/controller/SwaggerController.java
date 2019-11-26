package springboot4_mybatis.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import springboot4_mybatis.bean.Employee;

@RestController
@RequestMapping("user")
@Api(value="用户管理",consumes = "haha",tags = "hehe",description = "gege")
public class SwaggerController {
    /*
    * 添加用户
    * */
    @PostMapping("addUser")
    @ApiOperation(value = "添加用户")
    public String addUser(@RequestBody Employee emp){
        System.out.println(emp);
        return "ok";
    }

    /*
    * 修改用户
    * */
    @PostMapping("updateUser")
    @ApiOperation(value = "修改用户")
    public String updateEmp(@RequestBody Employee emp){
        System.out.println(emp);
        return "ok";
    }

    /*
    * 用户删除
    * */
    @DeleteMapping("deleteEmp/{id}")
    @ApiOperation(value="删除用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value="用户编号",required= true)
    })
    public String deleteEmp(@PathVariable("id")Integer id){
        System.out.println(id);
        return "ok";
    }
}
