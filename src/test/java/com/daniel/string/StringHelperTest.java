package com.daniel.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class StringHelperTest {

    StringHelper helper = new StringHelper();

    @Test
    public void testStrWith2CharsIsReversed(){
        assertEquals("BA", helper.swapLast2Chars("AB"));
    }

    @Test
    public void testStrWith4Char(){
        assertEquals("ABDC", helper.swapLast2Chars("ABCD"));
    }

    @Test
    public void testStrWith10Char(){
        assertEquals("ABCDEFGHJI", helper.swapLast2Chars("ABCDEFGHIJ"));
    }

    @Test
    public void testStrWith1Char(){
        assertEquals("A", helper.swapLast2Chars("A"));
    }

    @Test(expected = RuntimeException.class)
    public void testStrWithNullChar(){
        helper.swapLast2Chars("");
    }
}
