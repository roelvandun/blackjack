package com.philips;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Console {
    private final PrintStream out;
    private final ByteArrayOutputStream outputStream;

    public Console() {
        outputStream = new ByteArrayOutputStream();
        out = new PrintStream(outputStream);
    }

    public PrintStream getOut() {
        return out;
    }

    public ByteArrayOutputStream getOutputStream() {
        return outputStream;
    }
}
