package com.amazonaws;

import com.amazonaws.http.HttpMethodName;
import com.amazonaws.util.AWSRequestMetrics;
import java.io.InputStream;
import java.net.URI;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface Request<T> {
    void addHeader(String str, String str2);

    void addParameter(String str, String str2);

    AWSRequestMetrics getAWSRequestMetrics();

    InputStream getContent();

    String getEncodedUriResourcePath();

    URI getEndpoint();

    Map<String, String> getHeaders();

    String getHostPrefix();

    HttpMethodName getHttpMethod();

    AmazonWebServiceRequest getOriginalRequest();

    Map<String, String> getParameters();

    @Deprecated
    String getResourcePath();

    String getServiceName();

    long getTimeOffset();

    boolean isStreaming();

    void setAWSRequestMetrics(AWSRequestMetrics aWSRequestMetrics);

    void setContent(InputStream inputStream);

    void setEncodedResourcePath(String str);

    void setEndpoint(URI uri);

    void setHeaders(Map<String, String> map);

    void setHostPrefix(String str);

    void setHttpMethod(HttpMethodName httpMethodName);

    void setParameters(Map<String, String> map);

    @Deprecated
    void setResourcePath(String str);

    void setStreaming(boolean z9);

    @Deprecated
    void setTimeOffset(int i9);

    void setTimeOffset(long j9);

    Request<T> withParameter(String str, String str2);

    @Deprecated
    Request<T> withTimeOffset(int i9);

    Request<T> withTimeOffset(long j9);
}
