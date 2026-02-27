package com.amazonaws.mobile.auth.userpools;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.amazonaws.mobile.auth.core.internal.util.ViewHelper;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.amazonaws.mobile.config.AWSConfiguration;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUser;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUserAttributes;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUserPool;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.SignUpHandler;
import com.amazonaws.services.cognitoidentityprovider.model.SignUpResult;

/* JADX INFO: loaded from: classes.dex */
public class SignUpActivity extends Activity {
    private static final String LOG_TAG = "SignUpActivity";
    private CognitoUserPool mUserPool;
    private SignUpView signUpView;

    public static void startActivity(Activity activity, int i9) {
        activity.startActivityForResult(new Intent(activity, (Class<?>) SignUpActivity.class), i9);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_sign_up);
        this.signUpView = (SignUpView) findViewById(R.id.signup_view);
        Context applicationContext = getApplicationContext();
        this.mUserPool = new CognitoUserPool(applicationContext, new AWSConfiguration(applicationContext));
        ((InputMethodManager) getSystemService("input_method")).toggleSoftInput(2, 1);
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
    }

    public void showError(String str) {
        ViewHelper.showDialog(this, getString(R.string.title_activity_sign_up), getString(R.string.sign_up_failed) + " " + str);
    }

    public void signUp(View view) {
        final String userName = this.signUpView.getUserName();
        final String password = this.signUpView.getPassword();
        String givenName = this.signUpView.getGivenName();
        String email = this.signUpView.getEmail();
        String phone = this.signUpView.getPhone();
        String str = LOG_TAG;
        Log.d(str, "username = " + userName);
        Log.d(str, "given_name = " + givenName);
        Log.d(str, "email = " + email);
        Log.d(str, "phone = " + phone);
        if (userName.isEmpty()) {
            showError(getString(R.string.sign_up_username_missing));
            return;
        }
        if (password.length() < 6) {
            showError(getString(R.string.password_length_validation_failed));
            return;
        }
        CognitoUserAttributes cognitoUserAttributes = new CognitoUserAttributes();
        cognitoUserAttributes.addAttribute(CognitoUserPoolsSignInProvider.AttributeKeys.GIVEN_NAME, givenName);
        cognitoUserAttributes.addAttribute("email", email);
        if (!phone.isEmpty()) {
            cognitoUserAttributes.addAttribute(CognitoUserPoolsSignInProvider.AttributeKeys.PHONE_NUMBER, phone);
        }
        final AlertDialog alertDialogShow = new AlertDialog.Builder(this).setTitle(getString(R.string.sign_up_in_progress)).setMessage(getString(R.string.please_wait)).setNeutralButton(android.R.string.ok, (DialogInterface.OnClickListener) null).show();
        this.mUserPool.signUpInBackground(userName, password, cognitoUserAttributes, null, new SignUpHandler() { // from class: com.amazonaws.mobile.auth.userpools.SignUpActivity.1
            @Override // com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.SignUpHandler
            public void onFailure(Exception exc) {
                alertDialogShow.dismiss();
                SignUpActivity.this.showError(exc.getLocalizedMessage() != null ? CognitoUserPoolsSignInProvider.getErrorMessageFromException(exc) : "");
            }

            @Override // com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.SignUpHandler
            public void onSuccess(CognitoUser cognitoUser, SignUpResult signUpResult) {
                alertDialogShow.dismiss();
                Intent intent = new Intent();
                intent.putExtra(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, userName);
                intent.putExtra(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, password);
                intent.putExtra(CognitoUserPoolsSignInProvider.AttributeKeys.IS_SIGN_UP_CONFIRMED, signUpResult.getUserConfirmed());
                intent.putExtra(CognitoUserPoolsSignInProvider.AttributeKeys.CONFIRMATION_DESTINATION, signUpResult.getCodeDeliveryDetails().getDestination());
                SignUpActivity.this.setResult(-1, intent);
                SignUpActivity.this.finish();
            }
        });
    }
}
