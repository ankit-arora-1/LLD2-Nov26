package singleton;

import javax.xml.crypto.Data;

public class Client {
    public static void main(String[] args) {
        System.out.println("Code is running");
        String status = DatabaseConnection.getDBStatus();
        System.out.println(status);

        System.out.println("Bunch of big code");

        if(false) {
            DatabaseConnection db = DatabaseConnection.getInstance();
        }
    }
}
