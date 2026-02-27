package com.amazonaws.services.s3.internal;

import com.amazonaws.http.HttpResponse;
import com.amazonaws.services.s3.Headers;
import com.amazonaws.services.s3.internal.S3VersionResult;

/* JADX INFO: loaded from: classes.dex */
public class S3VersionHeaderHandler<T extends S3VersionResult> implements HeaderHandler<T> {
    @Override // com.amazonaws.services.s3.internal.HeaderHandler
    public void handle(T t9, HttpResponse httpResponse) {
        t9.setVersionId(httpResponse.getHeaders().get(Headers.S3_VERSION_ID));
    }
}
