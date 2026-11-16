package factory.DBExample.v1;

public class NoSQLQuery implements Query {
    private String query;

    public NoSQLQuery(String query) {
        this.query = query;
    }

    @Override
    public void execute() {
        System.out.println("Executing NoSQL query: " + query);
    }
}
