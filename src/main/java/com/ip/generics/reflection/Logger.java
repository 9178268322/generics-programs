package com.ip.generics.reflection;

public class Logger {

    private String value;

    public Logger(String value) {
        this.value = value;
    }

    public void log() {
        System.out.println(value);
    }
}
