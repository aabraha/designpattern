public class MasterCardPayment implements CreditCardPayment {
    @Override
    public void pay() {
        System.out.println("Processing payment with MasterCard");
    }
}