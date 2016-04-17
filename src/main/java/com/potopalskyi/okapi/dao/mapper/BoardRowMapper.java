package com.potopalskyi.okapi.dao.mapper;

import com.potopalskyi.okapi.entity.Board;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardRowMapper implements RowMapper<Board> {
    @Override
    public Board mapRow(ResultSet resultSet, int i) throws SQLException {
        Board board = new Board();
        board.setId(resultSet.getInt("ID"));
        board.setName(resultSet.getString("Name"));
        board.setGlobalType(resultSet.getString("GlobalType"));
        board.setRepoURL(resultSet.getString("RepoURL"));
        board.setUserId(resultSet.getInt("UserId"));
        return board;
    }
}
