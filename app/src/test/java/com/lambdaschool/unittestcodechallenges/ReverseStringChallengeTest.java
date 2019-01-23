package com.lambdaschool.unittestcodechallenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringChallengeTest {
    @Test public void shouldReverseALowercaseString() {
        assertEquals("olleh", ReverseStringChallenge.reverseString("hello"));
    }

    @Test public void shouldReverseATitleCaseString() {
        assertEquals("olleH", ReverseStringChallenge.reverseString("Hello"));
    }

    @Test public void shouldReturnEmptyStringOnNull() {
        assertEquals("", ReverseStringChallenge.reverseString(null));
    }

    @Test public void shouldReverseStringWithMultipleWords() {
        assertEquals("dlroW olleH", ReverseStringChallenge.reverseString("Hello World"));
    }
}