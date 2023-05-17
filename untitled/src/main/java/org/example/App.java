package org.example;

import java.sql.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mysql";
        String username = "root";
        String password = "1724";

        try {
            //Pasul 2: Cream conectarea la baza de date
            Connection connection = DriverManager.getConnection(url, username, password);
            // Pasul 3: Cream instrucțiunile SQL pentru crearea tabelei Employee
            String creareaTabelei = "CREATE TABLE Employee (id INT PRIMARY KEY, name VARCHAR(45), name_family VARCHAR(45), age INT)";
            // Pasul 4: Executam instructiunele SQL pentru crearea tabelei
            Statement statement = connection.createStatement();
            String dropTable = "DROP TABLE IF EXISTS Employee";
            statement.executeUpdate(dropTable);
            statement.executeUpdate(creareaTabelei);
            System.out.println("Tabela Employee a fost creata ");
            // Pasul 5: Crearea instrucțiunii SQL pentru inserarea unei înregistrări în tabela Employee
            String insertRegistrarea = "INSERT INTO Employee  (id, name, name_family, age) VALUES(1,'Grigore', 'Borta', 37)";
            String insertRegistrarea1 = "INSERT INTO Employee (id, name, name_family, age) VALUES(2,'Vasile', 'Tofan', 31)";
            String insertRegistrarea2 = "INSERT INTO Employee (id, name, name_family, age) VALUES(3,'Artiom', 'Stratulat', 38)";

            // Pasul 6: Executam instrucțiunile SQL pentru inserare
            statement.executeUpdate(insertRegistrarea);
            statement.executeUpdate(insertRegistrarea1);
            statement.executeUpdate(insertRegistrarea2);

            System.out.println("Inregistrarea a fost adaugata");
            // Pasul 7: Creaream instrucțiuni SQL pentru a actualizarea unei înregistrări în tabela Employee
            String updateRegistrarea = "UPDATE Employee SET age = 40 WHERE id = 1";
            // Pasul 8: Executam instrucțiunile SQL pentru actualizare
            statement.executeUpdate(updateRegistrarea);
            System.out.println("Update sa facut cu succes");
            // Pasul 9: Cream instrucțiunii SQL pentru ștergerea unei înregistrări din tabela Employee
            String deleteRegistrare = "DELETE FROM Employee WHERE id = 1";
            // Pasul 10: Executarea instrucțiunii SQL pentru ștergere
            //statement.executeUpdate(deleteRegistrare);
            System.out.println("Stergerea sa facut cu succes");
            // Pasul 11: Închiderea conexiunii și instrucțiunii

            ResultSet resultSet = statement.executeQuery("SELECT * FROM EMPLOYEE");
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String name_family = resultSet.getString("name_family");
                int age = resultSet.getInt("age");
                System.out.println("Name: " + name + ", Fimaly: " + name_family + ", age: " + age);
            }

            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
