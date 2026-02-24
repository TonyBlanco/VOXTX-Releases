package com.google.android.recaptcha;

import kotlin.jvm.internal.g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class RecaptchaException extends Exception {

    @NotNull
    private final RecaptchaErrorCode errorCode;

    @NotNull
    private final String errorMessage;

    public RecaptchaException(RecaptchaErrorCode recaptchaErrorCode, String str) {
        super(str);
        this.errorCode = recaptchaErrorCode;
        this.errorMessage = str;
    }

    public /* synthetic */ RecaptchaException(RecaptchaErrorCode recaptchaErrorCode, String str, int i9, g gVar) {
        this(recaptchaErrorCode, (i9 & 2) != 0 ? recaptchaErrorCode.getErrorMessage() : str);
    }

    @NotNull
    public final RecaptchaErrorCode getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final String getErrorMessage() {
        return this.errorMessage;
    }
}
