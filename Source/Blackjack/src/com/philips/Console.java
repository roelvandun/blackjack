package com.philips;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Console {
    private PrintStream out;
    private final Scanner scanner;

    public Console() {
        out = createOut();
        scanner = new Scanner(createIn());
    }

    protected PrintStream createOut() {
        return System.out;
    }

    protected InputStream createIn() {
        return System.in;
    }

    public void write(String text) {
        out.print(text);
    }

    public String readLine() {
        return scanner.next();
    }
}
