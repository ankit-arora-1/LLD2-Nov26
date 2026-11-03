package solid;

public class Client {
    public static void makeBirdFly(Flyable bird) {
        System.out.println("Bird is about to take flight");
        bird.fly();
        System.out.println("Bird is flying now");
    }

    public static void main(String[] args) {
        Flyable sparrow = new Sparrow();
        Flyable pigeon = new Pigeon();
        Flyable crow = new Crow();
        Bird penguin = new Penguin();

        makeBirdFly(sparrow);
        makeBirdFly(pigeon);
       // makeBirdFly(penguin);
        makeBirdFly(crow);

        // Do not suprise your client
    }
}








