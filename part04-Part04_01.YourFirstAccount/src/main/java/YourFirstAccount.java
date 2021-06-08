
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        
        Account bobsAccount = new Account("Bob's Account", 100.00);
        bobsAccount.deposit(20);
        System.out.println(bobsAccount);
    }
}
