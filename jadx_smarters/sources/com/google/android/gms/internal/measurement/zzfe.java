package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfe extends zzkx implements zzmj {
    private zzfe() {
        super(zzff.zza);
    }

    public /* synthetic */ zzfe(zzez zzezVar) {
        super(zzff.zza);
    }

    public final int zza() {
        return ((zzff) this.zza).zzb();
    }

    public final zzfd zzb(int i9) {
        return ((zzff) this.zza).zzd(i9);
    }

    public final zzfe zzc() {
        zzaH();
        ((zzff) this.zza).zzj = zzlb.zzbH();
        return this;
    }

    public final zzfe zzd(int i9, zzfc zzfcVar) {
        zzaH();
        zzff.zzq((zzff) this.zza, i9, (zzfd) zzfcVar.zzaD());
        return this;
    }

    public final String zze() {
        return ((zzff) this.zza).zzk();
    }

    public final List zzf() {
        return Collections.unmodifiableList(((zzff) this.zza).zzm());
    }

    public final List zzg() {
        return Collections.unmodifiableList(((zzff) this.zza).zzn());
    }
}
