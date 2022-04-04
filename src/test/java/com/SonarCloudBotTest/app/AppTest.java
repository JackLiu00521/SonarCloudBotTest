package com.SonarCloudBotTest.app;

import static org.junit.Assert.assertTrue;


import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void testAddNums() {
        // 1. Arrange
        Calculator calculator = new Calculator();
        int number1 = 5;
        int number2 = 10;
        int excepted = 15;

        // 2. Act
        int actual = calculator.add(number1, number2);

        // 3. Assert
        assertThat(actual).isEqualTo(excepted);
    }
}
