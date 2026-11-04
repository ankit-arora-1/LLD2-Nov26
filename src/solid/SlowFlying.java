package solid;

public class SlowFlying implements FlyingSpeed {
    @Override
    public void customFly() {
        System.out.println("Slow flying");
    }
}
