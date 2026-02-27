package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzje extends RuntimeException {
    public zzje(zzhy zzhyVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzgy zza() {
        return new zzgy(getMessage());
    }
}
