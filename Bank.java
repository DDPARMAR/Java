
class Bankaccount{
    private int accountnumber;
    private int balance=0;
    int depositbalance;
    Bankaccount(int accnum){
        accountnumber = accnum;
        System.out.println("Account number = "+accountnumber);
    } 
    int deposit(int num){
        balance = balance+num;
        System.out.println("After Deposit Balance = "+balance);
        return balance;
    }
    int withdraw(int num){
        if(this.depositbalance<=0){
        balance  = balance - num;
        System.out.println("After Withdraw Balance = "+balance);
        }    
        else{
            System.out.println("Out of balance ..."); 
        }
    return balance;
    }

}
public class Bank {
    public static void main(String[] args) {
        Bankaccount obj = new Bankaccount(12345);
        obj.deposit(5000);
        obj.deposit(5000);
        obj.deposit(100000);
        obj.withdraw(10000);
    }
}
