package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.ResponseMetadata;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.http.HttpResponseHandler;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.s3.Headers;
import com.amazonaws.services.s3.S3ResponseMetadata;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.util.DateUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractS3ResponseHandler<T> implements HttpResponseHandler<AmazonWebServiceResponse<T>> {
    private static final Set<String> IGNORED_HEADERS;
    private static final Log log = LogFactory.getLog((Class<?>) S3MetadataResponseHandler.class);

    static {
        HashSet hashSet = new HashSet();
        IGNORED_HEADERS = hashSet;
        hashSet.add("Date");
        hashSet.add("Server");
        hashSet.add(Headers.REQUEST_ID);
        hashSet.add(Headers.EXTENDED_REQUEST_ID);
        hashSet.add(Headers.CLOUD_FRONT_ID);
        hashSet.add("Connection");
    }

    @Override // com.amazonaws.http.HttpResponseHandler
    public boolean needsConnectionLeftOpen() {
        return false;
    }

    public AmazonWebServiceResponse<T> parseResponseMetadata(HttpResponse httpResponse) {
        AmazonWebServiceResponse<T> amazonWebServiceResponse = new AmazonWebServiceResponse<>();
        String str = httpResponse.getHeaders().get(Headers.REQUEST_ID);
        String str2 = httpResponse.getHeaders().get(Headers.EXTENDED_REQUEST_ID);
        String str3 = httpResponse.getHeaders().get(Headers.CLOUD_FRONT_ID);
        HashMap map = new HashMap();
        map.put(ResponseMetadata.AWS_REQUEST_ID, str);
        map.put(S3ResponseMetadata.HOST_ID, str2);
        map.put(S3ResponseMetadata.CLOUD_FRONT_ID, str3);
        amazonWebServiceResponse.setResponseMetadata(new S3ResponseMetadata(map));
        return amazonWebServiceResponse;
    }

    public void populateObjectMetadata(HttpResponse httpResponse, ObjectMetadata objectMetadata) {
        String strRemoveQuotes;
        Log log2;
        StringBuilder sb;
        String str;
        for (Map.Entry<String, String> entry : httpResponse.getHeaders().entrySet()) {
            String key = entry.getKey();
            if (key.startsWith(Headers.S3_USER_METADATA_PREFIX)) {
                objectMetadata.addUserMetadata(key.substring(11), entry.getValue());
            } else if (IGNORED_HEADERS.contains(key)) {
                log.debug(String.format("%s is ignored.", key));
            } else if (key.equalsIgnoreCase("Last-Modified")) {
                try {
                    objectMetadata.setHeader(key, ServiceUtils.parseRfc822Date(entry.getValue()));
                } catch (Exception e9) {
                    e = e9;
                    log2 = log;
                    sb = new StringBuilder();
                    str = "Unable to parse last modified date: ";
                    sb.append(str);
                    sb.append(entry.getValue());
                    log2.warn(sb.toString(), e);
                }
            } else if (key.equalsIgnoreCase("Content-Length")) {
                try {
                    objectMetadata.setHeader(key, Long.valueOf(Long.parseLong(entry.getValue())));
                } catch (NumberFormatException e10) {
                    e = e10;
                    log2 = log;
                    sb = new StringBuilder();
                    str = "Unable to parse content length: ";
                    sb.append(str);
                    sb.append(entry.getValue());
                    log2.warn(sb.toString(), e);
                }
            } else {
                if (key.equalsIgnoreCase("ETag")) {
                    strRemoveQuotes = ServiceUtils.removeQuotes(entry.getValue());
                } else if (key.equalsIgnoreCase("Expires")) {
                    try {
                        objectMetadata.setHttpExpiresDate(DateUtils.parseRFC822Date(entry.getValue()));
                    } catch (Exception e11) {
                        e = e11;
                        log2 = log;
                        sb = new StringBuilder();
                        str = "Unable to parse http expiration date: ";
                        sb.append(str);
                        sb.append(entry.getValue());
                        log2.warn(sb.toString(), e);
                    }
                } else if (key.equalsIgnoreCase(Headers.EXPIRATION)) {
                    new ObjectExpirationHeaderHandler().handle(objectMetadata, httpResponse);
                } else if (key.equalsIgnoreCase(Headers.RESTORE)) {
                    new ObjectRestoreHeaderHandler().handle(objectMetadata, httpResponse);
                } else if (key.equalsIgnoreCase(Headers.REQUESTER_CHARGED_HEADER)) {
                    new S3RequesterChargedHeaderHandler().handle(objectMetadata, httpResponse);
                } else if (key.equalsIgnoreCase(Headers.S3_PARTS_COUNT)) {
                    try {
                        objectMetadata.setHeader(key, Integer.valueOf(Integer.parseInt(entry.getValue())));
                    } catch (NumberFormatException e12) {
                        throw new AmazonClientException("Unable to parse part count. Header x-amz-mp-parts-count has corrupted data" + e12.getMessage(), e12);
                    }
                } else {
                    strRemoveQuotes = entry.getValue();
                }
                objectMetadata.setHeader(key, strRemoveQuotes);
            }
        }
    }
}
