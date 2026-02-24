package com.amplifyframework.logging;

/* JADX INFO: loaded from: classes.dex */
public enum LogLevel {
    VERBOSE,
    DEBUG,
    INFO,
    WARN,
    ERROR,
    NONE;

    public boolean above(LogLevel logLevel) {
        return ordinal() > logLevel.ordinal();
    }
}
