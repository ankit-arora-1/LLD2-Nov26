package facade;

public class MobileClient {
    public static void main(String[] args) {
        System.out.println("Some non order related code");
        System.out.println("Some non order related code");
        System.out.println("Some non order related code");

        OrderFacade orderFacade = new OrderFacade();
        orderFacade.placeOrder();

        System.out.println("Some non order related code");
        System.out.println("Some non order related code");
        System.out.println("Some non order related code");

    }
}
