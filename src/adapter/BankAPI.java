package adapter;

public interface BankAPI {
    public int fetchBalance(String userId);

    // Will throw an exception if something goes wrong during transfer
    public void transferMoney(String fromUser, String toUser, int amount);
}
