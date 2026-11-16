package factory.DBExample.v2;

public class MySQLDB implements Database {
    @Override
    public SQLQuery createQuery(String query) {
        return new SQLQuery(query);
    }
}
