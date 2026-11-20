package adapter.bankSDK;

public class ICICIBankAPI {
    public int getBalance(String auth) {
        return 100;
    }

    public void transferMoney(String userFrom, String userTo, int amount, String auth) {
        System.out.println("Money transferred from " + userFrom + " to " + userTo);
    }

    public String generateAuthToken(String secretKey) {
        return "abc";
    }
}
