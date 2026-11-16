package factory.DBExample.v2;

// Abstract factory
public interface DatabaseFactory {
    public Database getDatabase();
    public TransactionManager createTransactionManager();

    // Below can be done as well, if Database and TransactionManager
    // interfaces only have these methods
//    public Query createQuery();
//    public Transaction createTransaction();
}
