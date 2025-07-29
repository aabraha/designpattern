public class Order {
    private String orderNumber;
    private String state;
    private double totalPrice;
    private CreditCard creditCard;
    private CreditCardPayment creditCardPayment;

    public Order(String orderNumber, double totalPrice, CreditCard creditCard) {
        this.orderNumber = orderNumber;
        this.totalPrice = totalPrice;
        this.creditCard = creditCard;
        this.state = "pending";
    }

    public void setCreditCardPayment(CreditCardPayment creditCardPayment) {
        this.creditCardPayment = creditCardPayment;
    }

    public void pay() {
        if (creditCardPayment != null) {
            creditCardPayment.pay();
            this.state = "paid";
            System.out.println("Order " + orderNumber + " paid successfully. Total: $" + totalPrice);
        } else {
            System.out.println("No payment strategy set for order " + orderNumber);
        }
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public String getState() {
        return state;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }
}