package solid;

public class Pigeon extends Bird implements Flyable {
    FlyingSpeed flyingSpeed;

    public Pigeon() {
        this.flyingSpeed = new SlowFlying();
    }

    @Override
    public void fly() {
        flyingSpeed.customFly();
    }
}
