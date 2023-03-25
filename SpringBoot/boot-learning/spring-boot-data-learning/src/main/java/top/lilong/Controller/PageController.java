package top.lilong.Controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPObject;
import com.mysql.cj.xdevapi.JsonArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.lilong.damain.Discuss;
import top.lilong.respository.DiscussRepository;

import java.util.List;

@RestController
public class PageController {

    @Autowired
    private DiscussRepository discussRepository;
//    @GetMapping("/page")
//    public String pageReturn(int page,int size){
//        Pageable pageable = PageRequest.of(page, size);
////        List<Discuss> discussByPage = discussRepository.getDiscussByPage(pageable);
////        JSONArray.toJSONStringWithDateFormat(discussByPage)
////        discussByPage.toArray().var
////        String s = JSONArray.toJSONString(discussByPage);
//        return discussByPage.toString();
//    }
}
