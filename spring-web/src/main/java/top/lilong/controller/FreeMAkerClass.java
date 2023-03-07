package top.lilong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import top.lilong.entity.FreeMaker;

import java.util.ArrayList;

@Controller
public class FreeMAkerClass {
    @GetMapping("/freetest")
    public String t04stl(Model model){

        ArrayList<Object> lists = new ArrayList<>();
        {
            FreeMaker freeMaker1 = FreeMaker.builder().url("https://spring.io/img/icons/microservices.svg").name("Microservices").content("Quickly deliver production‑grade features with independently evolvable microservices.").build();
            FreeMaker freeMaker2 = FreeMaker.builder().url("https://spring.io/img/icons/reactive.svg").name("Reactive").content("Spring's asynchronous, nonblocking architecture means you can get more from your computing resources.").build();
            FreeMaker freeMaker3 = FreeMaker.builder().url("https://spring.io/img/icons/cloud.svg").name("Cloud").content("Your code, any cloud—we’ve got you covered. Connect and scale your services, whatever your platform.").build();
            FreeMaker freeMaker4 = FreeMaker.builder().url("https://spring.io/img/icons/web-apps.svg").name("Web apps").content("Frameworks for fast, secure, and responsive web applications connected to any data store.").build();
            FreeMaker freeMaker5 = FreeMaker.builder().url("https://spring.io/img/icons/serverless.svg").name("Serverless").content("The ultimate flexibility. Scale up on demand and scale to zero when there’s no demand.").build();
            FreeMaker freeMaker6 = FreeMaker.builder().url("https://spring.io/img/icons/event-driven.svg").name("Event Driven").content("Integrate with your enterprise. React to business events. Act on your streaming data in realtime.").build();
            FreeMaker freeMaker7 = FreeMaker.builder().url("https://spring.io/img/icons/batch.svg").name("Batch").content("Automated tasks. Offline processing of data at a time to suit you.").build();
            lists.add(freeMaker1);
            lists.add(freeMaker2);
            lists.add(freeMaker3);
            lists.add(freeMaker4);
            lists.add(freeMaker5);
            lists.add(freeMaker6);
            lists.add(freeMaker7);
        }

        model.addAttribute("lists",lists);
        return "/test";

    }
}
