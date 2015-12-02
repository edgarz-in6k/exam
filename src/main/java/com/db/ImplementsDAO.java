package com.db;

import java.sql.SQLException;
import java.util.List;

public class ImplementsDAO implements DAO {
    @Override
    public void addUser(String name, String password, Integer id_roles) throws SQLException {

    }

    @Override
    public void deleteUser(String name) throws SQLException {

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
