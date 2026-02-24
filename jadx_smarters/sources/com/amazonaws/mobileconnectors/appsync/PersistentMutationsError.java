package com.amazonaws.mobileconnectors.appsync;

/* JADX INFO: loaded from: classes.dex */
public class PersistentMutationsError {
    private Exception exception;
    private String mutationClassName;
    private String recordIdentifier;

    public PersistentMutationsError(String str, String str2, Exception exc) {
        this.exception = exc;
        this.mutationClassName = str;
        this.recordIdentifier = str2;
    }

    public Exception getException() {
        return this.exception;
    }

    public String getMutationClassName() {
        return this.mutationClassName;
    }

    public String getRecordIdentifier() {
        return this.recordIdentifier;
    }
}
