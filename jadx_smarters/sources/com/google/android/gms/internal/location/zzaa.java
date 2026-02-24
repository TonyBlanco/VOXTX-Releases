package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import y4.AbstractC2985a;
import y4.c;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaa extends AbstractC2985a implements h {
    private final Status zzb;
    public static final zzaa zza = new zzaa(Status.f26437k);
    public static final Parcelable.Creator<zzaa> CREATOR = new zzab();

    public zzaa(Status status) {
        this.zzb = status;
    }

    @Override // com.google.android.gms.common.api.h
    public final Status getStatus() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int iA = c.a(parcel);
        c.r(parcel, 1, this.zzb, i9, false);
        c.b(parcel, iA);
    }
}
