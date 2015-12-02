package com.db;

import java.sql.SQLException;
import java.util.List;

public class ImplementsDAO extends DAO {
    @Override
    public void addUser(String name, String password, String role) throws SQLException {
        UsersEntity usersEntity = new UsersEntity(name, password, role);
        sessionFactory.getCurrentSession().save(usersEntity);
    }

    @Override
    public void deleteUser(String name) throws SQLException {
        //sessionFactory.getCurrentSession().delete();
    }

    @Override
    public void deleteUserById(Integer id) throws SQLException {

    }

    @Override
    public List getUsersList() throws SQLException {
        return null;
    }

    @Override
    public List getAdminList() throws SQLException {
        return null;
    }
}
