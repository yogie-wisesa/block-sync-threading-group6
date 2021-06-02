/**
 * class main untuk menjalankan/driver code
 * @author Kelompok 6 - PBO 02
 * @version 1/6/21
 */
public class Main {

    /**
     * method main untuk menjalankan code
     * @param args
     */
    public static void main(String[] args)
    {
        SavingsAccount savingsAccount = new SavingsAccount(0);
        System.out.println("Saldo Awal: " + savingsAccount.toString());
        Thread t1 = new Thread(new Deposit(savingsAccount, 300));
        Thread t2 = new Thread(new Withdraw(savingsAccount, 50));
        t1.start();
        t2.start();
    }
}

/**
 * subclass deposit untuk memanggil method deposit
 *
 */
class Deposit implements Runnable
{
    private SavingsAccount savingsAccount;
    private float deposit;

    /**
     * constructor class deposit
     * @param savingsAccount
     * @param deposit
     */
    Deposit(SavingsAccount savingsAccount,float deposit)
    {
        this.savingsAccount = savingsAccount;
        this.deposit = deposit;
    }

    /**
     * method run untuk memanggil method deposit dari savingsaccount
     *
     */
    @Override
    public void run() {

        //loop untuk simulasi threading agar program menjadi random/unpredictable
        for (int i = 0; i < 6666; i++) {
        }
        savingsAccount.deposit(deposit);
        System.out.println("Saldo akhir: "  + savingsAccount.toString());
    }
}

/**
 * subclass withdraw untuk memanggil method withdraw
 */
class Withdraw implements Runnable
{
    private SavingsAccount savingsAccount;
    private float withdraw;

    /**
     * constructor class withdraw
     * @param savingsAccount
     * @param withdraw
     */
    Withdraw(SavingsAccount savingsAccount,float withdraw)
    {
        this.savingsAccount = savingsAccount;
        this.withdraw = withdraw;
    }

    /**
     * method run untuk memanggil method withdraw dari savingsaccount
     */
    @Override
    public void run() {

        //loop untuk simulasi threading agar program menjadi random/unpredictable
        for (int i = 0; i < 6666; i++) {
        }
        savingsAccount.withdraw(withdraw);
        System.out.println("Saldo akhir: " + savingsAccount.toString());


    }
}