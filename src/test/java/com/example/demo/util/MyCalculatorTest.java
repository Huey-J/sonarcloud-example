package com.example.demo.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyCalculatorTest {

  private final MyCalculator myCalculator = new MyCalculator();

  @Test
  void addTest() {
    int result = myCalculator.add(1, 2);
    assertEquals(3, result);
  }

  @Test
  void minusTest() {
    int result = myCalculator.minus(5, 3);
    assertEquals(2, result);
  }

  @Test
  void multiplyTest() {
    int result = myCalculator.multiply(2, 5);
    assertEquals(10, result);
  }

  @Test
  void divideTest() {
    int result = myCalculator.divide(15, 4);
    assertEquals(3, result);
  }
}