package factory.DBExample.v2;

public class MongoDB implements Database {
    @Override
    public NoSQLQuery createQuery(String query) {
        return new NoSQLQuery(query);
    }
}
