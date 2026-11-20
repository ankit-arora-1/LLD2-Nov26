package facade;

public class OrderFacade {
    public void placeOrder() {
        System.out.println("Some order related code");
        Order order = new Order("1");
        InventoryService is = new InventoryService();
        is.updateInventory(order);

        InvoiceService invoiceService = new InvoiceService();
        invoiceService.generateInvoice(order);

        LoyaltyService loyaltyService = new LoyaltyService();
        loyaltyService.updateLoyalty(order);

        MailService mailService = new MailService();
        mailService.sendEmail(order);
    }
}
