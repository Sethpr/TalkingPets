package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BirdTest {
    @Test
    public void nameTest() {
        Bird bird = new Bird("Tweety");
        String actual = "";
        String expected = bird.name;
        Assert.assertEquals(expected, actual);

    }

}