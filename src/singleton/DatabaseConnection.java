package singleton;

public class DatabaseConnection {
    private String url;
    private String password;
    private int maxPoolSize;

    // Read url, password, etc from a config file
    // Eager or early loading
    private static DatabaseConnection databaseConnection;

    private DatabaseConnection(String url, String password, int maxPoolSize) {
        this.url = url;
        this.password = password;
        this.maxPoolSize = maxPoolSize;
    }

    public static DatabaseConnection getInstance() {


            // Double locking
            if(databaseConnection == null) {
                synchronized (DatabaseConnection.class) {
                    if(databaseConnection == null) {
                        databaseConnection =
                                new DatabaseConnection("url", "password",5);
                    }
                }

            }

            return databaseConnection;

    }

    public static String getDBStatus() {
        return "dbstatus";
    }


}
