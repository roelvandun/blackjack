package com.philips;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConsoleTest {

    private Console console;

    @Before
    public void setUpStreams() {
        console = Main.console;
        System.setOut(console.getOut());
        Main.main(null);
    }

    @Test
    public void itTellsTheUserToGiveInput() {
        String actual = console.getOutputStream().toString();
        assertEquals("Do you agree to stand?", actual);
    }


    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }
}
