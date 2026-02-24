package t4;

import android.os.Parcel;
import com.google.android.gms.internal.cast.zzb;
import com.google.android.gms.internal.cast.zzc;
import n4.C2266d;
import okhttp3.internal.ws.WebSocketProtocol;
import org.chromium.net.UrlRequest;

/* JADX INFO: renamed from: t4.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC2783j extends zzb implements InterfaceC2784k {
    public AbstractBinderC2783j() {
        super("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
    }

    @Override // com.google.android.gms.internal.cast.zzb
    public final boolean zza(int i9, Parcel parcel, Parcel parcel2, int i10) {
        switch (i9) {
            case 1:
                int i11 = parcel.readInt();
                zzc.zzb(parcel);
                e(i11);
                return true;
            case 2:
                C2266d c2266d = (C2266d) zzc.zza(parcel, C2266d.CREATOR);
                String string = parcel.readString();
                String string2 = parcel.readString();
                boolean zZzf = zzc.zzf(parcel);
                zzc.zzb(parcel);
                a0(c2266d, string, string2, zZzf);
                return true;
            case 3:
                int i12 = parcel.readInt();
                zzc.zzb(parcel);
                c(i12);
                return true;
            case 4:
                String string3 = parcel.readString();
                double d9 = parcel.readDouble();
                boolean zZzf2 = zzc.zzf(parcel);
                zzc.zzb(parcel);
                J(string3, d9, zZzf2);
                return true;
            case 5:
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                zzc.zzb(parcel);
                v0(string4, string5);
                return true;
            case 6:
                String string6 = parcel.readString();
                byte[] bArrCreateByteArray = parcel.createByteArray();
                zzc.zzb(parcel);
                S0(string6, bArrCreateByteArray);
                return true;
            case 7:
                int i13 = parcel.readInt();
                zzc.zzb(parcel);
                zze(i13);
                return true;
            case 8:
                int i14 = parcel.readInt();
                zzc.zzb(parcel);
                zzg(i14);
                return true;
            case 9:
                int i15 = parcel.readInt();
                zzc.zzb(parcel);
                zzd(i15);
                return true;
            case 10:
                String string7 = parcel.readString();
                long j9 = parcel.readLong();
                int i16 = parcel.readInt();
                zzc.zzb(parcel);
                m(string7, j9, i16);
                return true;
            case 11:
                String string8 = parcel.readString();
                long j10 = parcel.readLong();
                zzc.zzb(parcel);
                G0(string8, j10);
                return true;
            case 12:
                C2776c c2776c = (C2776c) zzc.zza(parcel, C2776c.CREATOR);
                zzc.zzb(parcel);
                f(c2776c);
                return true;
            case 13:
                C2778e c2778e = (C2778e) zzc.zza(parcel, C2778e.CREATOR);
                zzc.zzb(parcel);
                P(c2778e);
                return true;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                int i17 = parcel.readInt();
                zzc.zzb(parcel);
                G(i17);
                return true;
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                int i18 = parcel.readInt();
                zzc.zzb(parcel);
                N0(i18);
                return true;
            default:
                return false;
        }
    }
}
