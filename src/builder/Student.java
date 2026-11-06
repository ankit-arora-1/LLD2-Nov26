package builder;

public  class Student {
    private int id;
    private String name;
    private String batch;
    private String phone;
    private String username;
    private String password;
    private int psp;
    private int buddyId;

    public static class Builder {
        private int id;
        private String name;
        private String batch;
        private String phone;
        private String username;
        private String password;
        private int psp;
        private int buddyId;

        public int getId() {
            return id;
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public String getPhone() {
            return phone;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public String getUsername() {
            return username;
        }

        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }

        public String getPassword() {
            return password;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public int getPsp() {
            return psp;
        }

        public void setPsp(int psp) {
            this.psp = psp;
        }

        public int getBuddyId() {
            return buddyId;
        }

        public void setBuddyId(int buddyId) {
            this.buddyId = buddyId;
        }

        public Student build() {
            return new Student(this);
        }
    }

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

    private Student(Builder builder) {
        if(builder.getId() < 0) {
            throw new RuntimeException("Id cannpt be less than zero");
        }

        this.id = builder.getId();
        this.name = builder.getName();
        this.buddyId = builder.getBuddyId();
    }

    public static Builder getBuilder() {
        return new Builder();
    }
}
