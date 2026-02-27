package com.amazonaws.util;

import com.amazonaws.metrics.MetricType;
import com.amazonaws.metrics.RequestMetricType;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class AWSRequestMetrics {
    protected final TimingInfo timingInfo;

    public enum Field implements RequestMetricType {
        AWSErrorCode,
        AWSRequestID,
        BytesProcessed,
        ClientExecuteTime,
        CredentialsRequestTime,
        Exception,
        HttpRequestTime,
        RedirectLocation,
        RequestMarshallTime,
        RequestSigningTime,
        ResponseProcessingTime,
        RequestCount,
        RetryCount,
        HttpClientRetryCount,
        HttpClientSendRequestTime,
        HttpClientReceiveResponseTime,
        RetryPauseTime,
        ServiceEndpoint,
        ServiceName,
        StatusCode
    }

    public AWSRequestMetrics() {
        this.timingInfo = TimingInfo.startTiming();
    }

    public AWSRequestMetrics(TimingInfo timingInfo) {
        this.timingInfo = timingInfo;
    }

    public void addProperty(MetricType metricType, Object obj) {
    }

    public void addProperty(String str, Object obj) {
    }

    public void endEvent(MetricType metricType) {
    }

    public void endEvent(String str) {
    }

    public List<Object> getProperty(MetricType metricType) {
        return Collections.emptyList();
    }

    public List<Object> getProperty(String str) {
        return Collections.emptyList();
    }

    public final TimingInfo getTimingInfo() {
        return this.timingInfo;
    }

    public void incrementCounter(MetricType metricType) {
    }

    public void incrementCounter(String str) {
    }

    public boolean isEnabled() {
        return false;
    }

    public void log() {
    }

    public void setCounter(MetricType metricType, long j9) {
    }

    public void setCounter(String str, long j9) {
    }

    public void startEvent(MetricType metricType) {
    }

    public void startEvent(String str) {
    }
}
