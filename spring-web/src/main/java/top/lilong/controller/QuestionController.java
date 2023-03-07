package top.lilong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class QuestionController {
    @GetMapping("/question")
    public ModelAndView questionnaire(@RequestParam("name") String name,@RequestParam("option") String option, @RequestParam("checkbox") String checkbox){
        ModelAndView modelAndView = new ModelAndView("/questiondata.jsp");
        if (name!=null&&option!=null&&option!=null) {
            modelAndView.addObject("name", name);
            modelAndView.addObject("option", option);
            modelAndView.addObject("checkbox", checkbox);
        }else {
            modelAndView.addObject("name", null);
            modelAndView.addObject("option", null);
            modelAndView.addObject("checkbox", null);
        }
        return modelAndView;
    }
}
