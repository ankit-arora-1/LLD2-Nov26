package prototype;

public class Student implements Prototype<Student> {
    private int age;
    private String name;
    private int psp;
    private String batchName;

    private int state;

    public Student() {
    }

    public Student(Student student) {
        this.age = student.age;
        this.name = student.name;
        this.psp = student.psp;
        this.batchName = student.batchName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPsp() {
        return psp;
    }

    public void setPsp(int psp) {
        this.psp = psp;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    @Override
    public Student copy() {
       return new Student(this);
    }
}
