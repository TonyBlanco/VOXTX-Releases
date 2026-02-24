package com.amazonaws.mobile.client.internal.oauth2;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.amazonaws.mobile.client.AWSMobileClient;
import com.amazonaws.mobile.client.Callback;
import com.amazonaws.mobile.client.internal.oauth2.OAuth2Constants;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.amazonaws.mobileconnectors.cognitoauth.util.Pkce;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import p.AbstractC2382c;
import p.AbstractServiceConnectionC2384e;
import p.C2381b;
import p.C2383d;
import p.C2385f;

/* JADX INFO: loaded from: classes.dex */
public class OAuth2Client {
    public static final String CREATE_DATE = "createDate";
    public static final String CUSTOM_TABS_PACKAGE_NAME = "com.android.chrome";
    private static final long REFRESH_THRESHOLD = 60000;
    public static final String SHARED_PREFERENCES_KEY = "com.amazonaws.mobile.client.oauth2";
    public static final String SIGN_IN_REDIRECT_URI_KEY = "signInRedirectUri";
    public static final String SIGN_OUT_REDIRECT_URI_KEY = "signOutRedirectUri";
    public static final String TAG = "OAuth2Client";
    public static final String TOKEN_URI_KEY = "tokenUri";
    Callback<AuthorizeResponse> mAuthorizeCallback;
    private boolean mAuthorizeOrSignOutRedirectReceived;
    private String mClientId;
    final Context mContext;
    AbstractC2382c mCustomTabsClient;
    final AbstractServiceConnectionC2384e mCustomTabsServiceConnection;
    C2385f mCustomTabsSession;
    private String mError;
    private String mErrorDescription;
    private String mErrorUriString;
    final AWSMobileClient mMobileClient;
    private Callback<Void> mSignOutCallback;
    String mState;
    private String userAgentOverride;
    boolean mIsPersistenceEnabled = true;
    PKCEMode mPKCEMode = PKCEMode.S256;
    private final OAuth2ClientStore mStore = new OAuth2ClientStore(this);
    C2381b mCustomTabsCallback = new C2381b() { // from class: com.amazonaws.mobile.client.internal.oauth2.OAuth2Client.1
        @Override // p.C2381b
        public void onNavigationEvent(int i9, Bundle bundle) {
            super.onNavigationEvent(i9, bundle);
            if (i9 != 6 || OAuth2Client.this.mAuthorizeOrSignOutRedirectReceived) {
                return;
            }
            if (OAuth2Client.this.mSignOutCallback != null) {
                OAuth2Client.this.mSignOutCallback.onError(new Exception("User cancelled flow or flow interrupted."));
                OAuth2Client.this.mSignOutCallback = null;
                return;
            }
            Callback<AuthorizeResponse> callback = OAuth2Client.this.mAuthorizeCallback;
            if (callback != null) {
                callback.onError(new Exception("User cancelled flow or flow interrupted."));
                OAuth2Client.this.mAuthorizeCallback = null;
            }
        }
    };

    /* JADX INFO: renamed from: com.amazonaws.mobile.client.internal.oauth2.OAuth2Client$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$amazonaws$mobile$client$internal$oauth2$OAuth2Client$PKCEMode;

        static {
            int[] iArr = new int[PKCEMode.values().length];
            $SwitchMap$com$amazonaws$mobile$client$internal$oauth2$OAuth2Client$PKCEMode = iArr;
            try {
                iArr[PKCEMode.S256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazonaws$mobile$client$internal$oauth2$OAuth2Client$PKCEMode[PKCEMode.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum PKCEMode {
        NONE(""),
        S256(ClientConstants.DOMAIN_QUERY_PARAM_CODE_CHALLENGE_METHOD_SHA256);

        private String encode;

        PKCEMode(String str) {
            this.encode = str;
        }

        public boolean equals(PKCEMode pKCEMode) {
            return pKCEMode.encode.equals(this.encode);
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.encode;
        }
    }

    public OAuth2Client(Context context, AWSMobileClient aWSMobileClient) {
        this.mMobileClient = aWSMobileClient;
        this.mContext = context;
        AbstractServiceConnectionC2384e abstractServiceConnectionC2384e = new AbstractServiceConnectionC2384e() { // from class: com.amazonaws.mobile.client.internal.oauth2.OAuth2Client.2
            @Override // p.AbstractServiceConnectionC2384e
            public void onCustomTabsServiceConnected(ComponentName componentName, AbstractC2382c abstractC2382c) {
                OAuth2Client.this.mCustomTabsClient = abstractC2382c;
                abstractC2382c.g(0L);
                OAuth2Client oAuth2Client = OAuth2Client.this;
                oAuth2Client.mCustomTabsSession = oAuth2Client.mCustomTabsClient.e(oAuth2Client.mCustomTabsCallback);
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                OAuth2Client.this.mCustomTabsClient = null;
            }
        };
        this.mCustomTabsServiceConnection = abstractServiceConnectionC2384e;
        if (AbstractC2382c.a(context, "com.android.chrome", abstractServiceConnectionC2384e)) {
            return;
        }
        Log.d(TAG, "OAuth2Client: Failed to pre-warm custom tab, first page load may be slower");
    }

    public void authorize(Uri uri, Callback<AuthorizeResponse> callback) {
        this.mAuthorizeCallback = callback;
        try {
            Uri.Builder builderBuildUpon = uri.buildUpon();
            int i9 = AnonymousClass3.$SwitchMap$com$amazonaws$mobile$client$internal$oauth2$OAuth2Client$PKCEMode[this.mPKCEMode.ordinal()];
            if (i9 == 1) {
                String strGenerateRandom = Pkce.generateRandom();
                String strGenerateHash = Pkce.generateHash(strGenerateRandom);
                this.mStore.set("proofKey", strGenerateRandom);
                this.mStore.set("proofKeyHash", strGenerateHash);
                builderBuildUpon.appendQueryParameter(ClientConstants.DOMAIN_QUERY_PARAM_CODE_CHALLENGE_METHOD, this.mPKCEMode.toString()).appendQueryParameter(ClientConstants.DOMAIN_QUERY_PARAM_CODE_CHALLENGE, strGenerateHash).build();
            } else if (i9 != 2) {
                throw new IllegalArgumentException("Unsupported PKCE mode was chosen, please choose another");
            }
            Uri uriBuild = builderBuildUpon.build();
            String queryParameter = uriBuild.getQueryParameter(ClientConstants.DOMAIN_QUERY_PARAM_CLIENT_ID);
            this.mClientId = queryParameter;
            if (queryParameter == null) {
                throw new IllegalArgumentException("The authorize URI must contain a client_id");
            }
            String queryParameter2 = uriBuild.getQueryParameter(ClientConstants.DOMAIN_QUERY_PARAM_REDIRECT_URI);
            if (queryParameter2 == null) {
                throw new IllegalArgumentException("The authorize URI must contain a redirect_uri");
            }
            this.mStore.set(SIGN_IN_REDIRECT_URI_KEY, queryParameter2);
            Uri.parse(queryParameter2);
            if (uriBuild.getQueryParameter(ClientConstants.DOMAIN_QUERY_PARAM_RESPONSE_TYPE) == null) {
                builderBuildUpon.appendQueryParameter(ClientConstants.DOMAIN_QUERY_PARAM_RESPONSE_TYPE, "code").build();
            }
            String queryParameter3 = uriBuild.getQueryParameter("state");
            this.mState = queryParameter3;
            if (queryParameter3 == null) {
                String strGenerateRandom2 = Pkce.generateRandom();
                this.mState = strGenerateRandom2;
                builderBuildUpon.appendQueryParameter("state", strGenerateRandom2).build();
            }
            this.mStore.set("state", this.mState);
            open(builderBuildUpon.build());
        } catch (Exception e9) {
            callback.onError(e9);
        }
    }

    public void getTokens(Callback<OAuth2Tokens> callback) {
        String str;
        try {
            OAuth2Tokens tokens = this.mStore.getTokens();
            if (tokens.expiresIn != null && (tokens.createDate.longValue() + tokens.expiresIn.longValue()) - System.currentTimeMillis() < REFRESH_THRESHOLD) {
                if (tokens.refreshToken == null || (str = this.mStore.get(TOKEN_URI_KEY)) == null) {
                    callback.onError(new Exception("No cached tokens available, refresh not available."));
                } else {
                    refresh(Uri.parse(str), new HashMap(), new HashMap(), callback);
                }
            }
            callback.onResult(tokens);
        } catch (Exception e9) {
            callback.onError(e9);
        }
    }

    public boolean handleRedirect(Uri uri) {
        if (uri == null) {
            return false;
        }
        String str = this.mStore.get(SIGN_IN_REDIRECT_URI_KEY);
        String str2 = this.mStore.get(SIGN_OUT_REDIRECT_URI_KEY);
        if (str != null) {
            Uri uri2 = Uri.parse(str);
            if (uri.getScheme().equals(uri2.getScheme()) && uri.getAuthority().equals(uri2.getAuthority()) && uri.getPath().equals(uri2.getPath()) && uri.getQueryParameterNames().containsAll(uri2.getQueryParameterNames())) {
                String queryParameter = uri.getQueryParameter("code");
                if (!this.mStore.get("state").equals(uri.getQueryParameter("state"))) {
                    return false;
                }
                this.mError = uri.getQueryParameter("error");
                this.mErrorDescription = uri.getQueryParameter(ClientConstants.DOMAIN_QUERY_PARAM_ERROR_DESCRIPTION);
                this.mErrorUriString = uri.getQueryParameter("error_uri");
                this.mAuthorizeOrSignOutRedirectReceived = true;
                if (this.mError != null) {
                    Callback<AuthorizeResponse> callback = this.mAuthorizeCallback;
                    if (callback != null) {
                        callback.onError(new OAuth2Exception("Authorization call failed with response from authorization server", this.mError, this.mErrorDescription, this.mErrorUriString));
                        this.mAuthorizeCallback = null;
                    }
                    return true;
                }
                if (queryParameter == null) {
                    return false;
                }
                if (this.mAuthorizeCallback != null) {
                    AuthorizeResponse authorizeResponse = new AuthorizeResponse();
                    authorizeResponse.code = queryParameter;
                    authorizeResponse.responseUri = uri;
                    this.mAuthorizeCallback.onResult(authorizeResponse);
                    this.mAuthorizeCallback = null;
                }
                return true;
            }
        }
        if (str2 != null) {
            Uri uri3 = Uri.parse(str2);
            if (uri.getScheme().equals(uri3.getScheme()) && uri.getAuthority().equals(uri3.getAuthority()) && uri.getPath().equals(uri3.getPath()) && uri.getQueryParameterNames().containsAll(uri3.getQueryParameterNames())) {
                this.mAuthorizeOrSignOutRedirectReceived = true;
                Callback<Void> callback2 = this.mSignOutCallback;
                if (callback2 != null) {
                    callback2.onResult(null);
                    this.mSignOutCallback = null;
                }
                return true;
            }
        }
        return false;
    }

    public void open(Uri uri) {
        C2383d c2383dA = new C2383d.a(this.mCustomTabsSession).a();
        c2383dA.f46190a.setPackage("com.android.chrome");
        c2383dA.f46190a.addFlags(1073741824);
        c2383dA.f46190a.addFlags(268435456);
        this.mAuthorizeOrSignOutRedirectReceived = false;
        c2383dA.a(this.mContext, uri);
    }

    public void refresh(Uri uri, Map<String, String> map, Map<String, String> map2, Callback<OAuth2Tokens> callback) {
        String str = this.mStore.get(OAuth2Constants.TokenResponseFields.REFRESH_TOKEN.toString());
        if (str == null) {
            callback.onError(new IllegalStateException("Refresh called without refresh token available"));
        }
        try {
            if (map2.get("grant_type") == null) {
                map2.put("grant_type", OAuth2Constants.GrantTypes.REFRESH_TOKEN.toString());
            }
            if (map2.get("refresh_token") == null) {
                if (str == null) {
                    throw new IllegalArgumentException("The refresh flow must contain a refresh_token");
                }
                map2.put("refresh_token", str);
            }
            OAuth2Tokens httpResponse = HTTPUtil.parseHttpResponse(HTTPUtil.httpPost(new URL(uri.toString()), map, map2, this.userAgentOverride));
            this.mStore.set(httpResponse);
            callback.onResult(httpResponse);
        } catch (Exception e9) {
            callback.onError(new Exception("Failed to refresh tokens with service", e9));
        }
    }

    public void requestTokens(Uri uri, Map<String, String> map, Map<String, String> map2, String str, Callback<OAuth2Tokens> callback) {
        String str2 = this.mStore.get("proofKey");
        if (str2 == null && !this.mPKCEMode.equals(PKCEMode.NONE)) {
            callback.onError(new Exception("Proof key could not be found from current session."));
        }
        try {
            if (map2.get(ClientConstants.DOMAIN_QUERY_PARAM_CLIENT_ID) == null) {
                throw new IllegalArgumentException("The token exchange must contain a client_id");
            }
            if (map2.get(ClientConstants.DOMAIN_QUERY_PARAM_REDIRECT_URI) == null) {
                throw new IllegalArgumentException("The token exchange must contain a redirect_uri");
            }
            if (map2.get("code") == null) {
                if (str == null) {
                    throw new IllegalArgumentException("The token exchange must contain a code");
                }
                map2.put("code", str);
            }
            if (map2.get(ClientConstants.DOMAIN_QUERY_PARAM_CODE_VERIFIER) == null) {
                if (str2 == null) {
                    throw new IllegalStateException("The token exchange must contain a code verifier");
                }
                map2.put(ClientConstants.DOMAIN_QUERY_PARAM_CODE_VERIFIER, str2);
            }
            if (map2.get("grant_type") == null) {
                map2.put("grant_type", OAuth2Constants.GrantTypes.AUTHORIZATION_CODE.toString());
            }
            this.mStore.set(TOKEN_URI_KEY, uri.toString());
            OAuth2Tokens httpResponse = HTTPUtil.parseHttpResponse(HTTPUtil.httpPost(new URL(uri.toString()), map, map2, this.userAgentOverride));
            this.mStore.set(httpResponse);
            callback.onResult(httpResponse);
        } catch (Exception e9) {
            callback.onError(new Exception("Failed to exchange code for tokens", e9));
        }
    }

    public void setPKCEMode(PKCEMode pKCEMode) {
        this.mPKCEMode = pKCEMode;
    }

    public void setPersistenceEnabled(boolean z9) {
        this.mIsPersistenceEnabled = z9;
        this.mStore.setPersistenceEnabled(z9);
    }

    public void setUserAgentOverride(String str) {
        this.userAgentOverride = str;
    }

    public void signOut() {
        this.mStore.clear();
        this.mSignOutCallback = null;
        this.mAuthorizeCallback = null;
        this.mPKCEMode = PKCEMode.S256;
        this.mState = null;
        this.mClientId = null;
        this.mError = null;
        this.mErrorDescription = null;
        this.mErrorUriString = null;
    }

    public void signOut(Uri uri, Callback<Void> callback) {
        this.mSignOutCallback = callback;
        String queryParameter = uri.getQueryParameter(ClientConstants.DOMAIN_QUERY_PARAM_REDIRECT_URI);
        if (queryParameter == null) {
            throw new IllegalArgumentException("The sign-out URI must contain a redirect_uri");
        }
        this.mStore.set(SIGN_OUT_REDIRECT_URI_KEY, queryParameter);
        Uri.parse(queryParameter);
        open(uri);
    }
}
