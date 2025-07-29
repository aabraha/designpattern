public class Application {
    public static void main(String[] args) {
        // Create credit cards
        CreditCard visaCard = new CreditCard("Visa", "4111111111111111", "12/25", "123");
        CreditCard masterCard = new CreditCard("MasterCard", "5555555555554444", "10/24", "456");

        // Create orders
        Order order1 = new Order("ORD-001", 150.00, visaCard);
        Order order2 = new Order("ORD-002", 75.50, masterCard);

        // Demonstrate Strategy Pattern with Visa payment
        System.out.println("=== Processing Order 1 with Visa ===");
        order1.setCreditCardPayment(new VisaPayment());
        order1.pay();

        System.out.println("\n=== Processing Order 2 with MasterCard ===");
        order2.setCreditCardPayment(new MasterCardPayment());
        order2.pay();

        // Demonstrate switching strategies
        System.out.println("\n=== Switching payment strategy for Order 1 ===");
        order1.setCreditCardPayment(new MasterCardPayment());
        order1.pay();
    }
}