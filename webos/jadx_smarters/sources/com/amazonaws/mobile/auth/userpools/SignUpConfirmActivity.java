package com.amazonaws.mobile.auth.userpools;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;

/* JADX INFO: loaded from: classes.dex */
public class SignUpConfirmActivity extends Activity {
    private static final String LOG_TAG = "SignUpConfirmActivity";
    private SignUpConfirmView signUpConfirmView;

    public void confirmAccount(View view) {
        String string = this.signUpConfirmView.getUserNameEditText().getText().toString();
        String string2 = this.signUpConfirmView.getConfirmCodeEditText().getText().toString();
        String str = LOG_TAG;
        Log.d(str, "username = " + string);
        Log.d(str, "verificationCode = " + string2);
        Intent intent = new Intent();
        intent.putExtra(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, string);
        intent.putExtra(CognitoUserPoolsSignInProvider.AttributeKeys.VERIFICATION_CODE, string2);
        setResult(-1, intent);
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_sign_up_confirm);
        String stringExtra = getIntent().getStringExtra(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME);
        String stringExtra2 = getIntent().getStringExtra(CognitoUserPoolsSignInProvider.AttributeKeys.CONFIRMATION_DESTINATION);
        SignUpConfirmView signUpConfirmView = (SignUpConfirmView) findViewById(R.id.signup_confirm_view);
        this.signUpConfirmView = signUpConfirmView;
        signUpConfirmView.getUserNameEditText().setText(stringExtra);
        this.signUpConfirmView.getConfirmCodeEditText().requestFocus();
        ((TextView) findViewById(R.id.confirm_account_message1)).setText(getString(R.string.sign_up_confirm_code_sent) + "\n" + stringExtra2);
        ((InputMethodManager) getSystemService("input_method")).toggleSoftInput(2, 1);
    }
}
