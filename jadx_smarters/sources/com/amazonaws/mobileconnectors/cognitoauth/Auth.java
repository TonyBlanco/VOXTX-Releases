package com.amazonaws.mobileconnectors.cognitoauth;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Patterns;
import com.amazonaws.internal.keyvaluestore.AWSKeyValueStore;
import com.amazonaws.mobileconnectors.cognitoauth.exceptions.AuthInvalidParameterException;
import com.amazonaws.mobileconnectors.cognitoauth.handlers.AuthHandler;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.amazonaws.mobileconnectors.cognitoauth.util.LocalDataManager;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class Auth {
    private boolean advancedSecurityDataCollectionFlag;
    private final String appId;
    private final String appSecret;
    private final String appWebDomain;
    AWSKeyValueStore awsKeyValueStore;
    private String browserPackage;
    private final Context context;
    private final Bundle customTabExtras;
    private final String identityProvider;
    private final String idpIdentifier;
    private boolean isPersistenceEnabled;
    private final Set<String> scopes;
    private final String signInRedirectUri;
    private final String signOutRedirectUri;
    private AuthClient user;
    private final String userPoolId;

    public static final class Builder {
        private String mAppClientId;
        private Context mAppContext;
        private String mAppSecret;
        private String mAppWebDomain;
        private Bundle mCustomTabsExtras;
        private String mIdentityProvider;
        private String mIdpIdentifier;
        private Set<String> mScopes;
        private String mSignInRedirect;
        private String mSignOutRedirect;
        private AuthHandler mUserHandler;
        private String mUserPoolId;
        private boolean mAdvancedSecurityDataCollectionFlag = true;
        private boolean mIsCachingEnabled = true;

        private boolean isValidDomain(String str) {
            if (str == null) {
                return false;
            }
            return Patterns.DOMAIN_NAME.matcher(str).matches();
        }

        private void validateCognitoAuthParameters() {
            boolean z9;
            JSONObject jSONObject = new JSONObject();
            try {
                boolean z10 = true;
                if (this.mAppContext == null) {
                    jSONObject.put("ApplicationContext", "cannot be null");
                    z9 = true;
                } else {
                    z9 = false;
                }
                String str = this.mAppClientId;
                if (str == null || str.length() < 1) {
                    jSONObject.put("AppClientId", "invalid");
                    z9 = true;
                }
                if (!isValidDomain(this.mAppWebDomain)) {
                    jSONObject.put("AppCognitoWebDomain", "invalid");
                    z9 = true;
                }
                if (this.mSignInRedirect == null) {
                    jSONObject.put("SignInRedirect", "cannot be null");
                    z9 = true;
                }
                if (this.mSignOutRedirect == null) {
                    jSONObject.put("SignOutRedirect", "cannot be null");
                    z9 = true;
                }
                if (this.mScopes == null) {
                    this.mScopes = new HashSet();
                }
                String str2 = this.mAppSecret;
                if (str2 != null && str2.length() < 1) {
                    this.mAppSecret = null;
                }
                if (this.mUserHandler == null) {
                    jSONObject.put("AuthHandler", "cannot be null");
                } else {
                    z10 = z9;
                }
                if (z10) {
                    throw new AuthInvalidParameterException(jSONObject.toString());
                }
            } catch (Exception e9) {
                throw new AuthInvalidParameterException("validation failed", e9);
            }
        }

        public Auth build() {
            validateCognitoAuthParameters();
            return new Auth(this.mAppContext, this.mUserPoolId, this.mAppWebDomain, this.mAppClientId, this.mAppSecret, this.mSignInRedirect, this.mSignOutRedirect, this.mScopes, this.mUserHandler, this.mAdvancedSecurityDataCollectionFlag, this.mIdentityProvider, this.mIdpIdentifier, this.mCustomTabsExtras, this.mIsCachingEnabled);
        }

        public Builder setAdvancedSecurityDataCollection(boolean z9) {
            this.mAdvancedSecurityDataCollectionFlag = z9;
            return this;
        }

        public Builder setAppClientId(String str) {
            this.mAppClientId = str;
            return this;
        }

        public Builder setAppClientSecret(String str) {
            this.mAppSecret = str;
            return this;
        }

        public Builder setAppCognitoWebDomain(String str) {
            this.mAppWebDomain = str;
            return this;
        }

        public Builder setApplicationContext(Context context) {
            this.mAppContext = context;
            return this;
        }

        public Builder setAuthHandler(AuthHandler authHandler) {
            this.mUserHandler = authHandler;
            return this;
        }

        public Builder setCustomTabsExtras(Bundle bundle) {
            this.mCustomTabsExtras = bundle;
            return this;
        }

        public Builder setIdentityProvider(String str) {
            this.mIdentityProvider = str;
            return this;
        }

        public Builder setIdpIdentifier(String str) {
            this.mIdpIdentifier = str;
            return this;
        }

        public Builder setPersistenceEnabled(boolean z9) {
            this.mIsCachingEnabled = z9;
            return this;
        }

        public Builder setScopes(Set<String> set) {
            this.mScopes = set;
            return this;
        }

        public Builder setSignInRedirect(String str) {
            this.mSignInRedirect = str;
            return this;
        }

        public Builder setSignOutRedirect(String str) {
            this.mSignOutRedirect = str;
            return this;
        }

        public Builder setUserPoolId(String str) {
            this.mUserPoolId = str;
            return this;
        }
    }

    private Auth(Context context, String str, String str2, String str3, String str4, String str5, String str6, Set<String> set, AuthHandler authHandler, boolean z9, String str7, String str8, Bundle bundle, boolean z10) {
        this.isPersistenceEnabled = true;
        this.context = context;
        this.appWebDomain = str2;
        this.appId = str3;
        this.appSecret = str4;
        this.signInRedirectUri = str5;
        this.signOutRedirectUri = str6;
        this.scopes = set;
        AuthClient authClient = new AuthClient(context, this);
        this.user = authClient;
        authClient.setUserHandler(authHandler);
        this.userPoolId = str;
        this.advancedSecurityDataCollectionFlag = z9;
        this.identityProvider = str7;
        this.idpIdentifier = str8;
        this.customTabExtras = bundle;
        this.isPersistenceEnabled = z10;
        this.awsKeyValueStore = new AWSKeyValueStore(context, ClientConstants.APP_LOCAL_CACHE, this.isPersistenceEnabled);
        getCurrentUser();
    }

    public String getAppId() {
        return this.appId;
    }

    public String getAppSecret() {
        return this.appSecret;
    }

    public String getAppWebDomain() {
        return this.appWebDomain;
    }

    public String getBrowserPackage() {
        return this.browserPackage;
    }

    public Auth getCurrentUser() {
        this.user.setUsername(LocalDataManager.getLastAuthUser(this.awsKeyValueStore, this.context, this.appId));
        return this;
    }

    public Bundle getCustomTabExtras() {
        return this.customTabExtras;
    }

    public String getIdentityProvider() {
        return this.identityProvider;
    }

    public String getIdpIdentifier() {
        return this.idpIdentifier;
    }

    public Set<String> getScopes() {
        return this.scopes;
    }

    public void getSession(Activity activity) {
        if (getBrowserPackage() != null) {
            this.user.getSession(true, activity, getBrowserPackage());
        } else {
            this.user.getSession(true, activity);
        }
    }

    public void getSessionWithoutWebUI() {
        this.user.getSession(false, null);
    }

    public String getSignInRedirectUri() {
        return this.signInRedirectUri;
    }

    public String getSignOutRedirectUri() {
        return this.signOutRedirectUri;
    }

    public void getTokens(Uri uri) {
        this.user.getTokens(uri);
    }

    public String getUserPoolId() {
        return this.userPoolId;
    }

    public String getUsername() {
        return this.user.getUsername();
    }

    public void handleFlowCancelled() {
        this.user.handleCustomTabsCancelled();
    }

    public boolean isAdvancedSecurityDataCollectionEnabled() {
        return this.advancedSecurityDataCollectionFlag;
    }

    public boolean isAuthenticated() {
        return this.user.isAuthenticated();
    }

    public void release() {
        this.user.unbindServiceConnection();
    }

    public void setAdvancedSecurityDataCollection(boolean z9) {
        this.advancedSecurityDataCollectionFlag = z9;
    }

    public void setAuthHandler(AuthHandler authHandler) {
        this.user.setUserHandler(authHandler);
    }

    public void setBrowserPackage(String str) {
        this.browserPackage = str;
    }

    public void setPersistenceEnabled(boolean z9) {
        this.isPersistenceEnabled = z9;
        this.awsKeyValueStore.setPersistenceEnabled(z9);
    }

    public Auth setUsername(String str) {
        this.user.setUsername(str);
        return this;
    }

    public void signOut() {
        if (getBrowserPackage() != null) {
            this.user.signOut(false, getBrowserPackage());
        } else {
            this.user.signOut(false);
        }
    }

    public void signOut(boolean z9) {
        if (getBrowserPackage() != null) {
            this.user.signOut(z9, getBrowserPackage());
        } else {
            this.user.signOut(z9);
        }
    }
}
