package com.amplifyframework.auth.cognito;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.mobile.client.AWSMobileClient;
import com.amazonaws.mobile.client.Callback;
import com.amazonaws.mobile.client.results.Tokens;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.util.CognitoJWTParser;
import com.amplifyframework.auth.AuthException;
import com.amplifyframework.auth.AuthSession;
import com.amplifyframework.auth.result.AuthSessionResult;
import com.amplifyframework.core.Consumer;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
final class MobileClientSessionAdapter {
    private static final List<String> MOBILE_CLIENT_INVALID_ACCOUNT_MESSAGES = Arrays.asList("getTokens does not support retrieving tokens for federated sign-in", "You must be signed-in with Cognito Userpools to be able to use getTokens", "Tokens are not supported for OAuth2", "Cognito Identity not configured");
    private static final List<String> MOBILE_CLIENT_SIGNED_OUT_MESSAGES = Arrays.asList("getTokens does not support retrieving tokens while signed-out");

    private MobileClientSessionAdapter() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void fetchIdentityPoolOnlySignedInSession(AWSMobileClient aWSMobileClient, Consumer<AuthSession> consumer) {
        fetchSignedInSessionWithUserPoolResults(AuthSessionResult.failure(new AuthException.InvalidAccountTypeException()), AuthSessionResult.failure(new AuthException.InvalidAccountTypeException()), aWSMobileClient, consumer);
    }

    public static void fetchSignedInSession(final AWSMobileClient aWSMobileClient, final Consumer<AuthSession> consumer) {
        aWSMobileClient.getTokens(new Callback<Tokens>() { // from class: com.amplifyframework.auth.cognito.MobileClientSessionAdapter.2
            @Override // com.amazonaws.mobile.client.Callback
            public void onError(Exception exc) {
                if (MobileClientSessionAdapter.MOBILE_CLIENT_INVALID_ACCOUNT_MESSAGES.contains(exc.getMessage())) {
                    MobileClientSessionAdapter.fetchIdentityPoolOnlySignedInSession(aWSMobileClient, consumer);
                } else if (MobileClientSessionAdapter.MOBILE_CLIENT_SIGNED_OUT_MESSAGES.contains(exc.getMessage())) {
                    MobileClientSessionAdapter.fetchSignedOutSession(aWSMobileClient, consumer);
                } else {
                    MobileClientSessionAdapter.fetchSignedInSessionWithUserPoolResults(AuthSessionResult.failure(new AuthException.UnknownException(exc)), AuthSessionResult.failure(new AuthException.UnknownException(exc)), aWSMobileClient, consumer);
                }
            }

            @Override // com.amazonaws.mobile.client.Callback
            public void onResult(Tokens tokens) {
                AuthSessionResult authSessionResultFailure;
                try {
                    authSessionResultFailure = AuthSessionResult.success(CognitoJWTParser.getPayload(tokens.getAccessToken().getTokenString()).getString("sub"));
                } catch (JSONException e9) {
                    authSessionResultFailure = AuthSessionResult.failure(new AuthException.UnknownException(e9));
                }
                MobileClientSessionAdapter.fetchSignedInSessionWithUserPoolResults(authSessionResultFailure, AuthSessionResult.success(new AWSCognitoUserPoolTokens(tokens.getAccessToken().getTokenString(), tokens.getIdToken().getTokenString(), tokens.getRefreshToken().getTokenString())), aWSMobileClient, consumer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void fetchSignedInSessionWithUserPoolAndAWSCredentialResults(AuthSessionResult<AWSCredentials> authSessionResult, AuthSessionResult<String> authSessionResult2, AuthSessionResult<AWSCognitoUserPoolTokens> authSessionResult3, AWSMobileClient aWSMobileClient, Consumer<AuthSession> consumer) {
        try {
            String identityId = aWSMobileClient.getIdentityId();
            consumer.accept(new AWSCognitoAuthSession(true, identityId != null ? AuthSessionResult.success(identityId) : AuthSessionResult.failure(new AuthException("AWSMobileClient returned awsCredentials but no identity id and no error", "This should never happen and is a bug with AWSMobileClient.")), authSessionResult, authSessionResult2, authSessionResult3));
        } catch (Throwable th) {
            consumer.accept(new AWSCognitoAuthSession(true, AuthSessionResult.failure(new AuthException.UnknownException(th)), authSessionResult, authSessionResult2, authSessionResult3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void fetchSignedInSessionWithUserPoolResults(final AuthSessionResult<String> authSessionResult, final AuthSessionResult<AWSCognitoUserPoolTokens> authSessionResult2, final AWSMobileClient aWSMobileClient, final Consumer<AuthSession> consumer) {
        aWSMobileClient.getAWSCredentials(new Callback<AWSCredentials>() { // from class: com.amplifyframework.auth.cognito.MobileClientSessionAdapter.3
            @Override // com.amazonaws.mobile.client.Callback
            public void onError(Exception exc) {
                AuthException invalidAccountTypeException = MobileClientSessionAdapter.MOBILE_CLIENT_INVALID_ACCOUNT_MESSAGES.contains(exc.getMessage()) ? new AuthException.InvalidAccountTypeException(exc) : new AuthException.UnknownException(exc);
                consumer.accept(new AWSCognitoAuthSession(true, AuthSessionResult.failure(invalidAccountTypeException), AuthSessionResult.failure(invalidAccountTypeException), authSessionResult, authSessionResult2));
            }

            @Override // com.amazonaws.mobile.client.Callback
            public void onResult(AWSCredentials aWSCredentials) {
                if (aWSCredentials != null) {
                    MobileClientSessionAdapter.fetchSignedInSessionWithUserPoolAndAWSCredentialResults(AuthSessionResult.success(aWSCredentials), authSessionResult, authSessionResult2, aWSMobileClient, consumer);
                } else {
                    AuthException authException = new AuthException("Could not fetch AWS Cognito credentials, but there was no error reported back from AWSMobileClient.getAWSCredentials call.", "This is a bug with the underlying AWSMobileClient");
                    consumer.accept(new AWSCognitoAuthSession(true, AuthSessionResult.failure(authException), AuthSessionResult.failure(authException), authSessionResult, authSessionResult2));
                }
            }
        });
    }

    public static void fetchSignedOutSession(final AWSMobileClient aWSMobileClient, final Consumer<AuthSession> consumer) {
        aWSMobileClient.getAWSCredentials(new Callback<AWSCredentials>() { // from class: com.amplifyframework.auth.cognito.MobileClientSessionAdapter.1
            @Override // com.amazonaws.mobile.client.Callback
            public void onError(Exception exc) {
                Consumer consumer2;
                AuthSession authSessionSignedOutSessionWithIdentityPool;
                if (exc.getMessage().contains("Cognito Identity not configured")) {
                    consumer2 = consumer;
                    authSessionSignedOutSessionWithIdentityPool = MobileClientSessionAdapter.signedOutSessionWithoutIdentityPool();
                } else {
                    consumer2 = consumer;
                    authSessionSignedOutSessionWithIdentityPool = MobileClientSessionAdapter.signedOutSessionWithIdentityPool();
                }
                consumer2.accept(authSessionSignedOutSessionWithIdentityPool);
            }

            @Override // com.amazonaws.mobile.client.Callback
            public void onResult(AWSCredentials aWSCredentials) {
                MobileClientSessionAdapter.fetchSignedOutSessionWithAWSCredentials(aWSCredentials, aWSMobileClient, consumer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void fetchSignedOutSessionWithAWSCredentials(AWSCredentials aWSCredentials, AWSMobileClient aWSMobileClient, Consumer<AuthSession> consumer) {
        try {
            consumer.accept(new AWSCognitoAuthSession(false, AuthSessionResult.success(aWSMobileClient.getIdentityId()), AuthSessionResult.success(aWSCredentials), AuthSessionResult.failure(new AuthException.SignedOutException()), AuthSessionResult.failure(new AuthException.SignedOutException())));
        } catch (Throwable th) {
            consumer.accept(new AWSCognitoAuthSession(false, AuthSessionResult.failure(new AuthException("Retrieved guest credentials but failed to retrieve Identity ID", th, "This should never happen. See the attached exception for more details.")), AuthSessionResult.success(aWSCredentials), AuthSessionResult.failure(new AuthException.SignedOutException()), AuthSessionResult.failure(new AuthException.SignedOutException())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AuthSession signedOutSessionWithIdentityPool() {
        AuthException.GuestAccess guestAccess = AuthException.GuestAccess.GUEST_ACCESS_POSSIBLE;
        return new AWSCognitoAuthSession(false, AuthSessionResult.failure(new AuthException.SignedOutException(guestAccess)), AuthSessionResult.failure(new AuthException.SignedOutException(guestAccess)), AuthSessionResult.failure(new AuthException.SignedOutException()), AuthSessionResult.failure(new AuthException.SignedOutException()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AuthSession signedOutSessionWithoutIdentityPool() {
        return new AWSCognitoAuthSession(false, AuthSessionResult.failure(new AuthException.InvalidAccountTypeException()), AuthSessionResult.failure(new AuthException.InvalidAccountTypeException()), AuthSessionResult.failure(new AuthException.SignedOutException()), AuthSessionResult.failure(new AuthException.SignedOutException()));
    }
}
