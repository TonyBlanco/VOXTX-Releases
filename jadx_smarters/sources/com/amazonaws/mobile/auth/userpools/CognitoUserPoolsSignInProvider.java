package com.amazonaws.mobile.auth.userpools;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import com.amazonaws.mobile.auth.core.internal.util.ViewHelper;
import com.amazonaws.mobile.auth.core.signin.SignInProvider;
import com.amazonaws.mobile.auth.core.signin.SignInProviderResultHandler;
import com.amazonaws.mobile.config.AWSConfiguration;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoDevice;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUserCodeDeliveryDetails;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUserPool;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUserSession;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.AuthenticationContinuation;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.AuthenticationDetails;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.ChallengeContinuation;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.ForgotPasswordContinuation;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.MultiFactorAuthenticationContinuation;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.NewPasswordContinuation;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.AuthenticationHandler;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.ForgotPasswordHandler;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.GenericHandler;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.VerificationHandler;
import com.amazonaws.services.cognitoidentityprovider.model.InvalidParameterException;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public class CognitoUserPoolsSignInProvider implements SignInProvider {
    private static final String LOG_TAG = "CognitoUserPoolsSignInProvider";
    private static final int PASSWORD_MIN_LENGTH = 6;
    private static final int REQUEST_CODE_START = 10608;
    private static final String USERPOOLS_EXCEPTION_PREFIX = "(Service";
    private static int backgroundColor;
    private static String fontFamily;
    private static boolean isBackgroundColorFullScreenEnabled;
    private Activity activity;
    private AWSConfiguration awsConfiguration;
    private String cognitoLoginKey;
    private CognitoUserPool cognitoUserPool;
    private CognitoUserSession cognitoUserSession;
    private Context context;
    private ForgotPasswordContinuation forgotPasswordContinuation;
    private NewPasswordContinuation mForceChangePasswordContinuation;
    private MultiFactorAuthenticationContinuation multiFactorAuthenticationContinuation;
    private String password;
    private SignInProviderResultHandler resultsHandler;
    private String signUpConfirmationDestination;
    private String username;
    private String verificationCode;
    private ForgotPasswordHandler forgotPasswordHandler = new ForgotPasswordHandler() { // from class: com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider.1
        @Override // com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.ForgotPasswordHandler
        public void getResetCode(ForgotPasswordContinuation forgotPasswordContinuation) {
            CognitoUserPoolsSignInProvider.this.forgotPasswordContinuation = forgotPasswordContinuation;
            CognitoUserPoolsSignInProvider.this.activity.startActivityForResult(new Intent(CognitoUserPoolsSignInProvider.this.context, (Class<?>) ForgotPasswordActivity.class), RequestCodes.FORGOT_PASSWORD_REQUEST_CODE.value);
        }

        @Override // com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.ForgotPasswordHandler
        public void onFailure(Exception exc) {
            Log.e(CognitoUserPoolsSignInProvider.LOG_TAG, "Password change failed.", exc);
            String string = exc instanceof InvalidParameterException ? CognitoUserPoolsSignInProvider.this.activity.getString(R.string.password_change_no_verification_failed) : CognitoUserPoolsSignInProvider.getErrorMessageFromException(exc);
            ViewHelper.showDialog(CognitoUserPoolsSignInProvider.this.activity, CognitoUserPoolsSignInProvider.this.activity.getString(R.string.title_activity_forgot_password), CognitoUserPoolsSignInProvider.this.activity.getString(R.string.password_change_failed) + " " + string);
        }

        @Override // com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.ForgotPasswordHandler
        public void onSuccess() {
            Log.d(CognitoUserPoolsSignInProvider.LOG_TAG, "Password change succeeded.");
            ViewHelper.showDialog(CognitoUserPoolsSignInProvider.this.activity, CognitoUserPoolsSignInProvider.this.activity.getString(R.string.title_activity_forgot_password), CognitoUserPoolsSignInProvider.this.activity.getString(R.string.password_change_success));
            CognitoUserPoolsSignInProvider.this.cognitoUserPool.getUser(CognitoUserPoolsSignInProvider.this.username).getSessionInBackground(CognitoUserPoolsSignInProvider.this.authenticationHandler);
        }
    };
    private GenericHandler signUpConfirmationHandler = new GenericHandler() { // from class: com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider.2
        @Override // com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.GenericHandler
        public void onFailure(Exception exc) {
            Log.e(CognitoUserPoolsSignInProvider.LOG_TAG, "Failed to confirm user.", exc);
            ViewHelper.showDialog(CognitoUserPoolsSignInProvider.this.activity, CognitoUserPoolsSignInProvider.this.activity.getString(R.string.title_activity_sign_up_confirm), CognitoUserPoolsSignInProvider.this.activity.getString(R.string.sign_up_confirm_failed) + " " + CognitoUserPoolsSignInProvider.getErrorMessageFromException(exc));
        }

        @Override // com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.GenericHandler
        public void onSuccess() {
            Log.i(CognitoUserPoolsSignInProvider.LOG_TAG, "Confirmed.");
            ViewHelper.showDialog(CognitoUserPoolsSignInProvider.this.activity, CognitoUserPoolsSignInProvider.this.activity.getString(R.string.title_activity_sign_up_confirm), CognitoUserPoolsSignInProvider.this.activity.getString(R.string.sign_up_confirm_success));
            CognitoUserPoolsSignInProvider.this.cognitoUserPool.getUser(CognitoUserPoolsSignInProvider.this.username).getSessionInBackground(CognitoUserPoolsSignInProvider.this.authenticationHandler);
        }
    };
    private AuthenticationHandler authenticationHandler = new AuthenticationHandler() { // from class: com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider.4
        @Override // com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.AuthenticationHandler
        public void authenticationChallenge(ChallengeContinuation challengeContinuation) {
            if (!(challengeContinuation instanceof NewPasswordContinuation)) {
                throw new UnsupportedOperationException("Not supported in this sample.");
            }
            CognitoUserPoolsSignInProvider.this.mForceChangePasswordContinuation = (NewPasswordContinuation) challengeContinuation;
            CognitoUserPoolsSignInProvider.this.activity.startActivityForResult(new Intent(CognitoUserPoolsSignInProvider.this.context, (Class<?>) ForceChangePasswordActivity.class), RequestCodes.FORCE_CHANGE_PASSWORD_REQUEST_CODE.value);
        }

        @Override // com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.AuthenticationHandler
        public void getAuthenticationDetails(AuthenticationContinuation authenticationContinuation, String str) {
            if (CognitoUserPoolsSignInProvider.this.username == null || CognitoUserPoolsSignInProvider.this.password == null) {
                return;
            }
            authenticationContinuation.setAuthenticationDetails(new AuthenticationDetails(CognitoUserPoolsSignInProvider.this.username, CognitoUserPoolsSignInProvider.this.password, (Map<String, String>) null));
            authenticationContinuation.continueTask();
        }

        @Override // com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.AuthenticationHandler
        public void getMFACode(MultiFactorAuthenticationContinuation multiFactorAuthenticationContinuation) {
            CognitoUserPoolsSignInProvider.this.multiFactorAuthenticationContinuation = multiFactorAuthenticationContinuation;
            CognitoUserPoolsSignInProvider.this.activity.startActivityForResult(new Intent(CognitoUserPoolsSignInProvider.this.context, (Class<?>) MFAActivity.class), RequestCodes.MFA_REQUEST_CODE.value);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
        @Override // com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.AuthenticationHandler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onFailure(java.lang.Exception r7) {
            /*
                r6 = this;
                java.lang.String r0 = com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider.access$000()
                java.lang.String r1 = "Failed to login."
                android.util.Log.e(r0, r1, r7)
                boolean r0 = r7 instanceof com.amazonaws.services.cognitoidentityprovider.model.UserNotConfirmedException
                if (r0 == 0) goto L13
                com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider r7 = com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider.this
                com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider.access$1300(r7)
                return
            L13:
                boolean r0 = r7 instanceof com.amazonaws.services.cognitoidentityprovider.model.UserNotFoundException
                if (r0 == 0) goto L24
                com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider r0 = com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider.this
                android.app.Activity r0 = com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider.access$100(r0)
                int r1 = com.amazonaws.mobile.auth.userpools.R.string.user_does_not_exist
            L1f:
                java.lang.String r0 = r0.getString(r1)
                goto L35
            L24:
                boolean r0 = r7 instanceof com.amazonaws.services.cognitoidentityprovider.model.NotAuthorizedException
                if (r0 == 0) goto L31
                com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider r0 = com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider.this
                android.app.Activity r0 = com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider.access$100(r0)
                int r1 = com.amazonaws.mobile.auth.userpools.R.string.incorrect_username_or_password
                goto L1f
            L31:
                java.lang.String r0 = com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider.getErrorMessageFromException(r7)
            L35:
                com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider r1 = com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider.this
                com.amazonaws.mobile.auth.core.signin.SignInProviderResultHandler r1 = com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider.access$800(r1)
                if (r1 == 0) goto L7d
                com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider r1 = com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider.this
                android.app.Activity r1 = com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider.access$100(r1)
                com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider r2 = com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider.this
                android.app.Activity r2 = com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider.access$100(r2)
                int r3 = com.amazonaws.mobile.auth.userpools.R.string.title_activity_sign_in
                java.lang.String r2 = r2.getString(r3)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider r4 = com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider.this
                android.app.Activity r4 = com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider.access$100(r4)
                int r5 = com.amazonaws.mobile.auth.userpools.R.string.login_failed
                java.lang.String r4 = r4.getString(r5)
                r3.append(r4)
                java.lang.String r4 = " "
                r3.append(r4)
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                com.amazonaws.mobile.auth.core.internal.util.ViewHelper.showDialog(r1, r2, r0)
                com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider r0 = com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider.this
                com.amazonaws.mobile.auth.core.signin.SignInProviderResultHandler r0 = com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider.access$800(r0)
                com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider r1 = com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider.this
                r0.onError(r1, r7)
            L7d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider.AnonymousClass4.onFailure(java.lang.Exception):void");
        }

        @Override // com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.AuthenticationHandler
        public void onSuccess(CognitoUserSession cognitoUserSession, CognitoDevice cognitoDevice) {
            Log.i(CognitoUserPoolsSignInProvider.LOG_TAG, "Logged in. " + cognitoUserSession.getIdToken());
            CognitoUserPoolsSignInProvider.this.cognitoUserSession = cognitoUserSession;
            if (CognitoUserPoolsSignInProvider.this.resultsHandler != null) {
                CognitoUserPoolsSignInProvider.this.resultsHandler.onSuccess(CognitoUserPoolsSignInProvider.this);
            }
        }
    };

    /* JADX INFO: renamed from: com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider$8, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass8 {
        static final /* synthetic */ int[] $SwitchMap$com$amazonaws$mobile$auth$userpools$CognitoUserPoolsSignInProvider$RequestCodes;

        static {
            int[] iArr = new int[RequestCodes.values().length];
            $SwitchMap$com$amazonaws$mobile$auth$userpools$CognitoUserPoolsSignInProvider$RequestCodes = iArr;
            try {
                iArr[RequestCodes.FORGOT_PASSWORD_REQUEST_CODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazonaws$mobile$auth$userpools$CognitoUserPoolsSignInProvider$RequestCodes[RequestCodes.SIGN_UP_REQUEST_CODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazonaws$mobile$auth$userpools$CognitoUserPoolsSignInProvider$RequestCodes[RequestCodes.MFA_REQUEST_CODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazonaws$mobile$auth$userpools$CognitoUserPoolsSignInProvider$RequestCodes[RequestCodes.VERIFICATION_REQUEST_CODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazonaws$mobile$auth$userpools$CognitoUserPoolsSignInProvider$RequestCodes[RequestCodes.FORCE_CHANGE_PASSWORD_REQUEST_CODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static final class AttributeKeys {
        public static final String BACKGROUND_COLOR = "signInBackgroundColor";
        public static final String CONFIRMATION_DESTINATION = "destination";
        public static final String EMAIL_ADDRESS = "email";
        public static final String FONT_FAMILY = "fontFamily";
        public static final String FULL_SCREEN_BACKGROUND_COLOR = "fullScreenBackgroundColor";
        public static final String GIVEN_NAME = "given_name";
        public static final String IS_SIGN_UP_CONFIRMED = "isSignUpConfirmed";
        public static final String PASSWORD = "password";
        public static final String PHONE_NUMBER = "phone_number";
        public static final String USERNAME = "username";
        public static final String VERIFICATION_CODE = "verification_code";
    }

    public static class RefreshSessionAuthenticationHandler implements AuthenticationHandler {
        private CognitoUserSession userSession;

        private RefreshSessionAuthenticationHandler() {
            this.userSession = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public CognitoUserSession getUserSession() {
            return this.userSession;
        }

        @Override // com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.AuthenticationHandler
        public void authenticationChallenge(ChallengeContinuation challengeContinuation) {
            Log.wtf(CognitoUserPoolsSignInProvider.LOG_TAG, "Refresh flow can not trigger request for authentication challenge.");
        }

        @Override // com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.AuthenticationHandler
        public void getAuthenticationDetails(AuthenticationContinuation authenticationContinuation, String str) {
            Log.d(CognitoUserPoolsSignInProvider.LOG_TAG, "Can't refresh the session silently, due to authentication details needed.");
        }

        @Override // com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.AuthenticationHandler
        public void getMFACode(MultiFactorAuthenticationContinuation multiFactorAuthenticationContinuation) {
            Log.wtf(CognitoUserPoolsSignInProvider.LOG_TAG, "Refresh flow can not trigger request for MFA code.");
        }

        @Override // com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.AuthenticationHandler
        public void onFailure(Exception exc) {
            Log.e(CognitoUserPoolsSignInProvider.LOG_TAG, "Can't refresh session.", exc);
        }

        @Override // com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.AuthenticationHandler
        public void onSuccess(CognitoUserSession cognitoUserSession, CognitoDevice cognitoDevice) {
            this.userSession = cognitoUserSession;
        }
    }

    public enum RequestCodes {
        FORGOT_PASSWORD_REQUEST_CODE(10650),
        SIGN_UP_REQUEST_CODE(10651),
        MFA_REQUEST_CODE(10652),
        VERIFICATION_REQUEST_CODE(10653),
        FORCE_CHANGE_PASSWORD_REQUEST_CODE(10654);

        public final int value;

        RequestCodes(int i9) {
            this.value = i9;
        }

        public static RequestCodes valueOf(int i9) {
            Log.e(CognitoUserPoolsSignInProvider.LOG_TAG, "valueOf: " + i9, new RuntimeException(""));
            for (RequestCodes requestCodes : values()) {
                Log.e(CognitoUserPoolsSignInProvider.LOG_TAG, "valueOf: compare " + requestCodes.value);
                if (i9 == requestCodes.value) {
                    return requestCodes;
                }
            }
            return null;
        }
    }

    public static int getBackgroundColor() {
        return backgroundColor;
    }

    public static String getErrorMessageFromException(Exception exc) {
        String localizedMessage = exc.getLocalizedMessage();
        if (localizedMessage == null) {
            return exc.getMessage();
        }
        int iIndexOf = localizedMessage.indexOf(USERPOOLS_EXCEPTION_PREFIX);
        return iIndexOf == -1 ? localizedMessage : localizedMessage.substring(0, iIndexOf);
    }

    public static String getFontFamily() {
        return fontFamily;
    }

    public static boolean isBackgroundColorFullScreen() {
        return isBackgroundColorFullScreenEnabled;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resendConfirmationCode() {
        this.cognitoUserPool.getUser(this.username).resendConfirmationCodeInBackground(new VerificationHandler() { // from class: com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider.3
            @Override // com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.VerificationHandler
            public void onFailure(Exception exc) {
                if (CognitoUserPoolsSignInProvider.this.resultsHandler != null) {
                    ViewHelper.showDialog(CognitoUserPoolsSignInProvider.this.activity, CognitoUserPoolsSignInProvider.this.activity.getString(R.string.title_activity_sign_in), CognitoUserPoolsSignInProvider.this.activity.getString(R.string.login_failed) + "\nUser was not verified and resending confirmation code failed.\n" + CognitoUserPoolsSignInProvider.getErrorMessageFromException(exc));
                    CognitoUserPoolsSignInProvider.this.resultsHandler.onError(CognitoUserPoolsSignInProvider.this, exc);
                }
            }

            @Override // com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.VerificationHandler
            public void onSuccess(CognitoUserCodeDeliveryDetails cognitoUserCodeDeliveryDetails) {
                CognitoUserPoolsSignInProvider.this.startVerificationActivity();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startVerificationActivity() {
        Intent intent = new Intent(this.context, (Class<?>) SignUpConfirmActivity.class);
        intent.putExtra(AttributeKeys.USERNAME, this.username);
        intent.putExtra(AttributeKeys.CONFIRMATION_DESTINATION, this.signUpConfirmationDestination);
        this.activity.startActivityForResult(intent, RequestCodes.VERIFICATION_REQUEST_CODE.value);
    }

    @Override // com.amazonaws.mobile.auth.core.IdentityProvider
    public String getCognitoLoginKey() {
        return this.cognitoLoginKey;
    }

    public CognitoUserPool getCognitoUserPool() {
        return this.cognitoUserPool;
    }

    @Override // com.amazonaws.mobile.auth.core.IdentityProvider
    public String getDisplayName() {
        return "Amazon Cognito Your User Pools";
    }

    @Override // com.amazonaws.mobile.auth.core.IdentityProvider
    public String getToken() {
        CognitoUserSession cognitoUserSession = this.cognitoUserSession;
        if (cognitoUserSession == null) {
            return null;
        }
        return cognitoUserSession.getIdToken().getJWTToken();
    }

    public String getValueFromConfig(String str) {
        try {
            return this.awsConfiguration.optJsonObject("CognitoUserPool").getString(str);
        } catch (JSONException e9) {
            throw new IllegalArgumentException("Cannot find the CognitoUserPool " + str + " from the AWSConfiguration file.", e9);
        }
    }

    @Override // com.amazonaws.mobile.auth.core.signin.SignInProvider
    public void handleActivityResult(int i9, int i10, Intent intent) {
        Activity activity;
        String string;
        StringBuilder sb;
        Activity activity2;
        int i11;
        RequestCodes requestCodesValueOf = RequestCodes.valueOf(i9);
        if (-1 != i10 || requestCodesValueOf == null) {
            return;
        }
        int i12 = AnonymousClass8.$SwitchMap$com$amazonaws$mobile$auth$userpools$CognitoUserPoolsSignInProvider$RequestCodes[requestCodesValueOf.ordinal()];
        if (i12 == 1) {
            this.password = intent.getStringExtra(AttributeKeys.PASSWORD);
            this.verificationCode = intent.getStringExtra(AttributeKeys.VERIFICATION_CODE);
            if (this.password.length() >= 6) {
                Log.d(LOG_TAG, "verificationCode = " + this.verificationCode);
                this.forgotPasswordContinuation.setPassword(this.password);
                this.forgotPasswordContinuation.setVerificationCode(this.verificationCode);
                this.forgotPasswordContinuation.continueTask();
                return;
            }
            activity = this.activity;
            string = activity.getString(R.string.title_activity_forgot_password);
            sb = new StringBuilder();
            sb.append(this.activity.getString(R.string.password_change_failed));
            sb.append(" ");
            activity2 = this.activity;
            i11 = R.string.password_length_validation_failed;
        } else {
            if (i12 == 2) {
                this.username = intent.getStringExtra(AttributeKeys.USERNAME);
                this.password = intent.getStringExtra(AttributeKeys.PASSWORD);
                boolean booleanExtra = intent.getBooleanExtra(AttributeKeys.IS_SIGN_UP_CONFIRMED, true);
                this.signUpConfirmationDestination = intent.getStringExtra(AttributeKeys.CONFIRMATION_DESTINATION);
                String str = LOG_TAG;
                Log.d(str, "sign up result username = " + this.username);
                if (!booleanExtra) {
                    Log.w(str, "Additional confirmation for sign up.");
                    startVerificationActivity();
                    return;
                }
                Log.d(str, "Signed up. User ID = " + this.username);
                Activity activity3 = this.activity;
                ViewHelper.showDialog(activity3, activity3.getString(R.string.title_activity_sign_up), this.activity.getString(R.string.sign_up_success) + " " + this.username);
                signInUser();
                return;
            }
            if (i12 == 3) {
                String stringExtra = intent.getStringExtra(AttributeKeys.VERIFICATION_CODE);
                this.verificationCode = stringExtra;
                if (stringExtra.length() >= 1) {
                    Log.d(LOG_TAG, "verificationCode = " + this.verificationCode);
                    this.multiFactorAuthenticationContinuation.setMfaCode(this.verificationCode);
                    this.multiFactorAuthenticationContinuation.continueTask();
                    return;
                }
                activity = this.activity;
                string = activity.getString(R.string.title_activity_mfa);
                sb = new StringBuilder();
                sb.append(this.activity.getString(R.string.mfa_failed));
                sb.append(" ");
                activity2 = this.activity;
                i11 = R.string.mfa_code_empty;
            } else {
                if (i12 != 4) {
                    if (i12 != 5) {
                        Log.e(LOG_TAG, "Unknown Request Code sent.");
                        return;
                    }
                    Log.d(LOG_TAG, "handleActivityResult: FORCE_CHANGE_PASSWORD_REQUEST_CODE");
                    String stringExtra2 = intent.getStringExtra(AttributeKeys.PASSWORD);
                    this.password = stringExtra2;
                    this.mForceChangePasswordContinuation.setPassword(stringExtra2);
                    this.mForceChangePasswordContinuation.continueTask();
                    return;
                }
                String str2 = LOG_TAG;
                Log.d(str2, "handleActivityResult: VERIFICATION_REQUEST_CODE");
                this.username = intent.getStringExtra(AttributeKeys.USERNAME);
                this.verificationCode = intent.getStringExtra(AttributeKeys.VERIFICATION_CODE);
                if (this.username.length() < 1) {
                    activity = this.activity;
                    string = activity.getString(R.string.title_activity_sign_up_confirm);
                    sb = new StringBuilder();
                    sb.append(this.activity.getString(R.string.sign_up_confirm_title));
                    sb.append(" ");
                    activity2 = this.activity;
                    i11 = R.string.sign_up_username_missing;
                } else {
                    if (this.verificationCode.length() >= 1) {
                        Log.d(str2, "username = " + this.username);
                        Log.d(str2, "verificationCode = " + this.verificationCode);
                        this.cognitoUserPool.getUser(this.username).confirmSignUpInBackground(this.verificationCode, true, this.signUpConfirmationHandler);
                        return;
                    }
                    activity = this.activity;
                    string = activity.getString(R.string.title_activity_sign_up_confirm);
                    sb = new StringBuilder();
                    sb.append(this.activity.getString(R.string.sign_up_confirm_title));
                    sb.append(" ");
                    activity2 = this.activity;
                    i11 = R.string.sign_up_confirm_code_missing;
                }
            }
        }
        sb.append(activity2.getString(i11));
        ViewHelper.showDialog(activity, string, sb.toString());
    }

    @Override // com.amazonaws.mobile.auth.core.IdentityProvider
    public void initialize(Context context, AWSConfiguration aWSConfiguration) {
        this.context = context;
        this.awsConfiguration = aWSConfiguration;
        Log.d(LOG_TAG, "Initializing Cognito User Pools");
        this.cognitoUserPool = new CognitoUserPool(context, aWSConfiguration);
        this.cognitoLoginKey = "cognito-idp." + getValueFromConfig("Region") + "TryRoom" + this.cognitoUserPool.getUserPoolId();
    }

    @Override // com.amazonaws.mobile.auth.core.signin.SignInProvider
    public View.OnClickListener initializeSignInButton(Activity activity, View view, SignInProviderResultHandler signInProviderResultHandler) {
        this.activity = activity;
        this.resultsHandler = signInProviderResultHandler;
        final UserPoolSignInView userPoolSignInView = (UserPoolSignInView) activity.findViewById(R.id.user_pool_sign_in_view_id);
        backgroundColor = userPoolSignInView.getBackgroundColor();
        fontFamily = userPoolSignInView.getFontFamily();
        isBackgroundColorFullScreenEnabled = userPoolSignInView.isBackgroundColorFullScreen();
        userPoolSignInView.getSignUpTextView().setOnClickListener(new View.OnClickListener() { // from class: com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                SignUpActivity.startActivity(CognitoUserPoolsSignInProvider.this.activity, RequestCodes.SIGN_UP_REQUEST_CODE.value);
            }
        });
        userPoolSignInView.getForgotPasswordTextView().setOnClickListener(new View.OnClickListener() { // from class: com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                CognitoUserPoolsSignInProvider.this.username = userPoolSignInView.getEnteredUserName();
                if (CognitoUserPoolsSignInProvider.this.username.length() >= 1) {
                    CognitoUserPoolsSignInProvider.this.cognitoUserPool.getUser(CognitoUserPoolsSignInProvider.this.username).forgotPasswordInBackground(CognitoUserPoolsSignInProvider.this.forgotPasswordHandler);
                } else {
                    Log.w(CognitoUserPoolsSignInProvider.LOG_TAG, "Missing username.");
                    ViewHelper.showDialog(CognitoUserPoolsSignInProvider.this.activity, CognitoUserPoolsSignInProvider.this.activity.getString(R.string.title_activity_sign_in), "Missing username.");
                }
            }
        });
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                CognitoUserPoolsSignInProvider.this.username = userPoolSignInView.getEnteredUserName();
                CognitoUserPoolsSignInProvider.this.password = userPoolSignInView.getEnteredPassword();
                CognitoUserPoolsSignInProvider.this.signInUser();
            }
        };
        view.setOnClickListener(onClickListener);
        return onClickListener;
    }

    @Override // com.amazonaws.mobile.auth.core.signin.SignInProvider
    public boolean isRequestCodeOurs(int i9) {
        return RequestCodes.valueOf(i9) != null;
    }

    @Override // com.amazonaws.mobile.auth.core.IdentityProvider
    public String refreshToken() {
        CognitoUserSession cognitoUserSession = this.cognitoUserSession;
        if (cognitoUserSession != null && !cognitoUserSession.isValid()) {
            RefreshSessionAuthenticationHandler refreshSessionAuthenticationHandler = new RefreshSessionAuthenticationHandler();
            this.cognitoUserPool.getCurrentUser().getSession(refreshSessionAuthenticationHandler);
            if (refreshSessionAuthenticationHandler.getUserSession() != null) {
                this.cognitoUserSession = refreshSessionAuthenticationHandler.getUserSession();
            } else {
                Log.e(LOG_TAG, "Could not refresh the Cognito User Pool Token.");
            }
        }
        return getToken();
    }

    @Override // com.amazonaws.mobile.auth.core.IdentityProvider
    public boolean refreshUserSignInState() {
        CognitoUserSession cognitoUserSession = this.cognitoUserSession;
        if (cognitoUserSession != null && cognitoUserSession.isValid()) {
            return true;
        }
        RefreshSessionAuthenticationHandler refreshSessionAuthenticationHandler = new RefreshSessionAuthenticationHandler();
        this.cognitoUserPool.getCurrentUser().getSession(refreshSessionAuthenticationHandler);
        if (refreshSessionAuthenticationHandler.getUserSession() != null) {
            this.cognitoUserSession = refreshSessionAuthenticationHandler.getUserSession();
            Log.i(LOG_TAG, "refreshUserSignInState: Signed in with Cognito.");
            return true;
        }
        Log.i(LOG_TAG, "refreshUserSignInState: Not signed in with Cognito.");
        this.cognitoUserSession = null;
        return false;
    }

    public void signInUser() {
        this.cognitoUserPool.getUser(this.username).getSessionInBackground(this.authenticationHandler);
    }

    @Override // com.amazonaws.mobile.auth.core.IdentityProvider
    public void signOut() {
        CognitoUserPool cognitoUserPool = this.cognitoUserPool;
        if (cognitoUserPool == null || cognitoUserPool.getCurrentUser() == null) {
            return;
        }
        this.cognitoUserPool.getCurrentUser().signOut();
        this.cognitoUserSession = null;
        this.username = null;
        this.password = null;
    }
}
