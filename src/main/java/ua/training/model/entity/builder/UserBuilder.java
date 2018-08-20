package ua.training.model.entity.builder;

import ua.training.model.entity.Role;
import ua.training.model.entity.User;

public class UserBuilder {
    private Integer id;
    private String login;
    private String password;
    private Role role;

    public UserBuilder setId(Integer id) {
        this.id = id;
        return this;
    }

    public UserBuilder setLogin(String login) {
        this.login = login;
        return this;
    }

    public UserBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    public UserBuilder setRole(Role role) {
        this.role = role;
        return this;
    }

    public User createUser() {
        return new User(id, login, password, role);
    }
}