package org.apache.http.params;

import org.apache.http.HttpVersion;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class HttpProtocolParamBean extends HttpAbstractParamBean {
    public HttpProtocolParamBean(HttpParams httpParams) {
        super(httpParams);
    }

    public void setContentCharset(String str) {
        HttpProtocolParams.setContentCharset(this.params, str);
    }

    public void setHttpElementCharset(String str) {
        HttpProtocolParams.setHttpElementCharset(this.params, str);
    }

    public void setUseExpectContinue(boolean z9) {
        HttpProtocolParams.setUseExpectContinue(this.params, z9);
    }

    public void setUserAgent(String str) {
        HttpProtocolParams.setUserAgent(this.params, str);
    }

    public void setVersion(HttpVersion httpVersion) {
        HttpProtocolParams.setVersion(this.params, httpVersion);
    }
}
