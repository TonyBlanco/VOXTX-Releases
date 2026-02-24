package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
final class zziy extends zzis {
    private final zzja zza;

    public zziy(zzja zzjaVar, int i9) {
        super(zzjaVar.size(), i9);
        this.zza = zzjaVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzis
    public final Object zza(int i9) {
        return this.zza.get(i9);
    }
}
