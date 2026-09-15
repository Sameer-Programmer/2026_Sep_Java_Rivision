package OopsConcepts_Encapsulation;
//DemoEncapsulation
public class Bank {
    private String customerName ;
    private int balance ;

    public void  setCustomerName(String customerName){
       this.customerName = customerName;
    }

    public String  getcustomerName(){
        return customerName;
    }

    public int  getBalance(){
       return balance;
    }

    public String  getCustomerName(){
        return customerName;
    }

    public void  setBalance(int balance){
        this.balance = balance;
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.setBalance(100);
        bank.setCustomerName("sameer");
        System.out.println( bank.getBalance());
        System.out.println(bank.getCustomerName());



    }
}
