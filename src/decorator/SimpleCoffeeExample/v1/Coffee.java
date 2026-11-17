package decorator.SimpleCoffeeExample.v1;

import java.util.List;

public class Coffee implements Beverage {
    private List<Addon> addons;

    public Coffee(List<Addon> addons) {
        this.addons = addons;
    }

    @Override
    public int cost() {
        int totalCost = 30; // cost of coffee
        for(Addon addon: addons) {
            totalCost += addon.cost();
        }

        return totalCost;
    }

    @Override
    public String description() {
        StringBuilder finalDesc = new StringBuilder("Coffee ");
        for(Addon addon: addons) {
            finalDesc.append(addon.description()).append(" ");
        }

        return finalDesc.toString();
    }
}
