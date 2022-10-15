package src.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


import java.text.DecimalFormat;


import org.junit.Before;
import org.junit.Test;

import src.main.model.account.*;;

public class AccountTests {
    static final double  INTEREST_RATE = 1.2;
    static final double  OVERDRAFT_FEE = 5.5;
    static final double WITHDRAWAL_FEE = 5.0;

    Account chequing;
    Account savings;
    Account loan;

    /*  Utility: Round
     * 
     *      To round a double to the specified Decimal Format
     */
    protected double round(double amount) {
        DecimalFormat formatter = new DecimalFormat("#.##");
        return Double.parseDouble(formatter.format(amount));
    }


    @Before
    public void setup(){
        chequing = new  Chequing("f84c43f4-a634-4c57-a644-7602f8840870", "Michael Scott", 1524.51);
        savings = new Savings("ce07d7b3-9038-43db-83ae-77fd9c0450c9", "Saul Goodman", 2241.60);
        loan = new Loan("4991bf71-ae8f-4df9-81c1-9c79cff280a5", "Phoebe Buffay", 2537.31);
    }

    /*  Withdrawal Test
     *
     *     Test a basic withdrawal from chequing account 
     *     with no fees or interest charges 
     */
    @Test
    public void withdrawalTest(){
        double amount = 1440;
        double expected = round(chequing.getBalance() - amount);

        chequing.withdraw(amount);
        assertEquals(expected, chequing.getBalance());
    }

    /*  Overdraft Test
     *
     *      Test a withdrawal from chequing account where:
     *          (amount > balance) && ((amount-balance) < 200)
     * 
     *      Verify that an overdraft fee of 5.50 is applied.
     * 
     */
    @Test
    public void overdraftTest(){
        double amount = 1534.43;
        double expected = round(chequing.getBalance() - amount - OVERDRAFT_FEE);

        chequing.withdraw(amount);
        assertEquals(expected, chequing.getBalance());
    }


    /* Overdraft Limit Test
     * 
     *      Test a withdrawal from chequing account where:
     *          (amount > balance) && ((amount-balance) > 200)
     * 
     *      Verify that the withdrawal is blocked (return false)
     *      and that the account balance remains unchanged. 
     */

    @Test
    public void overdraftLimitTest(){
        double amount = 1726;
        double expected = chequing.getBalance();

        assertFalse(chequing.withdraw(amount));
        assertEquals(expected, chequing.getBalance());
    }

    /*  Withdrawal Fee Test
     * 
     *      Test a withdrawal from savings account.
     * 
     *      Verify that a withdrawal fee of 5.0 is applied.
     */
    @Test
    public void withdrawalFeeTest(){
        double amount = 100;
        double expected = savings.getBalance() - amount - WITHDRAWAL_FEE;

        savings.withdraw(amount);
        assertEquals(expected, savings.getBalance());
    }

    /*  Withdrawal Interest Test
     * 
     *      Test a withdrawal from loan account.
     *      The withdrawal amount should be added, instead of 
     *      subtracted, to the balance.
     *      
     *      Verify that an interest rate of 2% is charged.
     */
    @Test 
    public void withdrawalInterestTest(){
        double amount = 2434.31;
        double expected = round(loan.getBalance() + amount*INTEREST_RATE);

        loan.withdraw(amount);
        assertEquals(expected, loan.getBalance());

    }

    /*  Withdrawal Limit Test
     * 
     *      Test a withdrawal from loan account.
     * 
     *      Check that a withdrawal that would cause the total debt
     *      to exceed 10000 is blocked (return false) and that 
     *      the account balance remains unchanged.
     */
    @Test
    public void withdrawalLimitTest(){
        double amount = 7463.69;
        double balance = loan.getBalance();

        assertFalse(loan.withdraw(amount));
        assertEquals(balance, loan.getBalance());
    }

    /*  Deposit test
     * 
     *      Test deposit to savings and chequing account.
     */
    @Test
    public void depositTest(){
        double amount = 5000;
        double expectedChequing = chequing.getBalance() + amount;
        double expectedSavings = savings.getBalance() + amount;

        chequing.deposit(amount);
        savings.deposit(amount);

        assertEquals(expectedChequing, chequing.getBalance());
        assertEquals(expectedSavings, savings.getBalance());
    }

    /*  Loan Deposit Test
     * 
     *      Test deposit to loan account. 
     *      
     *      The deposited amount should be subtracted instead of added.
     */
    @Test
    public void loanDepositTest(){
        double amount = 1000;
        double expected = loan.getBalance() - amount;

        loan.deposit(amount);
        assertEquals(expected, loan.getBalance());
    }
}
