package org.apache.http.params;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface HttpParams {
    HttpParams copy();

    boolean getBooleanParameter(String str, boolean z9);

    double getDoubleParameter(String str, double d9);

    int getIntParameter(String str, int i9);

    long getLongParameter(String str, long j9);

    Object getParameter(String str);

    boolean isParameterFalse(String str);

    boolean isParameterTrue(String str);

    boolean removeParameter(String str);

    HttpParams setBooleanParameter(String str, boolean z9);

    HttpParams setDoubleParameter(String str, double d9);

    HttpParams setIntParameter(String str, int i9);

    HttpParams setLongParameter(String str, long j9);

    HttpParams setParameter(String str, Object obj);
}
