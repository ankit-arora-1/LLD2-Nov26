package decorator.SimpleCoffeeExample.v1;

import java.util.List;

public class Coffee implements Beverage {
    private List<Addon> addons;

    public Coffee(List<Addon> addons) {
        this.addons = addons;
    }

    @Override
    public int cost() {
        int totalCost = 30;
        for (Addon addon : addons) {
            totalCost += addon.cost();
        }

        return totalCost;
    }

    @Override
    public String description() {
        String finalDesc = "Coffee";
        for (Addon addon : addons) {
            finalDesc += addon.description();
        }

        return finalDesc;
    }
}
