package com.google.android.gms.internal.cast;

import F4.a;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.session.PlaybackStateCompat;
import com.amazonaws.services.s3.internal.Constants;
import java.util.Map;
import o4.AbstractBinderC2321D;
import o4.C2326c;
import o4.I;
import o4.InterfaceC2322E;
import o4.J;
import o4.L;
import o4.M;
import o4.V;
import o4.t0;
import o4.v0;
import o4.w0;
import q4.h;
import q4.i;
import q4.k;

/* JADX INFO: loaded from: classes3.dex */
public final class zzai extends zza implements zzaj {
    public zzai(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
    }

    @Override // com.google.android.gms.internal.cast.zzaj
    public final w0 zze(a aVar, C2326c c2326c, zzal zzalVar, Map map) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, aVar);
        zzc.zzc(parcelZza, c2326c);
        zzc.zze(parcelZza, zzalVar);
        parcelZza.writeMap(map);
        Parcel parcelZzb = zzb(1, parcelZza);
        w0 w0VarA = v0.A(parcelZzb.readStrongBinder());
        parcelZzb.recycle();
        return w0VarA;
    }

    @Override // com.google.android.gms.internal.cast.zzaj
    public final InterfaceC2322E zzf(C2326c c2326c, a aVar, t0 t0Var) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, c2326c);
        zzc.zze(parcelZza, aVar);
        zzc.zze(parcelZza, t0Var);
        Parcel parcelZzb = zzb(3, parcelZza);
        InterfaceC2322E interfaceC2322EA = AbstractBinderC2321D.A(parcelZzb.readStrongBinder());
        parcelZzb.recycle();
        return interfaceC2322EA;
    }

    @Override // com.google.android.gms.internal.cast.zzaj
    public final J zzg(a aVar, a aVar2, a aVar3) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, aVar);
        zzc.zze(parcelZza, aVar2);
        zzc.zze(parcelZza, aVar3);
        Parcel parcelZzb = zzb(5, parcelZza);
        J jA = I.A(parcelZzb.readStrongBinder());
        parcelZzb.recycle();
        return jA;
    }

    @Override // com.google.android.gms.internal.cast.zzaj
    public final M zzh(String str, String str2, V v9) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzc.zze(parcelZza, v9);
        Parcel parcelZzb = zzb(2, parcelZza);
        M mA = L.A(parcelZzb.readStrongBinder());
        parcelZzb.recycle();
        return mA;
    }

    @Override // com.google.android.gms.internal.cast.zzaj
    public final i zzi(a aVar, k kVar, int i9, int i10, boolean z9, long j9, int i11, int i12, int i13) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, aVar);
        zzc.zze(parcelZza, kVar);
        parcelZza.writeInt(i9);
        parcelZza.writeInt(i10);
        parcelZza.writeInt(0);
        parcelZza.writeLong(PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE);
        parcelZza.writeInt(5);
        parcelZza.writeInt(333);
        parcelZza.writeInt(Constants.MAXIMUM_UPLOAD_PARTS);
        Parcel parcelZzb = zzb(6, parcelZza);
        i iVarA = h.A(parcelZzb.readStrongBinder());
        parcelZzb.recycle();
        return iVarA;
    }
}
