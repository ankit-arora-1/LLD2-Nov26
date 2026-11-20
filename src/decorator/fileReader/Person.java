package decorator.fileReader;

import java.io.Serializable;

public class Person implements Serializable  {
    private static final long serialVersionUID = 1L;
    String name;
    String batch;

    Person(String name, String batch) { this.name = name; this.batch = batch; }

    public String toString() { return "Person{name=" + name + ", batch=" + batch + "}"; }
}
