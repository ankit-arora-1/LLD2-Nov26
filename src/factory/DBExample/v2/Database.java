package factory.DBExample.v2;

public interface Database {

    // This is a factory method whose job is to create different kinds of query objects
    public Query createQuery(String query);


    // might have other non factory methods
//    public void log();
//
//    public String getVersionNumber();
//
//    public void updateDBClient();
}
