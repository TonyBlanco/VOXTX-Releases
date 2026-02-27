package com.amazonaws.mobile.auth.userpools;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;

/* JADX INFO: loaded from: classes.dex */
public class MFAActivity extends Activity {
    private static final String LOG_TAG = "MFAActivity";
    private MFAView mfaView;

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_mfa);
        this.mfaView = (MFAView) findViewById(R.id.mfa_view);
        ((InputMethodManager) getSystemService("input_method")).toggleSoftInput(2, 1);
    }

    public void verify(View view) {
        String mFACode = this.mfaView.getMFACode();
        Log.d(LOG_TAG, "verificationCode = " + mFACode);
        Intent intent = new Intent();
        intent.putExtra(CognitoUserPoolsSignInProvider.AttributeKeys.VERIFICATION_CODE, mFACode);
        setResult(-1, intent);
        finish();
    }
}
