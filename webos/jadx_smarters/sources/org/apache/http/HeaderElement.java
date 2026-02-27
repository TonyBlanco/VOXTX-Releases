package org.apache.http;

/* JADX INFO: loaded from: classes4.dex */
public interface HeaderElement {
    String getName();

    NameValuePair getParameter(int i9);

    NameValuePair getParameterByName(String str);

    int getParameterCount();

    NameValuePair[] getParameters();

    String getValue();
}
