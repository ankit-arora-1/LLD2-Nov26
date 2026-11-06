package builder;

public class Student {
    private int id;
    private String name;
    private String batch;
    private String phone;
    private String username;
    private String password;
    private int psp;
    private int buddyId;

//    public Student(int id,
//                   String name,
//                   String batch,
//                   String phone,
//                   String username,
//                   String password,
//                   int psp,
//                   int buddyId) {
//        if(id < 0) {
//            throw new RuntimeException("Id cannpt be less than zero");
//        }
//
//        this.id = id;
//        this.name = name;
//        this.batch = batch;
//        this.phone = phone;
//        this.username = username;
//        this.password = password;
//        this.psp = psp;
//    }

    public Student(Builder builder) {
        if(builder.getId() < 0) {
            throw new RuntimeException("Id cannpt be less than zero");
        }

        this.id = builder.getId();
        this.name = builder.getName();
        this.buddyId = builder.getBuddyId();
    }
}
