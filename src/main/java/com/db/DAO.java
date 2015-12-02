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

    public abstract void addUser(String name, String password, String role) throws SQLException;
    public abstract void deleteUser(String name) throws SQLException;
    public abstract void deleteUserById(Integer id) throws SQLException;
    public abstract List getUsersList() throws SQLException;
    public abstract List getAdminList() throws SQLException;
}
