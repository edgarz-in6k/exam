package com.db;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;

@Transactional
public abstract class DAO {

    @Autowired
    public SessionFactory sessionFactory;

    public abstract UsersEntity getUser(String login) throws SQLException;
    public abstract UsersEntity getUserById(Integer id) throws SQLException;
    public abstract void addUser(String login, String password, Integer id_role) throws SQLException;
    public abstract void deleteUser(String login) throws SQLException;
    public abstract void deleteUserById(Integer id) throws SQLException;
    public abstract List getList() throws SQLException;
    public abstract List getUsersList() throws SQLException;
    public abstract List getAdminList() throws SQLException;
    public abstract List getListPages(UsersEntity usersEntity) throws SQLException;
    public abstract List getListPages(String id) throws SQLException;
}
