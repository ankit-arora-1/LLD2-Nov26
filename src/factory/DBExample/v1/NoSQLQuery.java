package factory.DBExample.v1;

public class NoSQLQuery implements Query {
    private String query;

    public NoSQLQuery(String query) {
        // verify if query is correct or  not
        this.query = query;
    }

    @Override
    public void execute() {
        System.out.println("Executing NoSQL query: " + query);
    }
}
