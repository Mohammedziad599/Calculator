package TestCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Calculator.*;

import org.junit.jupiter.api.BeforeAll;


public class CalculatorTest {
    static Calculator calc;

    @BeforeAll
    public static void BeforeAllTests(){
        calc=new Calculator();
    }

    @Test
    public void Add_TwoNegativeValueAsParam_ExpectedNegativeValue(){
        assertEquals(-30,calc.add(-20, -10));
    }

}