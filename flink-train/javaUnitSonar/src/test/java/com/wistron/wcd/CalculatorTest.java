package com.wistron.wcd;



import org.junit.jupiter.api.Test;
import static junit.framework.Assert.assertTrue;


public class CalculatorTest {

  @Test
  public void testAdd(){
     Calculator calculator = new Calculator();
     int result = calculator.add(1,1);
      assertTrue(result==2);
  }
}