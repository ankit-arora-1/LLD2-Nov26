package factory.DBExample.v2;

public class MySQLTransactionManager implements TransactionManager {
    @Override
    public MySQLTransaction createTransaction() {
        return new MySQLTransaction();
    }
}
