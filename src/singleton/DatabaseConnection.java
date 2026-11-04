package singleton;

public class DatabaseConnection {
    private String url;
    private String password;
    private int maxPoolSize;

    private static DatabaseConnection databaseConnection;

    private DatabaseConnection(String url, String password, int maxPoolSize) {
        this.url = url;
        this.password = password;
        this.maxPoolSize = maxPoolSize;
    }

    public static DatabaseConnection getInstance() {
        if(databaseConnection == null) {
            databaseConnection =
                    new DatabaseConnection("url", "password", 5);
        }

        return databaseConnection;
    }


}
