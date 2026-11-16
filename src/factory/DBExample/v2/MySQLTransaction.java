package factory.DBExample.v2;

public class MySQLTransaction implements Transaction {
    @Override
    public void execute() {
        System.out.println("Executing MYSQL transaction");
    }
}
