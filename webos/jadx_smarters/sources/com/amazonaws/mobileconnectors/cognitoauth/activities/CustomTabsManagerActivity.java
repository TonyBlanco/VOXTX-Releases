package com.amazonaws.mobileconnectors.cognitoauth.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class CustomTabsManagerActivity extends Activity {
    static final String CUSTOM_TABS_INTENT_KEY = "customTabsIntent";
    static final String CUSTOM_TABS_LAUNCHED_KEY = "customTabsLaunched";
    private static final String TAG = "AuthClient";
    private Intent customTabsIntent;
    private boolean customTabsLaunched = false;

    private static Intent createBaseIntent(Context context) {
        return new Intent(context, (Class<?>) CustomTabsManagerActivity.class);
    }

    public static Intent createResponseHandlingIntent(Context context, Uri uri) {
        Intent intentCreateBaseIntent = createBaseIntent(context);
        intentCreateBaseIntent.setData(uri);
        intentCreateBaseIntent.addFlags(603979776);
        return intentCreateBaseIntent;
    }

    public static Intent createStartIntent(Context context, Intent intent) {
        Intent intentCreateBaseIntent = createBaseIntent(context);
        intentCreateBaseIntent.putExtra(CUSTOM_TABS_INTENT_KEY, intent);
        return intentCreateBaseIntent;
    }

    private void extractState(Bundle bundle) {
        if (bundle == null) {
            Log.d(TAG, "CustomTabsManagerActivity was created with a null state.");
            finish();
        } else {
            this.customTabsIntent = (Intent) bundle.getParcelable(CUSTOM_TABS_INTENT_KEY);
            this.customTabsLaunched = bundle.getBoolean(CUSTOM_TABS_LAUNCHED_KEY, false);
        }
    }

    private void handleAuthorizationCanceled() {
        Log.d(TAG, "Authorization flow canceled by user");
        setResult(0);
    }

    private void handleAuthorizationComplete() {
        Log.d(TAG, "Authorization flow completed successfully");
        setResult(-1, getIntent());
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getIntent().getExtras();
        }
        extractState(bundle);
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (!this.customTabsLaunched) {
            startActivity(this.customTabsIntent);
            this.customTabsLaunched = true;
        } else {
            if (getIntent().getData() != null) {
                handleAuthorizationComplete();
            } else {
                handleAuthorizationCanceled();
            }
            finish();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean(CUSTOM_TABS_LAUNCHED_KEY, this.customTabsLaunched);
        bundle.putParcelable(CUSTOM_TABS_INTENT_KEY, this.customTabsIntent);
    }
}
