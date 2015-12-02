package com.db;

import java.sql.SQLException;
import java.util.List;

public interface DAO {
    public abstract void addUser(String name, String password, Integer id_roles) throws SQLException;
    public abstract void deleteUser(String name) throws SQLException;
    public abstract void deleteUserById(Integer id) throws SQLException;
    public abstract List getUsersList() throws SQLException;
    public abstract List getAdminList() throws SQLException;
}
