package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by armardbellamy on 9/26/16.
 */
public class PetTest {


    Pet pet;

    @Before
    public void init(){
        pet = new Pet();
    }

    @Test
    public void speakTest(){
        String actual = pet.speak();
        String expected = "Hey, please take me home.";
        Assert.assertEquals("Should return Hey, please take me home.", expected, actual);
    }

    @Test
    public void setNameTest(){
        pet.setName("Snowflake");
        String actual = pet.getName();
        String expected = "Snowflake";
        Assert.assertEquals("Should return Snowflake", expected, actual);
    }

}
