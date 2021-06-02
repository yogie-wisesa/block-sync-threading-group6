/**
 * Class SavingsAccount dari ppt
 * @author Kelompok 6 - PBO 02
 * @version 1/6/21
 */
public class SavingsAccount {
    private float balance;

    /**
     * constructor class savingsaccount
     * @param balance saldo bank
     */
    public SavingsAccount(float balance)
    {
        this.balance = balance;
    }

    /**
     * method withdraw untuk mengambil uang
     * @param anAmount jumlah uang yang ditarik
     */
    public void withdraw(float anAmount) {
        if (anAmount < 0.0)
            throw new IllegalArgumentException("Withdraw amount negative");
        //synchronized (this)
            if (anAmount <= balance) {
                synchronized(this) {
                    balance = balance - anAmount;
                }
            }

    }

    /**
     * method deposit untuk menyetor uang
     * @param anAmount jumlah uang yang disetor
     */
    public void deposit(float anAmount) {
        if (anAmount < 0.0)
            throw new IllegalArgumentException("Deposit amount negative");
        synchronized (this) {
            balance = balance + anAmount;
        }
    }

    /**
     * method tostring untuk print saldo
     * @return jumlah saldo
     */
    @Override
    public String toString() {
        return String.valueOf(balance);
    }

}