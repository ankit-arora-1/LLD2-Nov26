package adapter.bankSDK;

public class HDFCBankAPI {
    public String getSessionToken(String authToken) {
        return "abc";
    }

    public int getBalanceOfUser(String sessionToken, String userId) {
        return 250;
    }

    public boolean transferMoney(int amount, String sessionToken, String userFrom, String userTo) {
        System.out.println("Money transferred");
        return true;
    }

    public String getAuthToken() {
        return "abc";
    }
}
