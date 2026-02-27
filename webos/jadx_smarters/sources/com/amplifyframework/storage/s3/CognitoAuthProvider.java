package com.amplifyframework.storage.s3;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amplifyframework.storage.StorageException;

/* JADX INFO: loaded from: classes.dex */
public interface CognitoAuthProvider {
    AWSCredentialsProvider getCredentialsProvider() throws StorageException;

    String getIdentityId() throws StorageException;
}
