package com.potopalskyi.okapi.controller;

import com.potopalskyi.okapi.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.apache.log4j.Logger;

@Controller
public class BoardController {
    //private int visitorCount = 0;
    public static final Logger log = Logger.getLogger(BoardController.class);

    @Autowired
    BoardService boardService;

//    @RequestMapping("/index.html")
//    public String index(Model model) {
//        model.addAttribute("visitorCount", visitorCount++);
//        log.info("Test visitCount count = " + visitorCount);
//        return "index";
//    }

    @RequestMapping(value = "/board/{id}", method = RequestMethod.GET)
    public String getBoard(Model model, @PathVariable("id") Integer id){
        model.addAttribute("boardModel", boardService.getBoard(id));
        log.info("Get board with boardid =" + id);
        return "board";
    }
}

