package com.db;

import java.sql.SQLException;
import java.util.List;

public class ImplementsDAO extends DAO {
    @Override
    public UsersEntity getUser(String login) throws SQLException {
        String SQL_QUERY = "SELECT * FROM Users WHERE Users.login = " + login;
        return (UsersEntity) sessionFactory.getCurrentSession().createSQLQuery(SQL_QUERY).list().get(0);
    }

    @Override
    public UsersEntity getUserById(Integer id) throws SQLException {
        String SQL_QUERY = "SELECT * FROM Users WHERE Users.id = " + id;
        return (UsersEntity) sessionFactory.getCurrentSession().createSQLQuery(SQL_QUERY).list().get(0);
    }

    @Override
    public void addUser(String login, String password, Integer id_role) throws SQLException {
        UsersEntity usersEntity = new UsersEntity(login, password, id_role);
        sessionFactory.getCurrentSession().save(usersEntity);
    }

    @Override
    public void deleteUser(String login) throws SQLException {
        String SQL_QUERY = "DELETE FROM Users WHERE Users.login = " + login;
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
        String SQL_QUERY = "SELECT * FROM Users WHERE Users.id_roles = " + 2;
        return sessionFactory.getCurrentSession().createSQLQuery(SQL_QUERY).list();
    }

    @Override
    public List getAdminList() throws SQLException {
        String SQL_QUERY = "SELECT * FROM Users WHERE Users.id_roles = " + 1;
        return sessionFactory.getCurrentSession().createSQLQuery(SQL_QUERY).list();
    }

    @Override
    public List getListPages(UsersEntity usersEntity) throws SQLException {
        String SQL_QUERY = "SELECT P.path, A.title FROM Pages P, (SELECT id_roles FROM Users WHERE id_users = " +
                usersEntity.getId_users() +
                ") U, Access A WHERE P.id_roles = U.id_roles AND P.id_access = A.id_access;";
        return sessionFactory.getCurrentSession().createSQLQuery(SQL_QUERY).list();
    }

    @Override
    public List getListPages(String id) throws SQLException {
        String SQL_QUERY = "SELECT P.path, A.title FROM Pages P, (SELECT id_roles FROM Users WHERE id_users = " +
                Integer.parseInt(id) +
                ") U, Access A WHERE P.id_roles = U.id_roles AND P.id_access = A.id_access;";
        return sessionFactory.getCurrentSession().createSQLQuery(SQL_QUERY).list();
    }
}
