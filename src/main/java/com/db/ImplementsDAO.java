package com.db;

import java.sql.SQLException;
import java.util.List;

public class ImplementsDAO extends DAO {
    @Override
    public UsersEntity getUser(String name) throws SQLException {
        String SQL_QUERY = "SELECT * FROM Users WHERE Users.name = " + name;
        return (UsersEntity) sessionFactory.getCurrentSession().createSQLQuery(SQL_QUERY).list().get(0);
    }

    @Override
    public UsersEntity getUserById(Integer id) throws SQLException {
        String SQL_QUERY = "SELECT * FROM Users WHERE Users.id = " + id;
        return (UsersEntity) sessionFactory.getCurrentSession().createSQLQuery(SQL_QUERY).list().get(0);
    }

    @Override
    public void addUser(String name, String password, String role) throws SQLException {
        UsersEntity usersEntity = new UsersEntity(name, password, role);
        sessionFactory.getCurrentSession().save(usersEntity);
    }

    @Override
    public void deleteUser(String name) throws SQLException {
        String SQL_QUERY = "DELETE FROM Users WHERE Users.name = " + name;
        sessionFactory.getCurrentSession().createSQLQuery(SQL_QUERY);
    }

    @Override
    public void deleteUserById(Integer id) throws SQLException {
        String SQL_QUERY = "DELETE FROM Users WHERE Users.id = " + id;
        sessionFactory.getCurrentSession().createSQLQuery(SQL_QUERY);
    }

    @Override
    public List getList() throws SQLException {
        String SQL_QUERY = "SELECT * FROM Users";
        return sessionFactory.getCurrentSession().createSQLQuery(SQL_QUERY).list();
    }

    @Override
    public List getUsersList() throws SQLException {
        String SQL_QUERY = "SELECT * FROM Users WHERE Users.role = " + "USER";
        return sessionFactory.getCurrentSession().createSQLQuery(SQL_QUERY).list();
    }

    @Override
    public List getAdminList() throws SQLException {
        String SQL_QUERY = "SELECT * FROM Users WHERE Users.role = " + "ADMIN";
        return sessionFactory.getCurrentSession().createSQLQuery(SQL_QUERY).list();
    }
}
