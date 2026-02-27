package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
final class zzgn implements zzcw {
    static final zzcw zza = new zzgn();

    private zzgn() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzcw
    public final boolean zza(int i9) {
        zzgo zzgoVar = zzgo.BROADCAST_ACTION_UNSPECIFIED;
        return (i9 != 0 ? i9 != 1 ? i9 != 2 ? i9 != 3 ? null : zzgo.ALTERNATIVE_BILLING_ACTION : zzgo.LOCAL_PURCHASES_UPDATED_ACTION : zzgo.PURCHASES_UPDATED_ACTION : zzgo.BROADCAST_ACTION_UNSPECIFIED) != null;
    }
}
