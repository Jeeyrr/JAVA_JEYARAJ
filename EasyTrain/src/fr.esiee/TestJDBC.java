package fr.esiee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJDBC {
    public static void main(String[] args) {

        String urlLocal= "jdbc:mariadb://localhost:3306/EasyTrain";
        String userLocal= "root";
        String pwdLocal= "";

        String urlDistant= "jdbc:mariadb://XXX";
        String userDistant= "XXX";
        String pwdDistant= "XXX";
// CREATION D'UNE CONNEXION A LA BDD
        try {
            Connection connection = DriverManager.getConnection(urlLocal, userLocal, pwdLocal);
            System.out.println("connexion OK");
        } catch (SQLException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
        }


    }
}
