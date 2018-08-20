package ua.training.model.dao;

import ua.training.model.entity.User;

public interface UserDao {
    User getById(int id);
}
