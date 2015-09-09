package com.philips;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConsoleInputTest {

    private Console console;

    @Before
    public void setUpStreams() {
        console = Main.console;
        System.setOut(console.getOut());
        Main.main(null);
    }

    @Test
    public void out() {
        String actual = console.getOutputStream().toString();
        assertEquals("hello", actual);
    }


    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }
}
