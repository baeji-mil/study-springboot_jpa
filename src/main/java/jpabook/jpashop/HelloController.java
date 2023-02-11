package jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model){ // Model : 컨터롤러의 데이터를 Model을 통해 뷰로 넘길 수 있음
        model.addAttribute("data", "hello!!");
        return "hello";
    }
}
