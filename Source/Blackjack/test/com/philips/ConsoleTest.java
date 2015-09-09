package com.philips;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ConsoleTest {

    private ByteArrayOutputStream outputStream;

    @Before
    public void setUpStreams() {
        outputStream = new ByteArrayOutputStream();

        startApplication();
    }

    @Test
    public void itTellsTheUserToGiveInput() {
        String actual = outputStream.toString();
        assertEquals("Do you agree to stand?", actual);
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    private void startApplication() {
        Main.console = new Console() {
            @Override
            public PrintStream createOut() {
                return new PrintStream(outputStream);
            }

            @Override
            protected InputStream createIn() {
                return new InputStream() {
                    @Override
                    public int read() throws IOException {
                        return -1;
                    }
                };
            }
        };

        Main.main(null);
    }
}
