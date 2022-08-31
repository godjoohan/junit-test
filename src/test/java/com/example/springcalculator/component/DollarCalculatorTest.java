package com.example.springcalculator.component;

import com.example.springcalculator.conponent.Calculator;
import com.example.springcalculator.conponent.DollarCalculator;
import com.example.springcalculator.conponent.MarketApi;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
public class DollarCalculatorTest {

    @MockBean
    private MarketApi marketApi;

    @Autowired
    private Calculator Calculator;

    @Test
    public void dollarCalculatorTest(){
        Mockito.when(marketApi.connect()).thenReturn(3000);
        //Calculator.init();

        int sum = Calculator.sum(10, 10);
        int minus = Calculator.minus(10,10);

        Assertions.assertEquals(60000, sum);
        Assertions.assertEquals(0, minus);

    }


}
