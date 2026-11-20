package adapter;

import adapter.bankSDK.ICICIBankAPI;

public class ICICIBankAdapter implements BankAPI {
    private ICICIBankAPI iciciBankAPI;
    public ICICIBankAdapter() {
        iciciBankAPI = new ICICIBankAPI();
    }

    @Override
    public int fetchBalance(String userId) {
       String authToken = iciciBankAPI.generateAuthToken("secret");
       int amount = iciciBankAPI.getBalance(authToken);
       return amount;
    }

    @Override
    public void transferMoney(String fromUser, String toUser, int amount) {
        String authToken = iciciBankAPI.generateAuthToken("secret");
        iciciBankAPI.transferMoney(fromUser, toUser, amount, authToken);
    }
}
