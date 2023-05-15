import java.sql.*;

public class Main {
    public static void main(String[] args) {
        // Pasul 1: Adresa de conectare la baza de date
        String url = "jdbc:h2:mem:default";

            try {
                //Pasul 2: Cream conectarea la baza de date
                Connection connection = DriverManager.getConnection(url);
                // Pasul 3: Cream instrucțiunile SQL pentru crearea tabelei Employee
                String creareaTabelei = "CREATE TABLE Employee (id INT PRIMARY KEY, name VARCHAR(45), name_family VARCHAR(45), age INT)";
                // Pasul 4: Executam instructiunele SQL pentru crearea tabelei
                Statement statement = connection.createStatement();
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
                String deleteRegistrare ="DELETE FROM Employee WHERE id = 1";
                // Pasul 10: Executarea instrucțiunii SQL pentru ștergere
                statement.executeUpdate(deleteRegistrare);
                System.out.println("Stergerea sa facut cu succes");
                // Pasul 11: Închiderea conexiunii și instrucțiunii
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }
}