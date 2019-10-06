package springboot4_mybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author medal
 * @create 2019-10-06 20:51
 **/
@Controller
public class IndexControler {
    @RequestMapping("/index")
    public String index(ModelMap map){
        map.addAttribute("name","medal");
        return "index";
    }
}
