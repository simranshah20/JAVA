package in.kgcoding.challange71;

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("374836","Simran");
        account.depositMoney(3000);
        System.out.println(account.withdrawMoney(200));
        account.depositMoney(-4);
        account.withdrawMoney(0);
    }
}
