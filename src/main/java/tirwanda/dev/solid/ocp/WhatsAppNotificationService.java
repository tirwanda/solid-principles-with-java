package tirwanda.dev.solid.ocp;

public class WhatsAppNotificationService implements NotificationService{
    @Override
    public void sendOTP(String medium) {
        // Logic to send OTP to WhatsApp
    }

    @Override
    public void transactionReport(String medium) {
        // Logic to send Transaction Report to WhatsApp
    }
}
