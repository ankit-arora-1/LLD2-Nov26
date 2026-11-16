package factory.DBExample.v1;

public class SQLQuery implements Query {
    private String query;

    public SQLQuery(String query) {
        this.query = query;
    }

    @Override
    public void execute() {
        System.out.println("Executing SQL query: " + query);
    }
}
