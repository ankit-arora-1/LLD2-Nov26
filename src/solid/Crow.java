package solid;

public class Crow extends Bird implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Crow is flying");
    }

    @Override
    public void swim() {

    }
}
