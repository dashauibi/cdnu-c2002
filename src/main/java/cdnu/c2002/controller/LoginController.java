package cdnu.c2002.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Calendar;

@Controller
public class LoginController {
    @GetMapping("/loginIndex")
    public String showIndex(Model model){
//        model.addAttribute("currentYear", Calendar.getInstance().get(Calendar.YEAR));
        return "login";
    }
    @PostMapping("/login")
    public String doLogin(HttpServletRequest request){
        String password=request.getParameter("password");
        System.out.println(password);
        return "success";
    }
    @PostMapping("register")
    public String doRegister(){

        return "login";
    }
}
