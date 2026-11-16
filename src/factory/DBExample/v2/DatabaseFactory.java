package factory.DBExample.v2;

public interface DatabaseFactory {
    public Database getDatabase();
    public TransactionManager createTransactionManager();
}
