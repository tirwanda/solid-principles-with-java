package tirwanda.dev.solid.dip;

public class DebitCard implements PaymentCard{

    @Override
    public void doTransaction(Long amount) {
        System.out.println("Payment using debit card..");
    }
}
