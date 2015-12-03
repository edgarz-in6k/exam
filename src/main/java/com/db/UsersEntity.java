package com.db;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "Users")
public class UsersEntity {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id_users")
    private Integer id_users;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "id_roles")
    private Integer id_roles;

    public UsersEntity() {

    }

    public UsersEntity(String login, String password, Integer id_roles) {
        this.login = login;
        this.password = password;
        this.id_roles = id_roles;
    }

    public Integer getId_users() {
        return id_users;
    }

    public void setId_users(Integer id_users) {
        this.id_users = id_users;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId_roles() {
        return id_roles;
    }

    public void setId_roles(Integer id_roles) {
        this.id_roles = id_roles;
    }
}
