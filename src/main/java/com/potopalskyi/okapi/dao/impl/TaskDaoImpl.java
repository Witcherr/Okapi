package com.potopalskyi.okapi.dao.impl;

import com.potopalskyi.okapi.dao.TaskDao;
import com.potopalskyi.okapi.dao.mapper.TaskRowMapper;
import com.potopalskyi.okapi.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TaskDaoImpl implements TaskDao {

    private static final String SELECT_CERTAIN_TASK= "SELECT * FROM okapi.TASK where id = ?;";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Task getTask(long id) {
        return jdbcTemplate.queryForObject(SELECT_CERTAIN_TASK, new Object[]{id}, new TaskRowMapper());
    }
}
