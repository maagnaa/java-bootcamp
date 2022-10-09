package src.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;

import src.main.models.*;

public class CartTest {

    Cart cart;
    static Item testItem1 = new Item("Pepsi", 1.99);
    static Item testItem2 = new Item("Crush", 1.99);
    static Item testItem3 = new Item("Solo", 5.99);


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

}
