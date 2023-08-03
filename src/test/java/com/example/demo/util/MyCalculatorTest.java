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

}