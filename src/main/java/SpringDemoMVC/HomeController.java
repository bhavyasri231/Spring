package SpringDemoMVC;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class HomeController {

    @RequestMapping("/")
    public String showPage()
    {
        return "main-menu";
    }
}
