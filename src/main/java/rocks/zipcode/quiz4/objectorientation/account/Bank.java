package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {
    ArrayList<BankAccount> accountList;
    public Bank()
    {
        accountList = new ArrayList<>();
    }
    public BankAccount removeBankAccountByIndex(Integer indexNumber) {
      BankAccount closedAccount = accountList.get(indexNumber);
        accountList.remove(closedAccount)   ;
    return closedAccount;}

    public void addBankAccount(BankAccount bankAccount) {
        accountList.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        return accountList.contains(bankAccount);    }
}
