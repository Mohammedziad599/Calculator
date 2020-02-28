package TestCalculator;

import Calculator.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
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

    @Test
    public void Add_TwoNPositiveValueAsParam_ExpectedPositiveValue(){
        assertEquals(130,calc.add(120, 10));
    }
    @Test
    public void Add_NegativeValueAndPositiveAsParam_ExpectedNegativeValue(){
        assertEquals(-40,calc.add(20, -60));
    }
    @Test
    public void Add_NegativeValueAndPositiveAsParam_ExpectedPositiveValue(){
        assertEquals(40,calc.add(-20, 60));
    }
}