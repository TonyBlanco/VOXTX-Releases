package o4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.zza;
import com.google.android.gms.internal.cast.zzc;
import n4.C2266d;
import w4.C2914b;

/* JADX INFO: renamed from: o4.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2320C extends zza implements InterfaceC2322E {
    public C2320C(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ICastSession");
    }

    @Override // o4.InterfaceC2322E
    public final void H(C2914b c2914b) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, c2914b);
        zzc(3, parcelZza);
    }

    @Override // o4.InterfaceC2322E
    public final void M(C2266d c2266d, String str, String str2, boolean z9) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, c2266d);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        parcelZza.writeInt(z9 ? 1 : 0);
        zzc(4, parcelZza);
    }

    @Override // o4.InterfaceC2322E
    public final void W(boolean z9, int i9) throws RemoteException {
        Parcel parcelZza = zza();
        int i10 = zzc.zza;
        parcelZza.writeInt(z9 ? 1 : 0);
        parcelZza.writeInt(0);
        zzc(6, parcelZza);
    }

    @Override // o4.InterfaceC2322E
    public final void d(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, null);
        zzc(1, parcelZza);
    }

    @Override // o4.InterfaceC2322E
    public final void zzg(int i9) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i9);
        zzc(5, parcelZza);
    }

    @Override // o4.InterfaceC2322E
    public final void zzj(int i9) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i9);
        zzc(2, parcelZza);
    }
}
