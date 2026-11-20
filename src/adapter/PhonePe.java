package adapter;

import adapter.bankSDK.HDFCBankAPI;
import adapter.bankSDK.ICICIBankAPI;

public class PhonePe {
//    BankAPI bankAPI = new HDFCBankAdapter();
    BankAPI bankAPI;

    public PhonePe(BankAPI bankAPI) {
        this.bankAPI = bankAPI;
    }

    public void sendMoney(String fromUser, String toUser, int amount) {
        bankAPI.transferMoney(fromUser, toUser, amount);
    }

}
