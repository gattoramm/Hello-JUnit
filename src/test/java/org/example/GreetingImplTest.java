package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class GreetingImplTest {
    public GreetImpl greeting;

    @Before
    public void setup() {
        System.out.println("Setup");
        greeting = new GreetImpl();
    }

    @Test
    public void greetShouldReturnAValidOutput() {
        System.out.println("greetShouldReturnAValidOutput");
        String result = greeting.greet("JUnit");
        assertNotNull(result);
        assertEquals("Hello JUnit", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void greetShouldThrowAnException_For_NameIsNull() {
        System.out.println("greetShouldThrowAnException_For_NameIsNull");
        greeting.greet(null);
    }

    @Test
    public void greetShouldThrowAnException_For_NameIsBlank() {
        System.out.println("greetShouldThrowAnException_For_NameIsBlank");
        greeting.greet("");
    }

    @After
    public void teardown() {
        System.out.println("teardown");
        greeting = null;
    }
}
