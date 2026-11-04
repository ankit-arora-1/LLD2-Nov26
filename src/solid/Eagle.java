package solid;

public class Eagle extends Bird implements Flyable {
    FastFlying fastFlying;

    public Eagle() {
        this.fastFlying = new FastFlying();
    }
    @Override
    public void fly() {
        // fastFlying.fastFly();
    }
}
