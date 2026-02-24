package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.util.StringUtils;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class S3StringResponseHandler extends AbstractS3ResponseHandler<String> {
    private static final int DEFAULT_BYTE_SIZE = 1024;

    @Override // com.amazonaws.http.HttpResponseHandler
    public AmazonWebServiceResponse<String> handle(HttpResponse httpResponse) throws Exception {
        AmazonWebServiceResponse<String> responseMetadata = parseResponseMetadata(httpResponse);
        byte[] bArr = new byte[1024];
        StringBuilder sb = new StringBuilder();
        InputStream content = httpResponse.getContent();
        while (true) {
            int i9 = content.read(bArr);
            if (i9 <= 0) {
                responseMetadata.setResult(sb.toString());
                return responseMetadata;
            }
            sb.append(new String(bArr, 0, i9, StringUtils.UTF8));
        }
    }
}
