package tirwanda.dev.solid.dip;

public class CreditCard implements PaymentCard {

    @Override
    public void doTransaction(Long amount) {
        System.out.println("Payment using credit card..");
    }
}
