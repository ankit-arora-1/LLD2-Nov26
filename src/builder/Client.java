package builder;

public class Client {
    public static void main(String[] args) {
//        Student student =
//                new Student(1, "Abhishek", "LLD", "123", "asdas", "asdas", 50, 2);
//
//        Builder builder = new Builder();
//        builder.setId(-1);
//        builder.setName("Abhishek");
//        builder.setPassword("abc");
//
//        Student student = new Student(builder);


        // Step 1
//        Builder builder = Student.getBuilder();
//        builder.setId(1);
//        builder.setName("asas");
//        builder.setPassword("asdas");
//
//        Student student = new Student(builder);

        // Step 2
//       Builder builder = Student
//               .getBuilder()
//               .setId(1)
//               .setName("asdas")
//               .setPassword("Asdas");
//
//       Student student = new Student(builder);


        // Step 3
        Student student = Student
                .getBuilder()
                .setId(1)
                .setUsername("Asdas")
                .setBatch("Asdas")
                .setPassword("Asdas")
                .build();

        // Not allowed
        // Student.Builder builder = new Student.Builder();

//        Student student = new Student(null);
//
//        Student.Builder builder = student.new Builder();
    }
}
