package com.example;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;


public class FelineTest {

   @Test
    public void felineEatMeatTest() throws Exception {
        Feline feline = new Feline();

        Assert.assertEquals((List.of("Животные", "Птицы", "Рыба")), feline.eatMeat());
    }

    @Test
    public void felineGetFamilyTest(){
        Feline feline = new Feline();

        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void felineGetKittensTest(){
        Feline feline = new Feline();

        Assert.assertEquals(1, feline.getKittens());
    }
}
