package com.amazonaws.mobile.auth.core.signin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import com.amazonaws.mobile.auth.core.IdentityManager;
import com.amazonaws.mobile.auth.core.IdentityProvider;
import com.amazonaws.mobile.auth.core.SignInResultHandler;
import com.amazonaws.mobile.auth.core.internal.util.ThreadUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class SignInManager {
    private static final String LOG_TAG = "SignInManager";
    private static volatile SignInManager singleton;
    private SignInProviderResultAdapter resultsAdapter;
    private volatile SignInResultHandler signInResultHandler;
    private final Map<Class<? extends SignInProvider>, SignInProvider> signInProviders = new HashMap();
    private final SparseArray<SignInPermissionsHandler> providersHandlingPermissions = new SparseArray<>();

    public class SignInProviderResultAdapter implements SignInProviderResultHandler {
        private final Activity activity;
        private final SignInProviderResultHandler handler;

        private SignInProviderResultAdapter(Activity activity, SignInProviderResultHandler signInProviderResultHandler) {
            this.handler = signInProviderResultHandler;
            this.activity = activity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Activity getActivity() {
            return this.activity;
        }

        @Override // com.amazonaws.mobile.auth.core.signin.SignInProviderResultHandler
        public void onCancel(final IdentityProvider identityProvider) {
            ThreadUtils.runOnUiThread(new Runnable() { // from class: com.amazonaws.mobile.auth.core.signin.SignInManager.SignInProviderResultAdapter.2
                @Override // java.lang.Runnable
                public void run() {
                    SignInProviderResultAdapter.this.handler.onCancel(identityProvider);
                }
            });
        }

        @Override // com.amazonaws.mobile.auth.core.signin.SignInProviderResultHandler
        public void onError(final IdentityProvider identityProvider, final Exception exc) {
            ThreadUtils.runOnUiThread(new Runnable() { // from class: com.amazonaws.mobile.auth.core.signin.SignInManager.SignInProviderResultAdapter.3
                @Override // java.lang.Runnable
                public void run() {
                    SignInProviderResultAdapter.this.handler.onError(identityProvider, exc);
                }
            });
        }

        @Override // com.amazonaws.mobile.auth.core.signin.SignInProviderResultHandler
        public void onSuccess(final IdentityProvider identityProvider) {
            ThreadUtils.runOnUiThread(new Runnable() { // from class: com.amazonaws.mobile.auth.core.signin.SignInManager.SignInProviderResultAdapter.1
                @Override // java.lang.Runnable
                public void run() {
                    SignInProviderResultAdapter.this.handler.onSuccess(identityProvider);
                }
            });
        }
    }

    private SignInManager(Context context) {
        String str;
        StringBuilder sb;
        for (Class<? extends SignInProvider> cls : IdentityManager.getDefaultIdentityManager().getSignInProviderClasses()) {
            try {
                SignInProvider signInProviderNewInstance = cls.newInstance();
                if (signInProviderNewInstance != null) {
                    signInProviderNewInstance.initialize(context, IdentityManager.getDefaultIdentityManager().getConfiguration());
                    this.signInProviders.put(cls, signInProviderNewInstance);
                    if (signInProviderNewInstance instanceof SignInPermissionsHandler) {
                        SignInPermissionsHandler signInPermissionsHandler = (SignInPermissionsHandler) signInProviderNewInstance;
                        this.providersHandlingPermissions.put(signInPermissionsHandler.getPermissionRequestCode(), signInPermissionsHandler);
                    }
                }
            } catch (IllegalAccessException unused) {
                str = LOG_TAG;
                sb = new StringBuilder();
                sb.append("Unable to instantiate ");
                sb.append(cls.getSimpleName());
                sb.append(" . Skipping this provider.");
                Log.e(str, sb.toString());
            } catch (InstantiationException unused2) {
                str = LOG_TAG;
                sb = new StringBuilder();
                sb.append("Unable to instantiate ");
                sb.append(cls.getSimpleName());
                sb.append(" . Skipping this provider.");
                Log.e(str, sb.toString());
            }
        }
        singleton = this;
    }

    public static synchronized void dispose() {
        singleton = null;
    }

    private SignInProvider findProvider(Class<? extends SignInProvider> cls) {
        SignInProvider signInProvider = this.signInProviders.get(cls);
        if (signInProvider != null) {
            return signInProvider;
        }
        throw new IllegalArgumentException("No such provider : " + cls.getName());
    }

    public static synchronized SignInManager getInstance() {
        return singleton;
    }

    public static synchronized SignInManager getInstance(Context context) {
        try {
            if (singleton == null) {
                singleton = new SignInManager(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return singleton;
    }

    public SignInProvider getPreviouslySignedInProvider() {
        Log.d(LOG_TAG, "Providers: " + Collections.singletonList(this.signInProviders));
        for (SignInProvider signInProvider : this.signInProviders.values()) {
            if (signInProvider.refreshUserSignInState()) {
                Log.d(LOG_TAG, "Refreshing provider: " + signInProvider.getDisplayName());
                return signInProvider;
            }
        }
        return null;
    }

    public SignInResultHandler getResultHandler() {
        return this.signInResultHandler;
    }

    public boolean handleActivityResult(int i9, int i10, Intent intent) {
        for (SignInProvider signInProvider : this.signInProviders.values()) {
            if (signInProvider.isRequestCodeOurs(i9)) {
                signInProvider.handleActivityResult(i9, i10, intent);
                return true;
            }
        }
        return false;
    }

    public void handleRequestPermissionsResult(int i9, String[] strArr, int[] iArr) {
        SignInPermissionsHandler signInPermissionsHandler = this.providersHandlingPermissions.get(i9);
        if (signInPermissionsHandler != null) {
            signInPermissionsHandler.handleRequestPermissionsResult(i9, strArr, iArr);
        }
    }

    public View.OnClickListener initializeSignInButton(Class<? extends SignInProvider> cls, View view) {
        return findProvider(cls).initializeSignInButton(this.resultsAdapter.getActivity(), view, IdentityManager.getDefaultIdentityManager().getResultsAdapter());
    }

    public void refreshCredentialsWithProvider(Activity activity, IdentityProvider identityProvider, SignInProviderResultHandler signInProviderResultHandler) {
        if (identityProvider == null) {
            throw new IllegalArgumentException("The sign-in provider cannot be null.");
        }
        if (identityProvider.getToken() == null) {
            signInProviderResultHandler.onError(identityProvider, new IllegalArgumentException("Given provider not previously logged in."));
        }
        this.resultsAdapter = new SignInProviderResultAdapter(activity, signInProviderResultHandler);
        IdentityManager.getDefaultIdentityManager().setProviderResultsHandler(this.resultsAdapter);
        IdentityManager.getDefaultIdentityManager().federateWithProvider(identityProvider);
    }

    public void setProviderResultsHandler(Activity activity, SignInProviderResultHandler signInProviderResultHandler) {
        this.resultsAdapter = new SignInProviderResultAdapter(activity, signInProviderResultHandler);
        IdentityManager.getDefaultIdentityManager().setProviderResultsHandler(this.resultsAdapter);
    }

    public void setResultHandler(SignInResultHandler signInResultHandler) {
        this.signInResultHandler = signInResultHandler;
    }
}
