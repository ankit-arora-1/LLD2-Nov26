package factory.DBExample.v2;

public class PostgresDatabaseFactory implements DatabaseFactory {
    @Override
    public Database getDatabase() {
        return new PostgresDB();
    }

    @Override
    public PostgresTransactionManager createTransactionManager() {
        return new PostgresTransactionManager();
    }
}
