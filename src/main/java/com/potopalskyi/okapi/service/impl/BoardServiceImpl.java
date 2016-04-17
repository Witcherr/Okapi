package com.potopalskyi.okapi.service.impl;

import com.potopalskyi.okapi.dao.BoardDao;
import com.potopalskyi.okapi.dao.impl.BoardDaoImpl;
import com.potopalskyi.okapi.entity.Board;
import com.potopalskyi.okapi.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService{
    //private BoardDao boardDao = new BoardDaoImpl();
    @Autowired
    private BoardDao boardDao;

    @Override
    public Board getBoard(long id) {
        return boardDao.getBoard(id);
    }
}
