package org.apache.http;

import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public interface HttpResponse extends HttpMessage {
    HttpEntity getEntity();

    Locale getLocale();

    StatusLine getStatusLine();

    void setEntity(HttpEntity httpEntity);

    void setLocale(Locale locale);

    void setReasonPhrase(String str) throws IllegalStateException;

    void setStatusCode(int i9) throws IllegalStateException;

    void setStatusLine(ProtocolVersion protocolVersion, int i9);

    void setStatusLine(ProtocolVersion protocolVersion, int i9, String str);

    void setStatusLine(StatusLine statusLine);
}
