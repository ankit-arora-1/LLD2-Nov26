package factory.DBExample.v2;

public class PostgresTransaction implements Transaction {
    @Override
    public void execute() {
        System.out.println("Executing POSTGRES transaction");
    }
}
