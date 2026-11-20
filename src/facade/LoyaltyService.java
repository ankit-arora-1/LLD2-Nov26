package facade;

public class LoyaltyService {
    public void updateLoyalty(Order order) {
        System.out.println("Loyalty updated for "+order.getId());
    }
}
