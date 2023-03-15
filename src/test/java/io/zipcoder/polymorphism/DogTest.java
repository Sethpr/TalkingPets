package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

 public class DogTest {
  @Test
  public void nameTest() {
   Dog dog = new Dog("Spunky");
   String actual = dog.name;
   String expected = "Spunky";
   Assert.assertEquals(expected, actual);

  }
 }

