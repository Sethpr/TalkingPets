package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {
    @Test
    public void nameTest() {
        Cat cat = new Cat("Milo");
        String actual = cat.name;
        String expected = "Milo";
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void speakTest(){
        Cat cat = new Cat(null);
        String actual = cat.speak();
        String expected = "Meow!";
        Assert.assertEquals(expected, actual);
    }
}