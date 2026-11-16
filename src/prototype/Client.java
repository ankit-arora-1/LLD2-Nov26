package prototype;

public class Client {
    public Student createCopy(Student student) {
        return student.copy();

    }



    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();

        Student lld = new Student();
        lld.setBatchName("lld");
        studentRegistry.set("lld", lld);

        Student devops = new Student();
        devops.setBatchName("devops");
        studentRegistry.set("devops", devops);

        Student lldStudent = studentRegistry.get("lld");
        lldStudent.setPsp(12);
    }
}
