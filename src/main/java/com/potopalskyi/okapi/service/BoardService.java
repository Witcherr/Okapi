package com.potopalskyi.okapi.service;

import com.potopalskyi.okapi.entity.Board;
import org.springframework.stereotype.Service;

public interface BoardService {
    Board getBoard(long id);
}
