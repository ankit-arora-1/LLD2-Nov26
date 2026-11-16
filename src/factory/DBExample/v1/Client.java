package factory.DBExample.v1;

public class Client {
    public static void main(String[] args) {

        Database database = new MySQLDB();
        Query query = database.createQuery("update user");
        query.execute();
    }
}
