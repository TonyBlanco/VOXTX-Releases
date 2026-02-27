package com.amazonaws.mobileconnectors.appsync;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ClearCacheException extends AWSAppSyncClientException {
    private List<Exception> exceptions;

    public ClearCacheException() {
    }

    public ClearCacheException(String str) {
        super(str);
    }

    public ClearCacheException(String str, Throwable th) {
        super(str, th);
    }

    public ClearCacheException(Throwable th) {
        super(th);
    }

    public void addException(Exception exc) {
        if (this.exceptions == null) {
            this.exceptions = new ArrayList();
        }
        this.exceptions.add(exc);
    }

    public List<Exception> getExceptions() {
        return this.exceptions;
    }
}
