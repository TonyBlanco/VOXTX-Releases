package com.amazonaws;

/* JADX INFO: loaded from: classes.dex */
public class AmazonWebServiceResponse<T> {
    private ResponseMetadata responseMetadata;
    private T result;

    public String getRequestId() {
        ResponseMetadata responseMetadata = this.responseMetadata;
        if (responseMetadata == null) {
            return null;
        }
        return responseMetadata.getRequestId();
    }

    public ResponseMetadata getResponseMetadata() {
        return this.responseMetadata;
    }

    public T getResult() {
        return this.result;
    }

    public void setResponseMetadata(ResponseMetadata responseMetadata) {
        this.responseMetadata = responseMetadata;
    }

    public void setResult(T t9) {
        this.result = t9;
    }
}
