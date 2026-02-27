package com.amazonaws.mobileconnectors.appsync.sigv4;

import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoDevice;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUserPool;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUserSession;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.AuthenticationContinuation;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.ChallengeContinuation;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.MultiFactorAuthenticationContinuation;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.AuthenticationHandler;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes.dex */
public class BasicCognitoUserPoolsAuthProvider implements CognitoUserPoolsAuthProvider {
    private String lastTokenRetrievalFailureMessage;
    private String token;
    private CognitoUserPool userPool;

    public BasicCognitoUserPoolsAuthProvider(CognitoUserPool cognitoUserPool) {
        this.userPool = cognitoUserPool;
    }

    private synchronized void fetchToken() {
        try {
            final Semaphore semaphore = new Semaphore(0);
            this.lastTokenRetrievalFailureMessage = null;
            this.userPool.getCurrentUser().getSessionInBackground(new AuthenticationHandler() { // from class: com.amazonaws.mobileconnectors.appsync.sigv4.BasicCognitoUserPoolsAuthProvider.1
                @Override // com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.AuthenticationHandler
                public void authenticationChallenge(ChallengeContinuation challengeContinuation) {
                    BasicCognitoUserPoolsAuthProvider.this.lastTokenRetrievalFailureMessage = "Cognito Userpools is not signed-in";
                    semaphore.release();
                }

                @Override // com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.AuthenticationHandler
                public void getAuthenticationDetails(AuthenticationContinuation authenticationContinuation, String str) {
                    BasicCognitoUserPoolsAuthProvider.this.lastTokenRetrievalFailureMessage = "Cognito Userpools is not signed-in";
                    semaphore.release();
                }

                @Override // com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.AuthenticationHandler
                public void getMFACode(MultiFactorAuthenticationContinuation multiFactorAuthenticationContinuation) {
                    BasicCognitoUserPoolsAuthProvider.this.lastTokenRetrievalFailureMessage = "Cognito Userpools is not signed-in";
                    semaphore.release();
                }

                @Override // com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.AuthenticationHandler
                public void onFailure(Exception exc) {
                    BasicCognitoUserPoolsAuthProvider.this.lastTokenRetrievalFailureMessage = "Cognito Userpools failed to get session";
                    semaphore.release();
                }

                @Override // com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.AuthenticationHandler
                public void onSuccess(CognitoUserSession cognitoUserSession, CognitoDevice cognitoDevice) {
                    BasicCognitoUserPoolsAuthProvider.this.token = cognitoUserSession.getAccessToken().getJWTToken();
                    semaphore.release();
                }
            });
            try {
                semaphore.acquire();
                if (this.lastTokenRetrievalFailureMessage != null) {
                    throw new RuntimeException(this.lastTokenRetrievalFailureMessage);
                }
            } catch (InterruptedException e9) {
                throw new RuntimeException("Interrupted waiting for Cognito Userpools token.", e9);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.amazonaws.mobileconnectors.appsync.sigv4.CognitoUserPoolsAuthProvider
    public String getLatestAuthToken() {
        fetchToken();
        return this.token;
    }
}
