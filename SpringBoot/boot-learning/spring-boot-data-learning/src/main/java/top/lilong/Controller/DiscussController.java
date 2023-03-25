package top.lilong.Controller;

import jakarta.annotation.Resource;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import top.lilong.damain.Discuss;
import top.lilong.respository.DiscussRepository;

import java.util.List;

@Controller
public class DiscussController {
    @Resource
    private DiscussRepository repository;

    @GetMapping("/")
    private String getDiscuss(ModelMap map){
//        repository.getDiscussByPage(0,3)
        Pageable pageable= PageRequest.of(0,3);
      List <Discuss> list= repository.getDiscussByPage(1,pageable);
      System.out.println(list);
      map.put("discussList",list);
      map.put("title","hello world");
      return "index.html";
    }

    @GetMapping("/detail")
//    @ResponseBody
    private String getDetail(String author, ModelMap map){
        Discuss byAuthor = repository.findByAuthor(author);
        map.put("comment",byAuthor);
        return "detail.html";
    }
}
