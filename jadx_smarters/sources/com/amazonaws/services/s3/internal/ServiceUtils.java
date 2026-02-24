package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.s3.S3ClientOptions;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.SSEAlgorithm;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import com.amplifyframework.core.model.ModelIdentifier;
import java.io.File;
import java.net.MalformedURLException;
import java.net.SocketException;
import java.net.URL;
import java.util.Date;
import java.util.List;
import javax.net.ssl.SSLProtocolException;

/* JADX INFO: loaded from: classes.dex */
public class ServiceUtils {
    public static final boolean APPEND_MODE = true;
    private static final int DEAFAULT_BYTE_SIZE = 10240;
    public static final boolean OVERWRITE_MODE = false;
    private static final Log log = LogFactory.getLog((Class<?>) ServiceUtils.class);

    @Deprecated
    protected static final DateUtils DATE_UTILS = new DateUtils();

    public interface RetryableS3DownloadTask {
        S3Object getS3ObjectStream();

        boolean needIntegrityCheck();
    }

    public static URL convertRequestToUrl(Request<?> request) {
        return convertRequestToUrl(request, false);
    }

    public static URL convertRequestToUrl(Request<?> request, boolean z9) {
        String str;
        boolean z10 = true;
        String strUrlEncode = S3HttpUtils.urlEncode(request.getResourcePath(), true);
        if (z9 && strUrlEncode.startsWith("/")) {
            strUrlEncode = strUrlEncode.substring(1);
        }
        String str2 = request.getEndpoint() + ("/" + strUrlEncode).replaceAll("(?<=/)/", "%2F");
        for (String str3 : request.getParameters().keySet()) {
            if (z10) {
                str = str2 + "?";
                z10 = false;
            } else {
                str = str2 + "&";
            }
            str2 = str + str3 + "=" + S3HttpUtils.urlEncode(request.getParameters().get(str3), false);
        }
        try {
            return new URL(str2);
        } catch (MalformedURLException e9) {
            throw new AmazonClientException("Unable to convert request to well formed URL: " + e9.getMessage(), e9);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0097 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c2 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void downloadObjectToFile(com.amazonaws.services.s3.model.S3Object r5, java.io.File r6, boolean r7, boolean r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.services.s3.internal.ServiceUtils.downloadObjectToFile(com.amazonaws.services.s3.model.S3Object, java.io.File, boolean, boolean):void");
    }

    public static String formatIso8601Date(Date date) {
        return DateUtils.formatISO8601Date(date);
    }

    public static String formatRfc822Date(Date date) {
        return DateUtils.formatRFC822Date(date);
    }

    public static boolean isMultipartUploadETag(String str) {
        return str.contains("-");
    }

    public static String join(List<String> list) {
        String str = "";
        boolean z9 = true;
        for (String str2 : list) {
            if (!z9) {
                str = str + ", ";
            }
            str = str + str2;
            z9 = false;
        }
        return str;
    }

    public static Date parseIso8601Date(String str) {
        return DateUtils.parseISO8601Date(str);
    }

    public static Date parseRfc822Date(String str) {
        return DateUtils.parseRFC822Date(str);
    }

    public static String removeQuotes(String str) {
        if (str == null) {
            return null;
        }
        String strTrim = str.trim();
        if (strTrim.startsWith(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR)) {
            strTrim = strTrim.substring(1);
        }
        return strTrim.endsWith(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR) ? strTrim.substring(0, strTrim.length() - 1) : strTrim;
    }

    public static S3Object retryableDownloadS3ObjectToFile(File file, RetryableS3DownloadTask retryableS3DownloadTask, boolean z9) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        while (true) {
            S3Object s3ObjectStream = retryableS3DownloadTask.getS3ObjectStream();
            if (s3ObjectStream == null) {
                return null;
            }
            try {
                try {
                    downloadObjectToFile(s3ObjectStream, file, retryableS3DownloadTask.needIntegrityCheck(), z9);
                    s3ObjectStream.getObjectContent().abort();
                    z11 = z12;
                    z10 = false;
                } catch (AmazonClientException e9) {
                    if (!e9.isRetryable()) {
                        throw e9;
                    }
                    if ((e9.getCause() instanceof SocketException) || (e9.getCause() instanceof SSLProtocolException)) {
                        throw e9;
                    }
                    if (z12) {
                        throw e9;
                    }
                    log.info("Retry the download of object " + s3ObjectStream.getKey() + " (bucket " + s3ObjectStream.getBucketName() + ")", e9);
                    s3ObjectStream.getObjectContent().abort();
                    z10 = true;
                    z11 = true;
                }
                if (!z10) {
                    return s3ObjectStream;
                }
                z12 = z11;
            } catch (Throwable th) {
                s3ObjectStream.getObjectContent().abort();
                throw th;
            }
        }
    }

    public static boolean skipMd5CheckPerRequest(AmazonWebServiceRequest amazonWebServiceRequest) {
        return skipMd5CheckPerRequest(amazonWebServiceRequest, null);
    }

    public static boolean skipMd5CheckPerRequest(AmazonWebServiceRequest amazonWebServiceRequest, S3ClientOptions s3ClientOptions) {
        if ((s3ClientOptions != null && s3ClientOptions.isContentMd5CheckSkipped()) || System.getProperty("com.amazonaws.services.s3.disableGetObjectMD5Validation") != null) {
            return true;
        }
        if (amazonWebServiceRequest instanceof GetObjectRequest) {
            GetObjectRequest getObjectRequest = (GetObjectRequest) amazonWebServiceRequest;
            if (getObjectRequest.getRange() != null || getObjectRequest.getSSECustomerKey() != null) {
                return true;
            }
        } else {
            if (!(amazonWebServiceRequest instanceof PutObjectRequest)) {
                return (amazonWebServiceRequest instanceof UploadPartRequest) && ((UploadPartRequest) amazonWebServiceRequest).getSSECustomerKey() != null;
            }
            PutObjectRequest putObjectRequest = (PutObjectRequest) amazonWebServiceRequest;
            ObjectMetadata metadata = putObjectRequest.getMetadata();
            if ((metadata != null && metadata.getSSEAlgorithm() != null) || putObjectRequest.getSSECustomerKey() != null) {
                return true;
            }
            if (putObjectRequest.getSSEAwsKeyManagementParams() != null && (putObjectRequest.getSSEAwsKeyManagementParams().getEncryption() != null || putObjectRequest.getSSEAwsKeyManagementParams().getAwsKmsKeyId() != null)) {
                return true;
            }
        }
        return false;
    }

    public static boolean skipMd5CheckPerResponse(ObjectMetadata objectMetadata) {
        return skipMd5CheckPerResponse(objectMetadata, null);
    }

    public static boolean skipMd5CheckPerResponse(ObjectMetadata objectMetadata, S3ClientOptions s3ClientOptions) {
        if (s3ClientOptions != null && s3ClientOptions.isContentMd5CheckSkipped()) {
            return true;
        }
        if (objectMetadata == null) {
            return false;
        }
        return objectMetadata.getSSECustomerAlgorithm() != null || SSEAlgorithm.KMS.toString().equals(objectMetadata.getSSEAlgorithm());
    }

    public static byte[] toByteArray(String str) {
        return str.getBytes(StringUtils.UTF8);
    }
}
