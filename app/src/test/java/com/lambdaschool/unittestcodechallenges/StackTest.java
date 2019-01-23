package com.lambdaschool.unittestcodechallenges;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    Stack<Integer> intStack;

    @Before
    public void setUp() throws Exception {
        intStack = new Stack<>();
    }

    @Test
    public void shouldAddIntItem() {
        // Setup
        Integer expectedValue = 2;

        // Execution
        intStack.push(expectedValue);

        // Check
        assertEquals(expectedValue, intStack.data.get(0));
    }

    @Test
    public void shouldPopIntItem() {
        // Setup
        Integer expectedValue = 2;
        intStack.push(expectedValue);

        // Execution
        Integer item = intStack.pop();

        // Check
        assertEquals(expectedValue, item);
    }

    @Test
    public void shouldBeLifo() {
        // Setup
        Integer firstEntered  = 1;
        Integer secondEntered = 2;
        Integer thirdEntered  = 3;

        // Execution
        intStack.push(firstEntered);
        intStack.push(secondEntered);
        intStack.push(thirdEntered);

        Integer firstOut  = intStack.pop();
        Integer secondOut = intStack.pop();
        Integer thirdOut  = intStack.pop();

        // Check
        assertEquals(firstEntered, thirdOut);
        assertEquals(secondEntered, secondOut);
        assertEquals(thirdEntered, firstOut);
    }

    @Test
    public void shouldAddDoubleItem() {
        // Setup
        Stack<Double> doubleStack = new Stack<>();
        Double expectedValue = 2.85;

        // Execution
        doubleStack.push(expectedValue);

        // Check
        assertEquals(expectedValue, doubleStack.data.get(0));
    }
}