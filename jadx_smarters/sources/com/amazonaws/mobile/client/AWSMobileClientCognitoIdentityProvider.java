package com.amazonaws.mobile.client;

import com.amazonaws.auth.AWSAbstractCognitoIdentityProvider;
import com.amazonaws.services.cognitoidentity.AmazonCognitoIdentity;

/* JADX INFO: loaded from: classes.dex */
class AWSMobileClientCognitoIdentityProvider extends AWSAbstractCognitoIdentityProvider {
    boolean isDeveloperAuthenticated;

    public AWSMobileClientCognitoIdentityProvider(String str, String str2, AmazonCognitoIdentity amazonCognitoIdentity) {
        super(str, str2, amazonCognitoIdentity);
    }

    @Override // com.amazonaws.auth.AWSAbstractCognitoIdentityProvider
    public String getProviderName() {
        return "Cognito";
    }

    @Override // com.amazonaws.auth.AWSAbstractCognitoIdentityProvider
    public String getUserAgent() {
        return AWSMobileClient.DEFAULT_USER_AGENT;
    }

    @Override // com.amazonaws.auth.AWSAbstractCognitoIdentityProvider, com.amazonaws.auth.AWSIdentityProvider
    public String refresh() {
        if (this.isDeveloperAuthenticated) {
            return this.token;
        }
        getIdentityId();
        return null;
    }

    public void setDeveloperAuthenticated(String str, String str2) {
        super.setIdentityId(str);
        super.setToken(str2);
        this.isDeveloperAuthenticated = true;
    }

    public void setNotDeveloperAuthenticated() {
        this.isDeveloperAuthenticated = false;
    }
}
