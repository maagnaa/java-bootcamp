package src.test;

import src.main.model.Transaction;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TransactionTest {
    Transaction transaction;

    private final String DATE_PATTERN = "dd/MM/yyyy";


    @Before
    public void setup() {
        transaction = new Transaction(Transaction.Type.WITHDRAW , 1546905600, "6b8dd258-aba3-4b19-b238-45d15edd4b48", 624.99);
    }

    /*  Correct Date Test
     * 
     *      Verify that calling readableDate() returns a formatted, 
     *      readable date String.
     * 
     *      Desired Format:  dd/MM/yyyy
     */
    @Test
    public void correctDateTest(){
        Date date = new Date(transaction.getTimestamp()*1000);
        SimpleDateFormat formatter = new SimpleDateFormat(DATE_PATTERN);
        formatter.setLenient(false);
        String readableDate = formatter.format(date);

        assertEquals(readableDate, transaction.getReadableDate());
    }

}
