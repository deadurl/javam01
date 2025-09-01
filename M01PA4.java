import java.util.Date;

public class M01PA4 
{
    public static void main(String[] args) 
    {
        Account account = new Account(1122, 20000); //create new account with id and balance as stated in example. 
        account.setAnnualInterestRate(4.5); //sets the interest rate

        account.withdraw(2500); //withdraw 2500
        account.deposit(3000); // deposit 3000

        System.out.printf("Your Balance: $%.2f%n", account.getBalance()); //prints account balance formatted to two decimal points
        System.out.printf("Account Monthly Interest: $%.2f%n", account.getMonthlyInterest()); //prints monthly interest formatted to two decimal points
        System.out.println("Account Creation Date: " + account.getDateCreated()); //prints the date it was created
    }
}

class Account 
{
   //starting values
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated; //date initializer

    public Account() //no arg constructor
    {
        dateCreated = new Date();
    }

    public Account(int id, double balance) //parameterized constructor
    {
        this.id = id; //sets object id
        this.balance = balance; //sets object balance
        dateCreated = new Date(); //sets object date
    }

    public int getId() {return id;} //return id
    public void setId(int id) {this.id = id;} //set id

    public double getBalance(){return balance;}//return balance

    public double getAnnualInterestRate(){return annualInterestRate;} //return interest rate
    public void setAnnualInterestRate(double annualInterestRate){this.annualInterestRate = annualInterestRate;} //set annual interest rate

    public double getMonthlyInterestRate() {return annualInterestRate / 12;} //divide the annual by 12 to get monthly, return monthly interest rate

    public double getMonthlyInterest() {return balance * (getMonthlyInterestRate() / 100);} //get the monthly interest accrued

    public Date getDateCreated(){return dateCreated;} //return date created

    public void withdraw(double amount) { balance -= amount;}  //withdraw the amount specified
    public void deposit(double amount) {balance += amount;} //deposit amount specified
}