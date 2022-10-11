package src.test;

import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.Test;

import src.main.models.Team;

public class TeamTest {
    
    @Test
    public void hasNullTest(){
        String[] chasers = new String[] {null, "Ginny", "Katie"};
        assertTrue(Team.hasNull(chasers));
    }

    @Test
    public void hasBlankTest(){
        String[] chasers = new String[] {"    ", "Ginny", "Katie"};
        assertTrue(Team.hasBlank(chasers));
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkStringParamValidityNullTest(){
        Team.checkStringParamValidity(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkStringParamValidityBlankTest(){
        Team.checkStringParamValidity("      ");
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkChaserParamValidityNullTest(){
        String[] chasers = new String[] {null, "Ginny", "Katie"};
        Team.checkChaserParamValidity(chasers);
    }
    @Test(expected = IllegalArgumentException.class)
    public void checkChaserParamValidityBlankTest(){
        String[] chasers = new String[] {"    ", "Ginny", "Katie"};
        Team.checkChaserParamValidity(chasers);
    }


}
