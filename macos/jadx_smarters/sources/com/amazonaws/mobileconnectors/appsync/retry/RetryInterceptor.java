package com.amazonaws.mobileconnectors.appsync.retry;

import android.util.Log;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Response;
import org.apache.http.HttpHeaders;

/* JADX INFO: loaded from: classes.dex */
public class RetryInterceptor implements Interceptor {
    private static final int BASE_RETRY_WAIT_MILLIS = 100;
    private static final int JITTER = 100;
    private static final int MAX_RETRY_COUNT = 12;
    private static final int MAX_RETRY_WAIT_MILLIS = 300000;
    private static final String TAG = "RetryInterceptor";

    public static int calculateBackoff(int i9) {
        return i9 >= 12 ? MAX_RETRY_WAIT_MILLIS : (int) Math.min((Math.pow(2.0d, i9) * 100.0d) + (Math.random() * 100.0d), 300000.0d);
    }

    private void sleep(int i9) {
        if (i9 > 0) {
            try {
                Log.d(TAG, "Will sleep for " + i9 + " ms as per backoff sequence");
                Thread.sleep((long) i9);
            } catch (InterruptedException unused) {
                Log.e(TAG, "Retry **wait** interrupted.");
            }
        }
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        int iCalculateBackoff;
        Log.d(TAG, "Retry Interceptor called");
        int i9 = -1;
        int i10 = 0;
        while (true) {
            sleep(i10);
            try {
                Response responseProceed = chain.proceed(chain.request());
                if (responseProceed.isSuccessful()) {
                    Log.i(TAG, "Returning network response: success");
                    return responseProceed;
                }
                i9++;
                String strHeader = responseProceed.header(HttpHeaders.RETRY_AFTER);
                if (strHeader != null) {
                    try {
                        int i11 = Integer.parseInt(strHeader) * 1000;
                        responseProceed.close();
                        iCalculateBackoff = i11;
                    } catch (NumberFormatException unused) {
                        String str = TAG;
                        Log.w(str, "Could not parse Retry-After header: " + strHeader);
                        Log.w(str, "Will proceed with exponential backoff strategy");
                        if (responseProceed.code() >= 500) {
                            Log.d(TAG, "Encountered non-retriable error. Returning response");
                            return responseProceed;
                        }
                        Log.d(TAG, "Encountered non-retriable error. Returning response");
                        return responseProceed;
                    }
                } else {
                    if ((responseProceed.code() >= 500 || responseProceed.code() >= 600) && responseProceed.code() != 429) {
                        Log.d(TAG, "Encountered non-retriable error. Returning response");
                        return responseProceed;
                    }
                    iCalculateBackoff = calculateBackoff(i9);
                    responseProceed.close();
                }
                if (iCalculateBackoff >= MAX_RETRY_WAIT_MILLIS) {
                    Log.i(TAG, "Returning network response, retries exhausted");
                    return responseProceed;
                }
                i10 = iCalculateBackoff;
            } catch (IOException e9) {
                Log.w(TAG, "Encountered IO Exception making HTTP call [" + e9 + "]");
                throw e9;
            }
        }
    }
}
