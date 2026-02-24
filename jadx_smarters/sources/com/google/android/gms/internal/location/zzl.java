package com.google.android.gms.internal.location;

import J4.AbstractBinderC0661u;
import J4.InterfaceC0662v;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import y4.AbstractC2985a;
import y4.c;

/* JADX INFO: loaded from: classes3.dex */
public final class zzl extends AbstractC2985a {
    public static final Parcelable.Creator<zzl> CREATOR = new zzm();
    final int zza;
    final zzj zzb;
    final InterfaceC0662v zzc;
    final zzai zzd;

    public zzl(int i9, zzj zzjVar, IBinder iBinder, IBinder iBinder2) {
        this.zza = i9;
        this.zzb = zzjVar;
        zzai zzagVar = null;
        this.zzc = iBinder == null ? null : AbstractBinderC0661u.zzb(iBinder);
        if (iBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            zzagVar = iInterfaceQueryLocalInterface instanceof zzai ? (zzai) iInterfaceQueryLocalInterface : new zzag(iBinder2);
        }
        this.zzd = zzagVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int iA = c.a(parcel);
        c.l(parcel, 1, this.zza);
        c.r(parcel, 2, this.zzb, i9, false);
        InterfaceC0662v interfaceC0662v = this.zzc;
        c.k(parcel, 3, interfaceC0662v == null ? null : interfaceC0662v.asBinder(), false);
        zzai zzaiVar = this.zzd;
        c.k(parcel, 4, zzaiVar != null ? zzaiVar.asBinder() : null, false);
        c.b(parcel, iA);
    }
}
