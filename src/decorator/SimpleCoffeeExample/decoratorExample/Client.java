package decorator.SimpleCoffeeExample.decoratorExample;

public class Client {
    public static void main(String[] args) {
        Beverage order1  = new Coffee();
        System.out.println(order1.cost());
        System.out.println(order1.description());


       Beverage order2 = new Coffee(new Milk(new Coffee()));
       System.out.println(order2.cost());
       System.out.println(order2.description());

       Beverage order3 = new Sugar(new Coffee());
       System.out.println(order3.cost());
       System.out.println(order3.description());

       Beverage order4 = new Discount20(new Milk(new Sugar(new Coffee())));
       System.out.println(order4.cost());
       System.out.println(order4.description());
    }
}
