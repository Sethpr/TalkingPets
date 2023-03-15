package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {
    @Test
    public void nameTest() {
        Cat cat = new Cat("Milo");
        String actual = "";
        String expected = cat.name;
        Assert.assertEquals(expected, actual);

    }
}