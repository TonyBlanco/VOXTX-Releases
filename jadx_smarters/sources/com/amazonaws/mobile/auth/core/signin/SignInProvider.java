package com.amazonaws.mobile.auth.core.signin;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.amazonaws.mobile.auth.core.IdentityProvider;

/* JADX INFO: loaded from: classes.dex */
public interface SignInProvider extends IdentityProvider {
    void handleActivityResult(int i9, int i10, Intent intent);

    View.OnClickListener initializeSignInButton(Activity activity, View view, SignInProviderResultHandler signInProviderResultHandler);

    boolean isRequestCodeOurs(int i9);
}
