package tirwanda.dev.solid.ocp;

public interface NotificationService {
    public void sendOTP(String medium);
    public void transactionReport(String medium);
}
