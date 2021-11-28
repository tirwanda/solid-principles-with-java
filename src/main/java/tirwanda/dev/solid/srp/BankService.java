package tirwanda.dev.solid.srp;

public class BankService {
    public Long deposit(Long amount, String accountNumber) {
        return 0L;
    }

    public Long withDraw(Long amount, String accountNumber) {
        return 0L;
    }

    public void printPassbook() {

    }

    public void getLoanInterestInfo(String loanType) {
        if (loanType.equals("homeLoan")) {

        } else if (loanType.equals("personalLoan")) {

        } else if (loanType.equals("car")) {

        }
    }

    public void sendOTP(String medium) {
        if (medium.equals("email")) {

        }
    }
}
