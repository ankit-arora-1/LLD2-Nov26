package factory.DBExample.v1;

public class PostgresDB implements Database {
    @Override
    public SQLQuery createQuery(String query) {
        return new SQLQuery(query);
    }
}
