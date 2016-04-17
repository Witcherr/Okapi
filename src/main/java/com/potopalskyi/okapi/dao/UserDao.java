package com.potopalskyi.okapi.dao;

import com.potopalskyi.okapi.entity.User;

public interface UserDao {
    User getAllUsers();

    User getUser(long id);
}
