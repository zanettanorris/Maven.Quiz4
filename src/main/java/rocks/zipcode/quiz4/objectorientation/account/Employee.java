package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker, Transactable{
    BankAccount bankAccount;
   Double hoursWorked;
   Double hourlyWage;
   Double moneyEarned;

    public Employee() {
        this(new BankAccount());
    }

    public Employee(BankAccount bankAccount) {
        this.bankAccount = bankAccount;

    }

    public BankAccount getBankAccount() {
        return this.bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;

    }

    @Override
    public void increaseHoursWorked(Double numberOfHours) {

    }

    @Override
    public Double getHoursWorked(){
        return hoursWorked;
    }

    @Override
    public Double getHourlyWage() {
        return hourlyWage;
    }

//    public Double getHourlyRate(){
//        return hourlyRate;
//    }
    @Override
    public Double getMoneyEarned(){
            return moneyEarned;
        }

    @Override
    public void deposit(Double amountToIncreaseBy) {
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
    }

    @Override
    public Double getBalance() {
        return null;
    }
}



