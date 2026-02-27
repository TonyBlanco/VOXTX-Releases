package com.google.android.gms.internal.cast;

import android.view.Display;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;

/* JADX INFO: loaded from: classes3.dex */
final class zzdl implements h {
    private final Status zza;
    private final Display zzb;

    public zzdl(Display display) {
        this.zza = Status.f26437k;
        this.zzb = display;
    }

    public zzdl(Status status) {
        this.zza = status;
        this.zzb = null;
    }

    public final Display getPresentationDisplay() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.api.h
    public final Status getStatus() {
        return this.zza;
    }
}
