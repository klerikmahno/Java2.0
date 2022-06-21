package ru.calculator.framework;
import calculator.Calculator;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test()
    public void testAddition() {
        System.out.println("@Test -> testAddition()");
        Assertions.assertEquals(7,calculator.addition(3,4),"Тест не пройден");
    }

    @Test
    public void testDevision(){
        System.out.println("@Test=> testDevision()");
        Assertions.assertEquals(5136,calculator.division(25680,5),"Тест не пройден");
    }

    @Test
    public void testMultiplication(){
        System.out.println("@Test => testMultiplication()");
        Assertions.assertEquals(100,calculator.multiplication(50,2),"Тест не пройден");
    }

    @Test
    public void testSubtraction(){
        System.out.println("@Test => testSubtraction()");
        Assertions.assertEquals(48,calculator.subtraction(50.0,2.0),"Тест не пройден");
    }


}