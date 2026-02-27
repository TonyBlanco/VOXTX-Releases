package t4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.zza;
import com.google.android.gms.internal.cast.zzc;
import n4.C2276i;
import n4.Z;

/* JADX INFO: renamed from: t4.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2782i extends zza implements IInterface {
    public C2782i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.internal.ICastDeviceController");
    }

    public final void A(String str, String str2, Z z9) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzc.zzc(parcelZza, z9);
        zzd(14, parcelZza);
    }

    public final void E(String str, C2276i c2276i) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzc.zzc(parcelZza, c2276i);
        zzd(13, parcelZza);
    }

    public final void Z(InterfaceC2784k interfaceC2784k) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, interfaceC2784k);
        zzd(18, parcelZza);
    }

    public final void c0(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzd(11, parcelZza);
    }

    public final void c1(String str, String str2, long j9) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        parcelZza.writeLong(j9);
        zzd(9, parcelZza);
    }

    public final void d1(boolean z9, double d9, boolean z10) {
        Parcel parcelZza = zza();
        int i9 = zzc.zza;
        parcelZza.writeInt(z9 ? 1 : 0);
        parcelZza.writeDouble(d9);
        parcelZza.writeInt(z10 ? 1 : 0);
        zzd(8, parcelZza);
    }

    public final void e1(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzd(5, parcelZza);
    }

    public final void f1() throws RemoteException {
        zzd(19, zza());
    }

    public final void g1(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzd(12, parcelZza);
    }

    public final void zze() throws RemoteException {
        zzd(17, zza());
    }

    public final void zzf() throws RemoteException {
        zzd(1, zza());
    }
}
