package org.apache.http.params;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class AbstractHttpParams implements HttpParams, HttpParamsNames {
    @Override // org.apache.http.params.HttpParams
    public boolean getBooleanParameter(String str, boolean z9) {
        Object parameter = getParameter(str);
        return parameter == null ? z9 : ((Boolean) parameter).booleanValue();
    }

    @Override // org.apache.http.params.HttpParams
    public double getDoubleParameter(String str, double d9) {
        Object parameter = getParameter(str);
        return parameter == null ? d9 : ((Double) parameter).doubleValue();
    }

    @Override // org.apache.http.params.HttpParams
    public int getIntParameter(String str, int i9) {
        Object parameter = getParameter(str);
        return parameter == null ? i9 : ((Integer) parameter).intValue();
    }

    @Override // org.apache.http.params.HttpParams
    public long getLongParameter(String str, long j9) {
        Object parameter = getParameter(str);
        return parameter == null ? j9 : ((Long) parameter).longValue();
    }

    @Override // org.apache.http.params.HttpParamsNames
    public Set<String> getNames() {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.http.params.HttpParams
    public boolean isParameterFalse(String str) {
        return !getBooleanParameter(str, false);
    }

    @Override // org.apache.http.params.HttpParams
    public boolean isParameterTrue(String str) {
        return getBooleanParameter(str, false);
    }

    @Override // org.apache.http.params.HttpParams
    public HttpParams setBooleanParameter(String str, boolean z9) {
        setParameter(str, z9 ? Boolean.TRUE : Boolean.FALSE);
        return this;
    }

    @Override // org.apache.http.params.HttpParams
    public HttpParams setDoubleParameter(String str, double d9) {
        setParameter(str, Double.valueOf(d9));
        return this;
    }

    @Override // org.apache.http.params.HttpParams
    public HttpParams setIntParameter(String str, int i9) {
        setParameter(str, Integer.valueOf(i9));
        return this;
    }

    @Override // org.apache.http.params.HttpParams
    public HttpParams setLongParameter(String str, long j9) {
        setParameter(str, Long.valueOf(j9));
        return this;
    }
}
