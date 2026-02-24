package com.google.android.gms.internal.cast;

import android.content.Context;
import n4.AbstractC2270f;
import o4.AbstractC2345w;
import o4.AbstractC2348z;
import o4.C2326c;
import o4.C2328e;
import q4.w;

/* JADX INFO: loaded from: classes3.dex */
public final class zzah extends AbstractC2348z {
    private final C2326c zza;
    private final zzbf zzb;

    public zzah(Context context, C2326c c2326c, zzbf zzbfVar) {
        super(context, c2326c.N().isEmpty() ? AbstractC2270f.a(c2326c.K()) : AbstractC2270f.b(c2326c.K(), c2326c.N()));
        this.zza = c2326c;
        this.zzb = zzbfVar;
    }

    @Override // o4.AbstractC2348z
    public final AbstractC2345w createSession(String str) {
        return new C2328e(getContext(), getCategory(), str, this.zza, this.zzb, new w(getContext(), this.zza, this.zzb));
    }

    @Override // o4.AbstractC2348z
    public final boolean isSessionRecoverable() {
        return this.zza.L();
    }
}
