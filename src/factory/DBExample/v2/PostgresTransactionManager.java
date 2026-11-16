package factory.DBExample.v2;

public class PostgresTransactionManager implements TransactionManager {
    @Override
    public PostgresTransaction createTransaction() {
        return new PostgresTransaction();
    }
}
