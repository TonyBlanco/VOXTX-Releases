package com.google.android.gms.internal.p001firebaseauthapi;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbi implements zzcd {
    private final OutputStream zza;

    private zzbi(OutputStream outputStream) {
        this.zza = outputStream;
    }

    public static zzcd zza(OutputStream outputStream) {
        return new zzbi(outputStream);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzcd
    public final void zza(zzua zzuaVar) throws IOException {
        try {
            zzuaVar.zza(this.zza);
        } finally {
            this.zza.close();
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzcd
    public final void zza(zzvg zzvgVar) throws IOException {
        try {
            zzvgVar.zza(this.zza);
        } finally {
            this.zza.close();
        }
    }
}
