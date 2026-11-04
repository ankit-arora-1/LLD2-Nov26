package solid;

public class Sparrow extends Bird implements Flyable {
    SlowFlying slowFlying;

    public Sparrow() {
        slowFlying = new SlowFlying();
    }
    @Override
    public void fly() {
        // slowFlying.slowFly();
    }
}
