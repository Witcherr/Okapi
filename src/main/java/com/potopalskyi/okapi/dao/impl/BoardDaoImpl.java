package com.potopalskyi.okapi.dao.impl;

import com.potopalskyi.okapi.dao.BoardDao;
import com.potopalskyi.okapi.dao.mapper.BoardRowMapper;
import com.potopalskyi.okapi.entity.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDaoImpl implements BoardDao{

    private static final String SELECT_CERTAIN_BOARD = "SELECT * FROM okapi.BOARD where id = ?;";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Board getBoard(long id) {
        return jdbcTemplate.queryForObject(SELECT_CERTAIN_BOARD, new Object[]{id}, new BoardRowMapper());
    }
}
