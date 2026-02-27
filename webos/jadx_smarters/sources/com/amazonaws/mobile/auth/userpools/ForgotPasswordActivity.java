package com.amazonaws.mobile.auth.userpools;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;

/* JADX INFO: loaded from: classes.dex */
public class ForgotPasswordActivity extends Activity {
    private static final String LOG_TAG = "ForgotPasswordActivity";
    private ForgotPasswordView forgotPasswordView;

    public void forgotPassword(View view) {
        String password = this.forgotPasswordView.getPassword();
        String verificationCode = this.forgotPasswordView.getVerificationCode();
        Log.d(LOG_TAG, "verificationCode = " + verificationCode);
        Intent intent = new Intent();
        intent.putExtra(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, password);
        intent.putExtra(CognitoUserPoolsSignInProvider.AttributeKeys.VERIFICATION_CODE, verificationCode);
        setResult(-1, intent);
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_forgot_password);
        this.forgotPasswordView = (ForgotPasswordView) findViewById(R.id.forgot_password_view);
        ((InputMethodManager) getSystemService("input_method")).toggleSoftInput(2, 1);
    }
}
