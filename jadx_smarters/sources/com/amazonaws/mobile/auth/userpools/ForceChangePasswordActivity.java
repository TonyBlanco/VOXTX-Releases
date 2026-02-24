package com.amazonaws.mobile.auth.userpools;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;

/* JADX INFO: loaded from: classes.dex */
public class ForceChangePasswordActivity extends Activity {
    private static final String LOG_TAG = "ForceChangePasswordActivity";
    private ForceChangePasswordView forceChangePasswordView;

    public void forceChangePassword(View view) {
        String password = this.forceChangePasswordView.getPassword();
        Intent intent = new Intent();
        intent.putExtra(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, password);
        setResult(-1, intent);
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_force_change_password);
        this.forceChangePasswordView = (ForceChangePasswordView) findViewById(R.id.force_change_password_view);
        ((InputMethodManager) getSystemService("input_method")).toggleSoftInput(2, 1);
    }
}
