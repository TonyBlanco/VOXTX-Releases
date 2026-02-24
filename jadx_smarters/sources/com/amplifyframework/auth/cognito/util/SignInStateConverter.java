package com.amplifyframework.auth.cognito.util;

import com.amazonaws.mobile.client.results.SignInState;
import com.amplifyframework.auth.AuthException;
import com.amplifyframework.auth.result.step.AuthSignInStep;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class SignInStateConverter {
    private static final Map<SignInState, AuthSignInStep> CONVERT_SIGN_IN_STATE;

    static {
        HashMap map = new HashMap();
        map.put(SignInState.SMS_MFA, AuthSignInStep.CONFIRM_SIGN_IN_WITH_SMS_MFA_CODE);
        map.put(SignInState.CUSTOM_CHALLENGE, AuthSignInStep.CONFIRM_SIGN_IN_WITH_CUSTOM_CHALLENGE);
        map.put(SignInState.NEW_PASSWORD_REQUIRED, AuthSignInStep.CONFIRM_SIGN_IN_WITH_NEW_PASSWORD);
        map.put(SignInState.DONE, AuthSignInStep.DONE);
        CONVERT_SIGN_IN_STATE = Collections.unmodifiableMap(map);
    }

    private SignInStateConverter() {
    }

    public static AuthSignInStep getAuthSignInStep(SignInState signInState) throws AuthException {
        AuthSignInStep authSignInStep = CONVERT_SIGN_IN_STATE.get(signInState);
        if (authSignInStep != null) {
            return authSignInStep;
        }
        throw new AuthException("Unsupported sign in state", "We currently do not support the " + signInState + " state from AWSMobileClient. If this error is reached, please report it as a bug");
    }
}
