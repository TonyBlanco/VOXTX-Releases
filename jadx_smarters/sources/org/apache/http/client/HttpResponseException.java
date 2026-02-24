package org.apache.http.client;

/* JADX INFO: loaded from: classes4.dex */
public class HttpResponseException extends ClientProtocolException {
    private static final long serialVersionUID = -7186627969477257933L;
    private final int statusCode;

    public HttpResponseException(int i9, String str) {
        super(str);
        this.statusCode = i9;
    }

    public int getStatusCode() {
        return this.statusCode;
    }
}
