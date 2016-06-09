package demo.spring.mvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by raist on 2016/5/22.
 *
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String helloMvc() {
        System.out.println("touch helloMvc() method");
        return "welcome";
    }
}
