package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class LionsManeTest {
    private final String sex;
    private final boolean expectedMane;


    public LionsManeTest(String sex, boolean expectedMane) {
        this.sex = sex;
        this.expectedMane = expectedMane;
    }

     @Parameterized.Parameters(name = "sex: {0}, expectedMane: {1}")
    public static Object[][] params(){
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void lionDoesHaveManeTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(sex, feline);

        assertEquals(expectedMane, lion.doesHaveMane());
    }
}