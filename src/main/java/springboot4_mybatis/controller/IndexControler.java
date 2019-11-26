package springboot4_mybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author medal
 **/
@Controller
public class IndexControler {
    @RequestMapping("hello")
    @ResponseBody
    public String index(){
        return "index";
    }
    @RequestMapping("/demo")
    public String indexDemo(ModelMap map){
        map.addAttribute("name","medal");
        return "indexDemo";
    }
}
