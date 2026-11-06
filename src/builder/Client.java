package builder;

public class Client {
    public static void main(String[] args) {
//        Student student =
//                new Student(1, "Abhishek", "LLD", "123", "asdas", "asdas", 50, 2);

        Builder builder = new Builder();
        builder.setId(-1);
        builder.setName("Abhishek");
        builder.setPassword("abc");

        Student student = new Student(builder);
    }
}
