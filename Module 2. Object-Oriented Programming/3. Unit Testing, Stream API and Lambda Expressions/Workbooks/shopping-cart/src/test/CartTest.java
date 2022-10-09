package src.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;

import java.text.DecimalFormat;

import src.main.models.*;

public class CartTest {

    Cart cart;

    static DecimalFormat formatter = new DecimalFormat("#.##");

    static Item testItem1 = new Item("Pepsi", 1.99);
    static Item testItem2 = new Item("Crush", 1.99);
    static Item testItem3 = new Item("Solo", 5.99);
    
    static final double TAX_RATE = 0.13;

    static double expectedSubtotal = testItem1.getPrice() + testItem2.getPrice();
    static double expectedTax = Double.parseDouble(formatter.format(expectedSubtotal*TAX_RATE));
    static double expectedTotal = expectedSubtotal + expectedTax;

    @Before
    public void setup(){
        cart = new Cart();
        cart.add(testItem1);
        cart.add(testItem2);
        
    }

    @Test
    public void addItemTest(){
        assertTrue(cart.contains(testItem1));
        assertTrue(cart.contains(testItem2));
    }

    @Test
    public void addDuplicateItemTest(){
        assertFalse(cart.add(testItem1));
    }

    @Test
    public void removeItemTest(){
        cart.remove(testItem1.getName());
        assertFalse(cart.contains(testItem1.getName()));
    }

    @Test(expected = IllegalStateException.class)
    public void removeItemNotInCartTest(){
        cart.remove(testItem3.getName());
    }

    @Test
    public void subtotalCalculationTest(){
        assertTrue(expectedSubtotal == cart.getSubtotal());
    }

    @Test
    public void taxCalculationTest(){
        assertTrue(expectedTax == cart.getTax(cart.getSubtotal()));
    }

    @Test
    public void totalCalculationTest(){
        assertTrue(expectedTotal == cart.getTotal(cart.getSubtotal(), cart.getTax(cart.getSubtotal())));
    }

    @Test(expected = IllegalStateException.class)
    public void checkoutEmptyCartTest(){
        cart.remove(testItem1.getName());
        cart.remove(testItem2.getName());
        cart.checkout();
    }

}
