package com.potopalskyi.okapi.service.impl;

import com.potopalskyi.okapi.dao.TaskDao;
import com.potopalskyi.okapi.dao.impl.TaskDaoImpl;
import com.potopalskyi.okapi.entity.Task;
import com.potopalskyi.okapi.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskDao taskDao;

    @Override
    public Task getTask(long id) {
        return taskDao.getTask(id);
    }
}
