package solid;

public class Crow extends Bird implements Flyable, Swimmable {
    FlyingSpeed flyingSpeed;

    public Crow(FlyingSpeed flyingSpeed) {
        this.flyingSpeed = flyingSpeed;
    }

    @Override
    public void fly() {
        flyingSpeed.customFly();
    }

    @Override
    public void swim() {

    }
}
