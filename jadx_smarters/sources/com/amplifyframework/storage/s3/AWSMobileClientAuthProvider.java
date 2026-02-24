package com.amplifyframework.storage.s3;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.mobile.client.AWSMobileClient;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.storage.StorageException;

/* JADX INFO: loaded from: classes.dex */
public final class AWSMobileClientAuthProvider implements CognitoAuthProvider {
    private static final String AUTH_DEPENDENCY_PLUGIN_KEY = "awsCognitoAuthPlugin";

    private AWSMobileClient getMobileClient() throws StorageException {
        try {
            return (AWSMobileClient) Amplify.Auth.getPlugin(AUTH_DEPENDENCY_PLUGIN_KEY).getEscapeHatch();
        } catch (IllegalStateException e9) {
            throw new StorageException("AWSS3StoragePlugin depends on AWSCognitoAuthPlugin but it is currently missing", e9, "Before configuring Amplify, be sure to add AWSCognitoAuthPlugin same as you added AWSS3StoragePlugin.");
        }
    }

    @Override // com.amplifyframework.storage.s3.CognitoAuthProvider
    public AWSCredentialsProvider getCredentialsProvider() throws StorageException {
        return getMobileClient();
    }

    @Override // com.amplifyframework.storage.s3.CognitoAuthProvider
    public String getIdentityId() throws StorageException {
        try {
            return getMobileClient().getIdentityId();
        } catch (RuntimeException e9) {
            throw new StorageException("Failed to get user's identity ID", e9, "Please check that you are logged in and that Auth is setup to support identity pools.");
        }
    }
}
