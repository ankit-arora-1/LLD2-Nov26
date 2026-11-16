package factory.DBExample.v2;

public class Client {
    public static void main(String[] args) {
        DatabaseFactory databaseFactory = new PostgresDatabaseFactory();
        Database database = databaseFactory.getDatabase();
        TransactionManager transactionManager = databaseFactory
                .createTransactionManager();

        Query query = database.createQuery("update user");
        query.execute();

        Transaction transaction = transactionManager.createTransaction();
        transaction.execute();


    }
}
