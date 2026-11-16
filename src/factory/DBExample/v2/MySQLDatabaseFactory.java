package factory.DBExample.v2;

public class MySQLDatabaseFactory implements DatabaseFactory {
    @Override
    public Database getDatabase() {
        return new MySQLDB();
    }

    @Override
    public TransactionManager createTransactionManager() {
        return new MySQLTransactionManager();
    }
}
