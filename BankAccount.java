package $02_DataTypes;

public class BankAccount {

    static String bankName1;
    static String bankName2 = "boi";

    String accountHoldersName;
    String accountNumber;
    float balance;

    public static void main(String[] args) {
        double loanIntrestRate = 7.5;
        System.out.println(loanIntrestRate);
        System.out.println(BankAccount.bankName1);
        System.out.println(BankAccount.bankName2);

        BankAccount bankAccount = new BankAccount();
        bankAccount.accountHoldersName = "john";
        bankAccount.accountNumber = "123456789";
        bankAccount.balance = 123552f;

    }
}
/*
LOCAL VARIABLES: ->we declare within a main method or a paticular method
*/
