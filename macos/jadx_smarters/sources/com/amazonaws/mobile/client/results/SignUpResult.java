package com.amazonaws.mobile.client.results;

/* JADX INFO: loaded from: classes.dex */
public final class SignUpResult {
    private final UserCodeDeliveryDetails cognitoUserCodeDeliveryDetails;
    private final boolean signUpConfirmationState;
    private final String userSub;

    public SignUpResult(boolean z9, UserCodeDeliveryDetails userCodeDeliveryDetails, String str) {
        this.signUpConfirmationState = z9;
        this.cognitoUserCodeDeliveryDetails = userCodeDeliveryDetails;
        this.userSub = str;
    }

    public boolean getConfirmationState() {
        return this.signUpConfirmationState;
    }

    public UserCodeDeliveryDetails getUserCodeDeliveryDetails() {
        return this.cognitoUserCodeDeliveryDetails;
    }

    public String getUserSub() {
        return this.userSub;
    }
}
