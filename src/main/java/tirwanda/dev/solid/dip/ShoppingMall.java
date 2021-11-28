package tirwanda.dev.solid.dip;

public class ShoppingMall {

    // private DebitCard debitCard;
    private PaymentCard paymentCard;

//    public ShoppingMall(DebitCard debitCard) {
//        this.debitCard = debitCard;
//    }

    public ShoppingMall(PaymentCard paymentCard) {
        this.paymentCard = paymentCard;
    }

    public void doPurchase(Long amount){
//        debitCard.doTransaction(amount);
        paymentCard.doTransaction(amount);
    }

    public static void main(String[] args) {
//        DebitCard debitCard = new DebitCard();
        PaymentCard paymentCard = new DebitCard();
        ShoppingMall shoppingMall = new ShoppingMall(paymentCard);

        shoppingMall.doPurchase(100L);
    }

}
