package gr.aueb.cf.ch11;

public class AccountApp {

    public static void main(String[] args) {
        Account acc1 = new Account(1, "GR12345", "Alice", "W.", "F12345", 350.0);

        try {
            acc1.deposit(150.0);
            System.out.println("Successful deposit");
            System.out.println("The new balance is: " + acc1.getAccountBalance());

            acc1.withdraw(100.0, "F12345");
            System.out.println("Successful withdraw");
            System.out.println(acc1.accountToString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
