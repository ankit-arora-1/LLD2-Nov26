package singleton;

import javax.xml.crypto.Data;

public class Client {
    public static void main(String[] args) {
        DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
        DatabaseConnection databaseConnection1 = DatabaseConnection.getInstance();
    }
}
