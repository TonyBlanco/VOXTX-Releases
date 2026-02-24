package M4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzbm;
import com.google.android.gms.internal.measurement.zzbo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: M4.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0787n1 extends zzbm implements InterfaceC0799p1 {
    public C0787n1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // M4.InterfaceC0799p1
    public final void C(long j9, String str, String str2, String str3) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j9);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        parcelZza.writeString(str3);
        zzc(10, parcelZza);
    }

    @Override // M4.InterfaceC0799p1
    public final byte[] F(C0832v c0832v, String str) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zzd(parcelZza, c0832v);
        parcelZza.writeString(str);
        Parcel parcelZzb = zzb(9, parcelZza);
        byte[] bArrCreateByteArray = parcelZzb.createByteArray();
        parcelZzb.recycle();
        return bArrCreateByteArray;
    }

    @Override // M4.InterfaceC0799p1
    public final String I(f5 f5Var) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zzd(parcelZza, f5Var);
        Parcel parcelZzb = zzb(11, parcelZza);
        String string = parcelZzb.readString();
        parcelZzb.recycle();
        return string;
    }

    @Override // M4.InterfaceC0799p1
    public final void N(C0832v c0832v, f5 f5Var) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zzd(parcelZza, c0832v);
        zzbo.zzd(parcelZza, f5Var);
        zzc(1, parcelZza);
    }

    @Override // M4.InterfaceC0799p1
    public final void P0(C0725d c0725d, f5 f5Var) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zzd(parcelZza, c0725d);
        zzbo.zzd(parcelZza, f5Var);
        zzc(12, parcelZza);
    }

    @Override // M4.InterfaceC0799p1
    public final void T0(f5 f5Var) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zzd(parcelZza, f5Var);
        zzc(18, parcelZza);
    }

    @Override // M4.InterfaceC0799p1
    public final void a1(V4 v42, f5 f5Var) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zzd(parcelZza, v42);
        zzbo.zzd(parcelZza, f5Var);
        zzc(2, parcelZza);
    }

    @Override // M4.InterfaceC0799p1
    public final List b(String str, String str2, boolean z9, f5 f5Var) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        int i9 = zzbo.zza;
        parcelZza.writeInt(z9 ? 1 : 0);
        zzbo.zzd(parcelZza, f5Var);
        Parcel parcelZzb = zzb(14, parcelZza);
        ArrayList arrayListCreateTypedArrayList = parcelZzb.createTypedArrayList(V4.CREATOR);
        parcelZzb.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // M4.InterfaceC0799p1
    public final List b0(String str, String str2, String str3, boolean z9) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(null);
        parcelZza.writeString(str2);
        parcelZza.writeString(str3);
        int i9 = zzbo.zza;
        parcelZza.writeInt(z9 ? 1 : 0);
        Parcel parcelZzb = zzb(15, parcelZza);
        ArrayList arrayListCreateTypedArrayList = parcelZzb.createTypedArrayList(V4.CREATOR);
        parcelZzb.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // M4.InterfaceC0799p1
    public final void j0(f5 f5Var) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zzd(parcelZza, f5Var);
        zzc(20, parcelZza);
    }

    @Override // M4.InterfaceC0799p1
    public final List l0(String str, String str2, String str3) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(null);
        parcelZza.writeString(str2);
        parcelZza.writeString(str3);
        Parcel parcelZzb = zzb(17, parcelZza);
        ArrayList arrayListCreateTypedArrayList = parcelZzb.createTypedArrayList(C0725d.CREATOR);
        parcelZzb.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // M4.InterfaceC0799p1
    public final void r(f5 f5Var) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zzd(parcelZza, f5Var);
        zzc(4, parcelZza);
    }

    @Override // M4.InterfaceC0799p1
    public final List s0(String str, String str2, f5 f5Var) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbo.zzd(parcelZza, f5Var);
        Parcel parcelZzb = zzb(16, parcelZza);
        ArrayList arrayListCreateTypedArrayList = parcelZzb.createTypedArrayList(C0725d.CREATOR);
        parcelZzb.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // M4.InterfaceC0799p1
    public final void u0(f5 f5Var) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zzd(parcelZza, f5Var);
        zzc(6, parcelZza);
    }

    @Override // M4.InterfaceC0799p1
    public final void z0(Bundle bundle, f5 f5Var) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zzd(parcelZza, bundle);
        zzbo.zzd(parcelZza, f5Var);
        zzc(19, parcelZza);
    }
}
