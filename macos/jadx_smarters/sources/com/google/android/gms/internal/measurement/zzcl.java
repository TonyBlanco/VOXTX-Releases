package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import y4.AbstractC2985a;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcl extends AbstractC2985a {
    public static final Parcelable.Creator<zzcl> CREATOR = new zzcm();
    public final long zza;
    public final long zzb;
    public final boolean zzc;
    public final String zzd;
    public final String zze;
    public final String zzf;
    public final Bundle zzg;
    public final String zzh;

    public zzcl(long j9, long j10, boolean z9, String str, String str2, String str3, Bundle bundle, String str4) {
        this.zza = j9;
        this.zzb = j10;
        this.zzc = z9;
        this.zzd = str;
        this.zze = str2;
        this.zzf = str3;
        this.zzg = bundle;
        this.zzh = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.o(parcel, 1, this.zza);
        y4.c.o(parcel, 2, this.zzb);
        y4.c.c(parcel, 3, this.zzc);
        y4.c.t(parcel, 4, this.zzd, false);
        y4.c.t(parcel, 5, this.zze, false);
        y4.c.t(parcel, 6, this.zzf, false);
        y4.c.e(parcel, 7, this.zzg, false);
        y4.c.t(parcel, 8, this.zzh, false);
        y4.c.b(parcel, iA);
    }
}
