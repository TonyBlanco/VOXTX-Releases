package org.apache.http.params;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class HttpConnectionParamBean extends HttpAbstractParamBean {
    public HttpConnectionParamBean(HttpParams httpParams) {
        super(httpParams);
    }

    public void setConnectionTimeout(int i9) {
        HttpConnectionParams.setConnectionTimeout(this.params, i9);
    }

    public void setLinger(int i9) {
        HttpConnectionParams.setLinger(this.params, i9);
    }

    public void setSoTimeout(int i9) {
        HttpConnectionParams.setSoTimeout(this.params, i9);
    }

    public void setSocketBufferSize(int i9) {
        HttpConnectionParams.setSocketBufferSize(this.params, i9);
    }

    public void setStaleCheckingEnabled(boolean z9) {
        HttpConnectionParams.setStaleCheckingEnabled(this.params, z9);
    }

    public void setTcpNoDelay(boolean z9) {
        HttpConnectionParams.setTcpNoDelay(this.params, z9);
    }
}
