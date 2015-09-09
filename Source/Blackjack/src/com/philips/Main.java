package com.philips;

import java.io.PrintStream;

public class Main {

    public static final Console console = new Console();

    public static void main(String[] args) {
        console.getOut().print("hello");
    }

    public static PrintStream getSystemOut() {
        return System.out;
    }
}
