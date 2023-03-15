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
}