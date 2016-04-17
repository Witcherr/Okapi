package com.potopalskyi.okapi.dao;

import com.potopalskyi.okapi.entity.Task;

public interface TaskDao {
    Task getTask(long id);
}
