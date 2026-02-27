package com.amazonaws.mobileconnectors.appsync.sigv4;

import android.util.Log;
import com.amazonaws.mobile.config.AWSConfiguration;

/* JADX INFO: loaded from: classes.dex */
public class BasicAPIKeyAuthProvider implements APIKeyAuthProvider {
    private static final String TAG = "BasicAPIKeyAuthProvider";
    private final String apiKey;

    public BasicAPIKeyAuthProvider(AWSConfiguration aWSConfiguration) {
        try {
            this.apiKey = aWSConfiguration.optJsonObject("AppSync").getString("ApiKey");
        } catch (Exception e9) {
            Log.e(TAG, "Please check the ApiKey passed from awsconfiguration.json.");
            throw new RuntimeException("Please check the ApiKey passed from awsconfiguration.json.", e9);
        }
    }

    public BasicAPIKeyAuthProvider(String str) {
        this.apiKey = str;
    }

    @Override // com.amazonaws.mobileconnectors.appsync.sigv4.APIKeyAuthProvider
    public String getAPIKey() {
        return this.apiKey;
    }
}
