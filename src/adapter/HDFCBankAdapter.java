package adapter;

import adapter.bankSDK.HDFCBankAPI;

public class HDFCBankAdapter implements BankAPI {
    private HDFCBankAPI hdfcBankAPI;
    public HDFCBankAdapter() {
        hdfcBankAPI = new HDFCBankAPI();
    }

    @Override
    public int fetchBalance(String userId) {
        return 0;
    }

    @Override
    public void transferMoney(String fromUser, String toUser, int amount) {

    }
}
