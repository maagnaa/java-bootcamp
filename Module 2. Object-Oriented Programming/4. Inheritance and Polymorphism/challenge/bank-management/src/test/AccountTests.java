package src.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.text.DecimalFormat;


import org.junit.Before;
import org.junit.Test;

import src.main.model.account.*;;

public class AccountTests {

    static final double OVERDRAFT_FEE = 5.5;

    Account chequing;
    Account savings;
    Account loan;

    @Before
    public void setup(){
        chequing = new  Chequing("f84c43f4-a634-4c57-a644-7602f8840870", "Michael Scott", 1524.51);
        savings = new Savings("ce07d7b3-9038-43db-83ae-77fd9c0450c9", "Saul Goodman", 2241.60);
        loan = new Loan("4991bf71-ae8f-4df9-81c1-9c79cff280a5", "Phoebe Buffay", 2537.31);
    }

    /*  Withdrawal Test
     *
     *     Test a basic withdrawal with no fees or interest charges 
     *     Applies to: chequing
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
     *      Test a withdrawal where: (amount > balance) && ((amount-balance) < 200)
     *      An overdraft fee of 5.50 should be applied.
     * 
     *      Applies to: chequing.
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
     *      Test a withdrawal where: (amount > balance) && ((amount-balance) > 200)
     *      The withdrawal should be blocked and return zero.
     */
    @Test
    public void overdraftLimitTest(){
        double amount = 1726;
        double expected = chequing.getBalance();

        assertFalse(chequing.withdraw(amount));
        assertEquals(expected, chequing.getBalance());
    }


    protected double round(double amount) {
        DecimalFormat formatter = new DecimalFormat("#.##");
        return Double.parseDouble(formatter.format(amount));
    }
}
