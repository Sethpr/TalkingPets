package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BirdTest {
    @Test
    public void nameTest() {
        Bird bird = new Bird("Tweety");
        String actual = "bird.name";
        String expected = "tweety";
        Assert.assertEquals(expected, actual);

    }
}

