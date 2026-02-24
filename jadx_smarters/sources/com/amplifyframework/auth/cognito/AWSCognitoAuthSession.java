package com.amplifyframework.auth.cognito;

import com.amazonaws.auth.AWSCredentials;
import com.amplifyframework.auth.AuthSession;
import com.amplifyframework.auth.result.AuthSessionResult;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class AWSCognitoAuthSession extends AuthSession {
    private final AuthSessionResult<AWSCredentials> awsCredentials;
    private final AuthSessionResult<String> identityId;
    private final AuthSessionResult<AWSCognitoUserPoolTokens> userPoolTokens;
    private final AuthSessionResult<String> userSub;

    public AWSCognitoAuthSession(boolean z9, AuthSessionResult<String> authSessionResult, AuthSessionResult<AWSCredentials> authSessionResult2, AuthSessionResult<String> authSessionResult3, AuthSessionResult<AWSCognitoUserPoolTokens> authSessionResult4) {
        super(z9);
        Objects.requireNonNull(authSessionResult);
        this.identityId = authSessionResult;
        Objects.requireNonNull(authSessionResult2);
        this.awsCredentials = authSessionResult2;
        Objects.requireNonNull(authSessionResult3);
        this.userSub = authSessionResult3;
        Objects.requireNonNull(authSessionResult4);
        this.userPoolTokens = authSessionResult4;
    }

    @Override // com.amplifyframework.auth.AuthSession
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AWSCognitoAuthSession.class != obj.getClass()) {
            return false;
        }
        AWSCognitoAuthSession aWSCognitoAuthSession = (AWSCognitoAuthSession) obj;
        return O.c.a(Boolean.valueOf(isSignedIn()), Boolean.valueOf(aWSCognitoAuthSession.isSignedIn())) && O.c.a(getAWSCredentials(), aWSCognitoAuthSession.getAWSCredentials()) && O.c.a(getUserSub(), aWSCognitoAuthSession.getUserSub()) && O.c.a(getIdentityId(), aWSCognitoAuthSession.getIdentityId()) && O.c.a(getUserPoolTokens(), aWSCognitoAuthSession.getUserPoolTokens());
    }

    public AuthSessionResult<AWSCredentials> getAWSCredentials() {
        return this.awsCredentials;
    }

    public AuthSessionResult<String> getIdentityId() {
        return this.identityId;
    }

    public AuthSessionResult<AWSCognitoUserPoolTokens> getUserPoolTokens() {
        return this.userPoolTokens;
    }

    public AuthSessionResult<String> getUserSub() {
        return this.userSub;
    }

    @Override // com.amplifyframework.auth.AuthSession
    public int hashCode() {
        return O.c.b(Boolean.valueOf(isSignedIn()), getAWSCredentials(), getUserSub(), getIdentityId(), getUserPoolTokens());
    }

    @Override // com.amplifyframework.auth.AuthSession
    public String toString() {
        return "AWSCognitoAuthSession{isSignedIn=" + isSignedIn() + ", awsCredentials=" + getAWSCredentials() + ", userSub='" + getUserSub() + "', identityId='" + getIdentityId() + "', userPoolTokens='" + getUserPoolTokens() + "'}";
    }
}
