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

interface IShape {
    public void setWidth(int w);
    public void swtHeight(int h);
}
class Rectangle implements IShape {
    int height;
    int width;
    Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }
    @Override
    public void setDimension(int width,int height) { this.width = width; this.height = height; }
} class Square implements IShape {
    int side;
    Square(int side) {
        this.side = side;
    }

    @Override
    public void setWidth(int w) {
        this.side = w;
    }

    @Override
    public void swtHeight(int h) {
        this.w = w;
        this.h = h;
    }
}

Rectangle r = new Rectangle();

IShape r = new Square();
r.setHeight()

Sys


