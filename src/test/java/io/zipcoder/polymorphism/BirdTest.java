package io.zipcoder.polymorphism;

import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class BirdTest {
    public void nameTest() {
        Bird bird = new Bird("Tweety");
        String actual = "";
        String expected = bird.name;
        Assert.assertEquals(expected, actual);

    }

}