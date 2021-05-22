package az.none.javalessons.lesson_15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample {

    private static final String url = "jdbc:postgresql://localhost:5432/group_4";
    private static final String username = "postgres";
    private static final String password = "root";
    private static Connection con = null;
    private static Statement st = null;

    public static void main(String[] args) {
        con = getConnection();
        st = createStatement(con);
        insert(st);
    }

    private static void insert(Statement statement) {
        Loader.load()
                .forEach(person -> {
                    try {
                        int status = statement.executeUpdate(String.format("" +
                                        "INSERT INTO q4.person (p_id, p_name, p_surname, p_age)\n" +
                                        "VALUES (%s, '%s', '%s', %s);",
                                person.getId(),
                                person.getName(),
                                person.getSurname(),
                                person.getAge()));
                        if (status == 1)
                            System.out.printf("Successfully inserted. POJO : %s%n", person);
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                });
    }

    private static Connection getConnection() {
        System.out.println("Try to connect postgresql db.");
        try {
            con = DriverManager.getConnection(url, username, password);
            System.out.println("Successfully connected");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return con;
    }

    private static Statement createStatement(Connection connection) {
        System.out.println("Try to connect postgresql statement.");
        try {
            st = connection.createStatement();
            System.out.println("Successfully connected");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return st;
    }
}
