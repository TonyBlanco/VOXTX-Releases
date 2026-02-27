package com.amazonaws.http;

import com.amazonaws.AmazonWebServiceClient;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.Signer;
import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.AWSRequestMetricsFullSupport;
import java.net.URI;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ExecutionContext {
    private final AmazonWebServiceClient awsClient;
    private final AWSRequestMetrics awsRequestMetrics;
    private String contextUserAgent;
    private AWSCredentials credentials;
    private final List<RequestHandler2> requestHandler2s;

    public ExecutionContext() {
        this(null, false, null);
    }

    public ExecutionContext(List<RequestHandler2> list, boolean z9, AmazonWebServiceClient amazonWebServiceClient) {
        this.requestHandler2s = list;
        this.awsRequestMetrics = z9 ? new AWSRequestMetricsFullSupport() : new AWSRequestMetrics();
        this.awsClient = amazonWebServiceClient;
    }

    @Deprecated
    public ExecutionContext(boolean z9) {
        this(null, z9, null);
    }

    @Deprecated
    public AWSRequestMetrics getAwsRequestMetrics() {
        return this.awsRequestMetrics;
    }

    public String getContextUserAgent() {
        return this.contextUserAgent;
    }

    public AWSCredentials getCredentials() {
        return this.credentials;
    }

    public List<RequestHandler2> getRequestHandler2s() {
        return this.requestHandler2s;
    }

    public Signer getSignerByURI(URI uri) {
        AmazonWebServiceClient amazonWebServiceClient = this.awsClient;
        if (amazonWebServiceClient == null) {
            return null;
        }
        return amazonWebServiceClient.getSignerByURI(uri);
    }

    public void setContextUserAgent(String str) {
        this.contextUserAgent = str;
    }

    public void setCredentials(AWSCredentials aWSCredentials) {
        this.credentials = aWSCredentials;
    }

    public void setSigner(Signer signer) {
    }
}
