package com.amazonaws.mobileconnectors.cognitoidentityprovider;

/* JADX INFO: loaded from: classes.dex */
public class CognitoMfaSettings {
    public static final String SMS_MFA = "SMS_MFA";
    public static final String TOTP_MFA = "TOTP_MFA";
    private String mfaName;
    private boolean enabled = false;
    private boolean preferred = false;

    private CognitoMfaSettings() {
    }

    public CognitoMfaSettings(String str) {
        this.mfaName = str;
    }

    public String getMfaName() {
        return this.mfaName;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public boolean isPreferred() {
        return this.preferred;
    }

    public void setEnabled(boolean z9) {
        this.enabled = z9;
    }

    public void setPreferred(boolean z9) {
        this.preferred = z9;
    }
}
