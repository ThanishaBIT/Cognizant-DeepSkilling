package com.cognizant.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

		Calculator c = new Calculator();
		
		    @Test
		    void testAddition(){

		        assertEquals(30,c.add(10,20));

		    }

		    @Test
		    void testNotEquals(){

		        assertNotEquals(50,c.add(10,20));

		    }

		    @Test
		    void testTrue(){

		        assertTrue(20>10);

		    }

		    @Test
		    void testFalse(){

		        assertFalse(20<10);

		    }

		    @Test
		    void testNull(){

		        String name=null;

		        assertNull(name);

		    }

		    @Test
		    void testNotNull(){

		        String name="Thanisha";

		        assertNotNull(name);

		    }

		    @Test
		    void testException(){

		        assertThrows(ArithmeticException.class,()->{

		            c.divide(10,0);

		        });

		    
	}

}
