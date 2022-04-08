package SpringDemoMVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm(){
        return "HelloWorld-form";
    }

    @RequestMapping("/processForm")
    public String processForm(){
        return "HelloWorld";
    }

    @RequestMapping("/processFormVersionTwo")
    public String letShoutDude(HttpServletRequest request , Model model){

        String theName = request.getParameter("studentName");

        theName= theName.toUpperCase();

        String result = "Yo! "+ theName;

        model.addAttribute("message",result);

        return "HelloWorld";
    }

    @RequestMapping("/processFormVersionThree")
    public String letShoutDude(@RequestParam("studentName") String theName, Model model){

        theName= theName.toUpperCase();

        String result = "Hey my friend "+ theName;

        model.addAttribute("message",result);

        return "HelloWorld";
    }
}
