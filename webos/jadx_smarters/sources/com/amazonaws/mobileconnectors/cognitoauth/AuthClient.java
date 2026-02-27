package com.amazonaws.mobileconnectors.cognitoauth;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.amazonaws.cognito.clientcontext.data.UserContextDataProvider;
import com.amazonaws.mobileconnectors.cognitoauth.activities.CustomTabsManagerActivity;
import com.amazonaws.mobileconnectors.cognitoauth.exceptions.AuthClientException;
import com.amazonaws.mobileconnectors.cognitoauth.exceptions.AuthInvalidGrantException;
import com.amazonaws.mobileconnectors.cognitoauth.exceptions.AuthNavigationException;
import com.amazonaws.mobileconnectors.cognitoauth.exceptions.AuthServiceException;
import com.amazonaws.mobileconnectors.cognitoauth.exceptions.BrowserNotInstalledException;
import com.amazonaws.mobileconnectors.cognitoauth.handlers.AuthHandler;
import com.amazonaws.mobileconnectors.cognitoauth.util.AuthHttpClient;
import com.amazonaws.mobileconnectors.cognitoauth.util.AuthHttpResponseParser;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.amazonaws.mobileconnectors.cognitoauth.util.LocalDataManager;
import com.amazonaws.mobileconnectors.cognitoauth.util.Pkce;
import java.net.URL;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p.AbstractC2382c;
import p.AbstractServiceConnectionC2384e;
import p.C2383d;
import p.C2385f;

/* JADX INFO: loaded from: classes.dex */
public class AuthClient {
    private static final String BAD_REQUEST_ERROR = "invalid_request";
    public static final int CUSTOM_TABS_ACTIVITY_CODE = 49281;
    private static final String REDIRECT_ACTIVITY_NAME = "HostedUIRedirectActivity";
    private static final long REDIRECT_TIMEOUT_SECONDS = 10;
    private static final String TAG = "AuthClient";
    private final Context context;
    private CountDownLatch cookiesCleared;
    private String customTabsPackageName;
    private boolean isBrowserInstalled;
    private boolean isCustomTabSupported;
    private boolean isRedirectActivityDeclared;
    private AbstractC2382c mCustomTabsClient;
    private C2383d mCustomTabsIntent;
    private AbstractServiceConnectionC2384e mCustomTabsServiceConnection;
    private C2385f mCustomTabsSession;
    private final Auth pool;
    private String proofKey;
    private String proofKeyHash;
    private String state;
    private AuthHandler userHandler;
    private String userId;

    public AuthClient(Context context, Auth auth) {
        this(context, auth, null);
    }

    public AuthClient(Context context, Auth auth, String str) {
        this.context = context;
        this.pool = auth;
        this.userId = str;
        this.isRedirectActivityDeclared = false;
        this.isBrowserInstalled = false;
        this.isCustomTabSupported = false;
        if (isCustomTabSupported()) {
            preWarmCustomTabs();
        }
    }

    private void endSession(String str) throws AuthClientException {
        try {
            this.cookiesCleared = new CountDownLatch(1);
            launchSignOut(this.pool.getSignOutRedirectUri(), str);
            if (!isRedirectActivityDeclared()) {
                this.cookiesCleared.countDown();
            }
            if (!this.cookiesCleared.await(REDIRECT_TIMEOUT_SECONDS, TimeUnit.SECONDS)) {
                throw new AuthServiceException("Timed out while waiting for sign-out redirect response.");
            }
        } catch (InterruptedException unused) {
            throw new AuthNavigationException("User cancelled sign-out.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> generateTokenExchangeRequest(Uri uri, String str) {
        HashMap map = new HashMap();
        map.put("grant_type", ClientConstants.TOKEN_GRANT_TYPE_AUTH_CODE);
        map.put(ClientConstants.DOMAIN_QUERY_PARAM_CLIENT_ID, this.pool.getAppId());
        map.put(ClientConstants.DOMAIN_QUERY_PARAM_REDIRECT_URI, this.pool.getSignInRedirectUri());
        map.put(ClientConstants.DOMAIN_QUERY_PARAM_CODE_VERIFIER, str);
        map.put("code", uri.getQueryParameter("code"));
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> generateTokenRefreshRequest(String str, AuthUserSession authUserSession) {
        HashMap map = new HashMap();
        map.put("grant_type", "refresh_token");
        map.put(ClientConstants.DOMAIN_QUERY_PARAM_REDIRECT_URI, str);
        map.put(ClientConstants.DOMAIN_QUERY_PARAM_CLIENT_ID, this.pool.getAppId());
        map.put("refresh_token", authUserSession.getRefreshToken().getToken());
        String userContextData = getUserContextData();
        if (userContextData != null) {
            map.put(ClientConstants.DOMAIN_QUERY_PARAM_USERCONTEXTDATA, userContextData);
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getHttpHeader() {
        HashMap map = new HashMap();
        map.put("Content-Type", "application/x-www-form-urlencoded");
        if (this.pool.getAppSecret() != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Basic ");
            sb.append(Pkce.encodeBase64(this.pool.getAppId() + ":" + this.pool.getAppSecret()));
            map.put("Authorization", sb.toString());
        }
        return map;
    }

    private List<String> getSupportedCustomTabsPackages() {
        List<ResolveInfo> listQueryIntentServices = this.context.getPackageManager().queryIntentServices(new Intent().setAction("android.support.customtabs.action.CustomTabsService"), 0);
        ArrayList arrayList = new ArrayList();
        Iterator<ResolveInfo> it = listQueryIntentServices.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().serviceInfo.packageName);
        }
        return arrayList;
    }

    private void getTokens(final Uri uri, final AuthHandler authHandler) {
        new Thread(new Runnable() { // from class: com.amazonaws.mobileconnectors.cognitoauth.AuthClient.1
            final Handler handler;
            Runnable returnCallback = new Runnable() { // from class: com.amazonaws.mobileconnectors.cognitoauth.AuthClient.1.1
                @Override // java.lang.Runnable
                public void run() {
                    authHandler.onFailure(new InvalidParameterException());
                }
            };

            {
                this.handler = new Handler(AuthClient.this.context.getMainLooper());
            }

            @Override // java.lang.Runnable
            public void run() {
                Runnable runnable;
                Uri uriBuild = new Uri.Builder().scheme(ClientConstants.DOMAIN_SCHEME).authority(AuthClient.this.pool.getAppWebDomain()).appendPath(ClientConstants.DOMAIN_PATH_OAUTH2).appendPath(ClientConstants.DOMAIN_PATH_TOKEN_ENDPOINT).build();
                String queryParameter = uri.getQueryParameter("state");
                if (queryParameter != null) {
                    Set<String> cachedScopes = LocalDataManager.getCachedScopes(AuthClient.this.pool.awsKeyValueStore, AuthClient.this.context, queryParameter);
                    String cachedProofKey = LocalDataManager.getCachedProofKey(AuthClient.this.pool.awsKeyValueStore, AuthClient.this.context, queryParameter);
                    if (cachedProofKey == null) {
                        return;
                    }
                    final String queryParameter2 = uri.getQueryParameter("error");
                    if (queryParameter2 == null) {
                        try {
                            final AuthUserSession httpResponse = AuthHttpResponseParser.parseHttpResponse(new AuthHttpClient().httpPost(new URL(uriBuild.toString()), AuthClient.this.getHttpHeader(), AuthClient.this.generateTokenExchangeRequest(uri, cachedProofKey)));
                            AuthClient.this.userId = httpResponse.getUsername();
                            LocalDataManager.cacheSession(AuthClient.this.pool.awsKeyValueStore, AuthClient.this.context, AuthClient.this.pool.getAppId(), AuthClient.this.userId, httpResponse, cachedScopes);
                            this.returnCallback = new Runnable() { // from class: com.amazonaws.mobileconnectors.cognitoauth.AuthClient.1.3
                                @Override // java.lang.Runnable
                                public void run() {
                                    authHandler.onSuccess(httpResponse);
                                }
                            };
                        } catch (Exception e9) {
                            this.returnCallback = new Runnable() { // from class: com.amazonaws.mobileconnectors.cognitoauth.AuthClient.1.4
                                @Override // java.lang.Runnable
                                public void run() {
                                    authHandler.onFailure(e9);
                                }
                            };
                        }
                        this.handler.post(this.returnCallback);
                    }
                    String queryParameter3 = uri.getQueryParameter(ClientConstants.DOMAIN_QUERY_PARAM_ERROR_DESCRIPTION);
                    if (queryParameter2.equals(AuthClient.BAD_REQUEST_ERROR) && queryParameter3 != null) {
                        queryParameter2 = queryParameter3.trim();
                    }
                    runnable = new Runnable() { // from class: com.amazonaws.mobileconnectors.cognitoauth.AuthClient.1.2
                        @Override // java.lang.Runnable
                        public void run() {
                            authHandler.onFailure(new AuthServiceException(queryParameter2));
                        }
                    };
                } else {
                    if (AuthClient.this.cookiesCleared != null) {
                        AuthClient.this.cookiesCleared.countDown();
                        Log.d(AuthClient.TAG, "Sign-out was successful.");
                    }
                    runnable = new Runnable() { // from class: com.amazonaws.mobileconnectors.cognitoauth.AuthClient.1.5
                        @Override // java.lang.Runnable
                        public void run() {
                            authHandler.onSignout();
                        }
                    };
                }
                this.returnCallback = runnable;
                this.handler.post(this.returnCallback);
            }
        }).start();
    }

    private String getUserContextData() {
        if (this.pool.isAdvancedSecurityDataCollectionEnabled()) {
            return UserContextDataProvider.getInstance().getEncodedContextData(this.context, this.userId, this.pool.getUserPoolId(), this.pool.getAppId());
        }
        return null;
    }

    private boolean isBrowserInstalled() {
        if (this.isBrowserInstalled) {
            return true;
        }
        if (new Intent("android.intent.action.VIEW", Uri.parse("https://docs.amplify.aws/")).resolveActivity(this.context.getPackageManager()) == null) {
            return false;
        }
        this.isBrowserInstalled = true;
        return true;
    }

    private boolean isCustomTabSupported() {
        if (this.isCustomTabSupported) {
            return true;
        }
        List<String> supportedCustomTabsPackages = getSupportedCustomTabsPackages();
        if (supportedCustomTabsPackages.size() <= 0) {
            return false;
        }
        this.isCustomTabSupported = true;
        this.customTabsPackageName = AbstractC2382c.c(this.context, supportedCustomTabsPackages);
        return true;
    }

    private boolean isRedirectActivityDeclared() {
        if (this.isRedirectActivityDeclared) {
            return true;
        }
        Context context = this.context;
        if (context == null) {
            Log.w(TAG, "Context is null. Failed to inspect packages.");
            return false;
        }
        try {
            Iterator<PackageInfo> it = context.getPackageManager().getInstalledPackages(1).iterator();
            while (it.hasNext()) {
                ActivityInfo[] activityInfoArr = it.next().activities;
                if (activityInfoArr != null) {
                    for (ActivityInfo activityInfo : activityInfoArr) {
                        if (activityInfo.name.contains(REDIRECT_ACTIVITY_NAME)) {
                            this.isRedirectActivityDeclared = true;
                            return true;
                        }
                    }
                }
            }
            Log.w(TAG, "HostedUIRedirectActivity is not declared in AndroidManifest.");
        } catch (Exception unused) {
            Log.w(TAG, "Failed to inspect packages.");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void launchCognitoAuth(String str, Set<String> set, Activity activity, String str2) {
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme(ClientConstants.DOMAIN_SCHEME).authority(this.pool.getAppWebDomain()).appendPath(ClientConstants.DOMAIN_PATH_OAUTH2).appendPath(ClientConstants.DOMAIN_PATH_SIGN_IN).appendQueryParameter(ClientConstants.DOMAIN_QUERY_PARAM_CLIENT_ID, this.pool.getAppId()).appendQueryParameter(ClientConstants.DOMAIN_QUERY_PARAM_REDIRECT_URI, str).appendQueryParameter(ClientConstants.DOMAIN_QUERY_PARAM_RESPONSE_TYPE, "code").appendQueryParameter(ClientConstants.DOMAIN_QUERY_PARAM_CODE_CHALLENGE, this.proofKeyHash).appendQueryParameter(ClientConstants.DOMAIN_QUERY_PARAM_CODE_CHALLENGE_METHOD, ClientConstants.DOMAIN_QUERY_PARAM_CODE_CHALLENGE_METHOD_SHA256).appendQueryParameter("state", this.state).appendQueryParameter(ClientConstants.DOMAIN_QUERY_PARAM_USERCONTEXTDATA, getUserContextData());
        if (!TextUtils.isEmpty(this.pool.getIdentityProvider())) {
            builderAppendQueryParameter.appendQueryParameter(ClientConstants.DOMAIN_QUERY_PARAM_IDENTITY_PROVIDER, this.pool.getIdentityProvider());
        }
        if (!TextUtils.isEmpty(this.pool.getIdpIdentifier())) {
            builderAppendQueryParameter.appendQueryParameter(ClientConstants.DOMAIN_QUERY_PARAM_IDP_IDENTIFIER, this.pool.getIdpIdentifier());
        }
        int size = set.size();
        if (size > 0) {
            StringBuilder sb = new StringBuilder();
            Iterator<String> it = set.iterator();
            int i9 = 0;
            while (it.hasNext()) {
                sb.append(it.next());
                int i10 = i9 + 1;
                if (i9 < size - 1) {
                    sb.append(" ");
                }
                i9 = i10;
            }
            builderAppendQueryParameter.appendQueryParameter(ClientConstants.DOMAIN_QUERY_PARAM_SCOPES, sb.toString());
        }
        Uri uriBuild = builderAppendQueryParameter.build();
        LocalDataManager.cacheState(this.pool.awsKeyValueStore, this.context, this.state, this.proofKey, set);
        launchCustomTabs(uriBuild, activity, str2);
    }

    private void launchCustomTabs(Uri uri, Activity activity, String str) {
        try {
            if (!isBrowserInstalled()) {
                this.userHandler.onFailure(new BrowserNotInstalledException("No browsers installed."));
                return;
            }
            this.mCustomTabsIntent = new C2383d.a(this.mCustomTabsSession).a();
            if (this.pool.getCustomTabExtras() != null) {
                this.mCustomTabsIntent.f46190a.putExtras(this.pool.getCustomTabExtras());
            }
            if (str != null || (str = this.customTabsPackageName) != null) {
                Intent intent = this.mCustomTabsIntent.f46190a;
                intent.setPackage(str);
            }
            this.mCustomTabsIntent.f46190a.setData(uri);
            if (activity != null) {
                activity.startActivityForResult(CustomTabsManagerActivity.createStartIntent(this.context, this.mCustomTabsIntent.f46190a), 49281);
                return;
            }
            Intent intentCreateStartIntent = CustomTabsManagerActivity.createStartIntent(this.context, this.mCustomTabsIntent.f46190a);
            intentCreateStartIntent.addFlags(1342177280);
            this.context.startActivity(intentCreateStartIntent);
        } catch (Exception e9) {
            this.userHandler.onFailure(e9);
        }
    }

    private void launchSignOut(String str, String str2) {
        launchCustomTabs(new Uri.Builder().scheme(ClientConstants.DOMAIN_SCHEME).authority(this.pool.getAppWebDomain()).appendPath(ClientConstants.DOMAIN_PATH_SIGN_OUT).appendQueryParameter(ClientConstants.DOMAIN_QUERY_PARAM_CLIENT_ID, this.pool.getAppId()).appendQueryParameter(ClientConstants.DOMAIN_QUERY_PARAM_LOGOUT_URI, str).build(), null, str2);
    }

    private void preWarmCustomTabs() {
        if (this.customTabsPackageName == null) {
            return;
        }
        AbstractServiceConnectionC2384e abstractServiceConnectionC2384e = new AbstractServiceConnectionC2384e() { // from class: com.amazonaws.mobileconnectors.cognitoauth.AuthClient.3
            @Override // p.AbstractServiceConnectionC2384e
            public void onCustomTabsServiceConnected(ComponentName componentName, AbstractC2382c abstractC2382c) {
                AuthClient.this.mCustomTabsClient = abstractC2382c;
                AuthClient.this.mCustomTabsClient.g(0L);
                AuthClient authClient = AuthClient.this;
                authClient.mCustomTabsSession = authClient.mCustomTabsClient.e(null);
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                AuthClient.this.mCustomTabsClient = null;
            }
        };
        this.mCustomTabsServiceConnection = abstractServiceConnectionC2384e;
        AbstractC2382c.a(this.context, this.customTabsPackageName, abstractServiceConnectionC2384e);
    }

    private void refreshSession(final AuthUserSession authUserSession, final String str, final Set<String> set, final AuthHandler authHandler, final boolean z9, final String str2, final Activity activity) {
        new Thread(new Runnable() { // from class: com.amazonaws.mobileconnectors.cognitoauth.AuthClient.2
            final Handler handler;
            Runnable returnCallback;

            {
                this.handler = new Handler(AuthClient.this.context.getMainLooper());
            }

            @Override // java.lang.Runnable
            public void run() {
                Runnable runnable;
                Uri uriBuild = new Uri.Builder().scheme(ClientConstants.DOMAIN_SCHEME).authority(AuthClient.this.pool.getAppWebDomain()).appendPath(ClientConstants.DOMAIN_PATH_OAUTH2).appendPath(ClientConstants.DOMAIN_PATH_TOKEN_ENDPOINT).build();
                try {
                    AuthUserSession httpResponse = AuthHttpResponseParser.parseHttpResponse(new AuthHttpClient().httpPost(new URL(uriBuild.toString()), AuthClient.this.getHttpHeader(), AuthClient.this.generateTokenRefreshRequest(str, authUserSession)));
                    final AuthUserSession authUserSession2 = new AuthUserSession(httpResponse.getIdToken(), httpResponse.getAccessToken(), authUserSession.getRefreshToken());
                    LocalDataManager.cacheSession(AuthClient.this.pool.awsKeyValueStore, AuthClient.this.context, AuthClient.this.pool.getAppId(), authUserSession2.getUsername(), authUserSession2, AuthClient.this.pool.getScopes());
                    this.returnCallback = new Runnable() { // from class: com.amazonaws.mobileconnectors.cognitoauth.AuthClient.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            authHandler.onSuccess(authUserSession2);
                        }
                    };
                } catch (AuthInvalidGrantException e9) {
                    if (z9) {
                        this.returnCallback = new Runnable() { // from class: com.amazonaws.mobileconnectors.cognitoauth.AuthClient.2.2
                            @Override // java.lang.Runnable
                            public void run() {
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                AuthClient.this.launchCognitoAuth(str, set, activity, str2);
                            }
                        };
                    } else {
                        runnable = new Runnable() { // from class: com.amazonaws.mobileconnectors.cognitoauth.AuthClient.2.3
                            @Override // java.lang.Runnable
                            public void run() {
                                AuthClient.this.userHandler.onFailure(e9);
                            }
                        };
                        this.returnCallback = runnable;
                    }
                } catch (Exception e10) {
                    runnable = new Runnable() { // from class: com.amazonaws.mobileconnectors.cognitoauth.AuthClient.2.4
                        @Override // java.lang.Runnable
                        public void run() {
                            authHandler.onFailure(e10);
                        }
                    };
                    this.returnCallback = runnable;
                }
                this.handler.post(this.returnCallback);
            }
        }).start();
    }

    public void getSession(boolean z9, Activity activity) {
        getSession(z9, activity, null);
    }

    public void getSession(boolean z9, Activity activity, String str) {
        try {
            String strGenerateRandom = Pkce.generateRandom();
            this.proofKey = strGenerateRandom;
            this.proofKeyHash = Pkce.generateHash(strGenerateRandom);
            this.state = Pkce.generateRandom();
        } catch (Exception e9) {
            this.userHandler.onFailure(e9);
        }
        Auth auth = this.pool;
        AuthUserSession cachedSession = LocalDataManager.getCachedSession(auth.awsKeyValueStore, this.context, auth.getAppId(), this.userId, this.pool.getScopes());
        if (cachedSession.isValidForThreshold()) {
            this.userHandler.onSuccess(cachedSession);
            return;
        }
        if (cachedSession.getRefreshToken() != null && cachedSession.getRefreshToken().getToken() != null) {
            refreshSession(cachedSession, this.pool.getSignInRedirectUri(), this.pool.getScopes(), this.userHandler, z9, str, activity);
        } else if (z9) {
            launchCognitoAuth(this.pool.getSignInRedirectUri(), this.pool.getScopes(), activity, str);
        } else {
            this.userHandler.onFailure(new Exception("No cached session"));
        }
    }

    public void getTokens(Uri uri) {
        if (uri == null) {
            return;
        }
        getTokens(uri, this.userHandler);
    }

    public String getUsername() {
        return this.userId;
    }

    public void handleCustomTabsCancelled() {
        this.userHandler.onFailure(new AuthNavigationException("user cancelled"));
    }

    public boolean isAuthenticated() {
        Auth auth = this.pool;
        return LocalDataManager.getCachedSession(auth.awsKeyValueStore, this.context, auth.getAppId(), this.userId, this.pool.getScopes()).isValidForThreshold();
    }

    public void setUserHandler(AuthHandler authHandler) {
        if (authHandler == null) {
            throw new InvalidParameterException("Callback handler cannot be null");
        }
        this.userHandler = authHandler;
    }

    public void setUsername(String str) {
        this.userId = str;
    }

    public void signOut() {
        signOut((String) null);
    }

    public void signOut(String str) {
        signOut(false, str);
    }

    public void signOut(boolean z9) {
        signOut(z9, null);
    }

    public void signOut(boolean z9, String str) {
        if (!z9) {
            endSession(str);
        }
        Auth auth = this.pool;
        LocalDataManager.clearCache(auth.awsKeyValueStore, this.context, auth.getAppId(), this.userId);
    }

    public void unbindServiceConnection() {
        AbstractServiceConnectionC2384e abstractServiceConnectionC2384e = this.mCustomTabsServiceConnection;
        if (abstractServiceConnectionC2384e != null) {
            this.context.unbindService(abstractServiceConnectionC2384e);
        }
    }
}
