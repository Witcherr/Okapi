package com.potopalskyi.okapi.dao.mapper;

import com.potopalskyi.okapi.entity.Task;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TaskRowMapper implements RowMapper<Task> {
    @Override
    public Task mapRow(ResultSet resultSet, int i) throws SQLException {
        Task task = new Task();
        task.setId(resultSet.getInt("id"));
        task.setTitle(resultSet.getString("title"));
        task.setDescription(resultSet.getString("description"));
        task.setPriority(resultSet.getString("priority"));
        task.setComplexity(resultSet.getInt("complexity"));
        task.setBoardId(resultSet.getInt("boardid"));
        task.setCategory(resultSet.getString("category"));
        return task;
    }
}
