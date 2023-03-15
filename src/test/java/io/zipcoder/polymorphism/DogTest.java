package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

 public class DogTest {
  @Test
  public void nameTest() {
   Dog dog = new Dog("Spunky");
   String actual = "";
   String expected = dog.name;
   Assert.assertEquals(expected, actual);

  }
 }

