package com.potopalskyi.okapi.controller;

import com.potopalskyi.okapi.service.TaskService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TaskController {

    @Autowired
    private TaskService taskService;

    private static final Logger log = Logger.getLogger(TaskController.class);

    @RequestMapping(value = "task/{id}", method = RequestMethod.GET)
    public String getTask(Model model, @PathVariable("id") int id){
        model.addAttribute("taskModel", taskService.getTask(id));
        log.info("Get task with taskid =" + id);
        return "task";
    }
}
