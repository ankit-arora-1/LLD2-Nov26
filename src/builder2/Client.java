package builder2;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        Student student = Student
                .getBuilder()
                .setId(1)
                .setName("Abhishek")
                .addPhoneNumber("9876543210")
                .addPhoneNumber("9123456780")
                .build();

        System.out.println(student);

        Student student2 = Student
                .getBuilder()
                .setId(2)
                .setName("Ankit")
                .setPhoneNumbers(List.of("9999999999", "8888888888"))
                .build();

        System.out.println(student2);
    }
}
