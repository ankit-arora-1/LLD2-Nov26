package clone;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student = new Student();
        Student copy = (Student) student.clone();
    }
}
