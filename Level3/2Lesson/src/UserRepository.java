package ru.geekbrains.server.persistance;

import ru.geekbrains.server.User;

import java.sql.Connection;
import java.util.List;

public class UserRepository {

    private final Connection conn;

    public UserRepository(Connection conn) {
        this.conn = conn;
        // TODO создать таблицу пользователей, если она еще не создана
        Statement stmt = null;

        try {
            stmt = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
            return;
        }

        try {
            ResultSet rs = stmt.executeQuery("SELECT count(*) FROM sqlite_master WHERE type='table' AND name='users'");
            while (rs.next()) {
                if (rs.getInt(1) == 0) {
                    // Создать таблицу пользователей.
                    Statement updateStmt = conn.createStatement();
                    int result = stmt.executeUpdate("CREATE TABLE \"users\" (\n" +
                            "\t\"id\"\tINTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE,\n" +
                            "\t\"login\"\tTEXT NOT NULL UNIQUE,\n" +
                            "\t\"password\"\tTEXT NOT NULL DEFAULT ''\n" +
                            ")");

                    if (result == 1) {
                        System.out.println("Таблица users создана.");
                    }
                } else System.out.println("Таблица пользователей существует, переходим к авторизации пользователя.");
            }

    public void insert(User user) {
        // TODO добавить нового пользователя в БД
        Statement updateStmt = null;
        try {
            updateStmt = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();

            return;
        }

        try {
            int result = updateStmt.executeUpdate(String.format("INSERT INTO users (login, password) VALUES ('%s', '%s')", user.getLogin(), user.getPassword()));
            if (result == 1) {
                System.out.println("Пользователель добавлен.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public User findByLogin(String login) {
        // TODO найти пользователя в БД по логину
        boolean result = false;

        Statement stmt = null;
        try {
            stmt = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(String.format("SELECT login FROM users WHERE login = '%s' AND password = '%s'", login, password));

            while (rs.next()) {
                result = true;
            }

            return result;

        } catch (SQLException e) {
            e.printStackTrace();

            return false;
        }
    }

    public List<User> getAllUsers() {
        // TODO извлечь из БД полный список пользователей
        List<User> allUsers = new ArrayList();

        Statement stmt = null;
        try {
            stmt = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery("SELECT id, login, password FROM users");

            while (rs.next()) {
                allUsers.add(new User(rs.getInt(1), rs.getString(2), rs.getString(3)));
            }

            return allUsers;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    public boolean authByLoginPassword(String login, String password) {
        // TODO найти пользователя в БД по логину


        boolean result = false;

        Statement stmt = null;
        try {
            stmt = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(String.format("SELECT login FROM users WHERE login = '%s' AND password = '%s'", login, password));

            while (rs.next()) {
                result = true;
            }

            return result;

        } catch (SQLException e) {
            e.printStackTrace();

            return false;
        }
    }
}
