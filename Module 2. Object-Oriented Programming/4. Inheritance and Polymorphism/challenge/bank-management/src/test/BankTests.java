package src.test;

import src.main.model.*;
import src.main.model.account.*;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTests {
    Bank bank;

    static final String ACCOUNT_ID = "f84c43f4-a634-4c57-a644-7602f8840870";
    static final String ACCOUNT_NAME = "Michael Scott";
    static final double INIT_BALANCE = 1524.51;
    static final double OVERDRAFT_AMOUNT = INIT_BALANCE + 250;


    @Before
    public void setup() {
        Account chequing = new Chequing(ACCOUNT_ID, ACCOUNT_NAME, INIT_BALANCE);
        
        bank = new Bank();
        bank.addAccount(chequing);
      }    

      @Test
      public void successfulTransactionsTest() {
          this.bank.executeTransaction(new Transaction(Transaction.Type.WITHDRAW, 1546905600, ACCOUNT_ID, 624.99));
          this.bank.executeTransaction( new Transaction(Transaction.Type.DEPOSIT,  1578700800, ACCOUNT_ID, 441.93));

          assertEquals(2, bank.getTransactions(ACCOUNT_ID).length);
      }

      @Test
      public void failedTransactionTest() {
        this.bank.executeTransaction(new Transaction(Transaction.Type.WITHDRAW, 1546905600, ACCOUNT_ID, OVERDRAFT_AMOUNT));

        assertEquals(0, bank.getTransactions(ACCOUNT_ID).length);
      }

      @Test
      public void taxDeductionTest() {
        this.bank.executeTransaction(new Transaction(Transaction.Type.DEPOSIT, 1578700800, "f84c43f4-a634-4c57-a644-7602f8840870", 4000));
        this.bank.executeTransaction(new Transaction(Transaction.Type.WITHDRAW, 1578700800, "f84c43f4-a634-4c57-a644-7602f8840870", 500));
    
        this.bank.deductTaxes();
        assertEquals(4949.51, bank.getAccountFromId(ACCOUNT_ID).getBalance());

      }

}
