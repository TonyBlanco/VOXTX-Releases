package com.amazonaws.mobile.client;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.amazonaws.mobileconnectors.cognitoauth.util.Pkce;
import java.util.Map;
import p.AbstractC2382c;
import p.AbstractServiceConnectionC2384e;
import p.C2381b;
import p.C2383d;
import p.C2385f;

/* JADX INFO: loaded from: classes.dex */
class OAuth2Utils {
    private C2381b customTabsCallback = new C2381b();
    private final Context mContext;
    private AbstractC2382c mCustomTabsClient;
    private AbstractServiceConnectionC2384e mCustomTabsServiceConnection;
    private C2385f mCustomTabsSession;
    private String mError;
    private String mErrorDescription;
    private final Uri mSignInRedirectUri;
    private String mState;

    public OAuth2Utils(Context context, Uri uri) {
        this.mContext = context;
        this.mSignInRedirectUri = uri;
    }

    public void authorize(String str, String str2, Map<String, String> map) {
        this.mState = Pkce.generateRandom();
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        if (!map.containsKey("code")) {
            builderBuildUpon.appendQueryParameter(ClientConstants.DOMAIN_QUERY_PARAM_RESPONSE_TYPE, "code");
        }
        if (!map.containsKey(ClientConstants.DOMAIN_QUERY_PARAM_CLIENT_ID)) {
            if (str2 == null) {
                throw new IllegalArgumentException("Client id must be specified for an authorization request.");
            }
            builderBuildUpon.appendQueryParameter(ClientConstants.DOMAIN_QUERY_PARAM_CLIENT_ID, str2);
        }
        builderBuildUpon.appendQueryParameter("state", this.mState);
        navigate(builderBuildUpon.build());
    }

    public Uri exchangeCode(String str) {
        return null;
    }

    public void navigate(Uri uri) {
        C2383d c2383dA = new C2383d.a(this.mCustomTabsSession).a();
        c2383dA.f46190a.setPackage("com.android.chrome");
        c2383dA.f46190a.addFlags(1073741824);
        c2383dA.f46190a.addFlags(268435456);
        c2383dA.a(this.mContext, uri);
    }

    public boolean parse(Uri uri) {
        if (uri.getScheme().equals(this.mSignInRedirectUri.getScheme()) && uri.getAuthority().equals(this.mSignInRedirectUri.getAuthority()) && uri.getPath().equals(this.mSignInRedirectUri.getPath()) && uri.getQueryParameterNames().containsAll(this.mSignInRedirectUri.getQueryParameterNames())) {
            uri.getQueryParameter("code");
            if (!this.mState.equals(uri.getQueryParameter("state"))) {
                return false;
            }
            this.mError = uri.getQueryParameter("error");
            this.mErrorDescription = uri.getQueryParameter(ClientConstants.DOMAIN_QUERY_PARAM_ERROR_DESCRIPTION);
            if (this.mError != null) {
                return true;
            }
        }
        return false;
    }

    public void preWarm() {
        AbstractServiceConnectionC2384e abstractServiceConnectionC2384e = new AbstractServiceConnectionC2384e() { // from class: com.amazonaws.mobile.client.OAuth2Utils.1
            @Override // p.AbstractServiceConnectionC2384e
            public void onCustomTabsServiceConnected(ComponentName componentName, AbstractC2382c abstractC2382c) {
                OAuth2Utils.this.mCustomTabsClient = abstractC2382c;
                OAuth2Utils.this.mCustomTabsClient.g(0L);
                OAuth2Utils oAuth2Utils = OAuth2Utils.this;
                oAuth2Utils.mCustomTabsSession = oAuth2Utils.mCustomTabsClient.e(OAuth2Utils.this.customTabsCallback);
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                OAuth2Utils.this.mCustomTabsClient = null;
            }
        };
        this.mCustomTabsServiceConnection = abstractServiceConnectionC2384e;
        AbstractC2382c.a(this.mContext, "com.android.chrome", abstractServiceConnectionC2384e);
    }
}
