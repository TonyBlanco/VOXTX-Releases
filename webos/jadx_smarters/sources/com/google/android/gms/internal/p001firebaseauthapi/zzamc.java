package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzamc extends RuntimeException {
    private final List<String> zza;

    public zzamc(zzakn zzaknVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.zza = null;
    }

    public final zzaji zza() {
        return new zzaji(getMessage());
    }
}
