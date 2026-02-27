package M4;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbn;
import com.google.android.gms.internal.measurement.zzbo;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.http.util.LangUtils;
import org.chromium.net.UrlRequest;

/* JADX INFO: renamed from: M4.o1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC0793o1 extends zzbn implements InterfaceC0799p1 {
    public AbstractBinderC0793o1() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.internal.measurement.zzbn
    public final boolean zza(int i9, Parcel parcel, Parcel parcel2, int i10) {
        List listY;
        switch (i9) {
            case 1:
                C0832v c0832v = (C0832v) zzbo.zza(parcel, C0832v.CREATOR);
                f5 f5Var = (f5) zzbo.zza(parcel, f5.CREATOR);
                zzbo.zzc(parcel);
                N(c0832v, f5Var);
                parcel2.writeNoException();
                return true;
            case 2:
                V4 v42 = (V4) zzbo.zza(parcel, V4.CREATOR);
                f5 f5Var2 = (f5) zzbo.zza(parcel, f5.CREATOR);
                zzbo.zzc(parcel);
                a1(v42, f5Var2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            default:
                return false;
            case 4:
                f5 f5Var3 = (f5) zzbo.zza(parcel, f5.CREATOR);
                zzbo.zzc(parcel);
                r(f5Var3);
                parcel2.writeNoException();
                return true;
            case 5:
                C0832v c0832v2 = (C0832v) zzbo.zza(parcel, C0832v.CREATOR);
                String string = parcel.readString();
                String string2 = parcel.readString();
                zzbo.zzc(parcel);
                g(c0832v2, string, string2);
                parcel2.writeNoException();
                return true;
            case 6:
                f5 f5Var4 = (f5) zzbo.zza(parcel, f5.CREATOR);
                zzbo.zzc(parcel);
                u0(f5Var4);
                parcel2.writeNoException();
                return true;
            case 7:
                f5 f5Var5 = (f5) zzbo.zza(parcel, f5.CREATOR);
                boolean zZzf = zzbo.zzf(parcel);
                zzbo.zzc(parcel);
                listY = y(f5Var5, zZzf);
                parcel2.writeNoException();
                parcel2.writeTypedList(listY);
                return true;
            case 9:
                C0832v c0832v3 = (C0832v) zzbo.zza(parcel, C0832v.CREATOR);
                String string3 = parcel.readString();
                zzbo.zzc(parcel);
                byte[] bArrF = F(c0832v3, string3);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrF);
                return true;
            case 10:
                long j9 = parcel.readLong();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                zzbo.zzc(parcel);
                C(j9, string4, string5, string6);
                parcel2.writeNoException();
                return true;
            case 11:
                f5 f5Var6 = (f5) zzbo.zza(parcel, f5.CREATOR);
                zzbo.zzc(parcel);
                String strI = I(f5Var6);
                parcel2.writeNoException();
                parcel2.writeString(strI);
                return true;
            case 12:
                C0725d c0725d = (C0725d) zzbo.zza(parcel, C0725d.CREATOR);
                f5 f5Var7 = (f5) zzbo.zza(parcel, f5.CREATOR);
                zzbo.zzc(parcel);
                P0(c0725d, f5Var7);
                parcel2.writeNoException();
                return true;
            case 13:
                C0725d c0725d2 = (C0725d) zzbo.zza(parcel, C0725d.CREATOR);
                zzbo.zzc(parcel);
                C0(c0725d2);
                parcel2.writeNoException();
                return true;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                boolean zZzf2 = zzbo.zzf(parcel);
                f5 f5Var8 = (f5) zzbo.zza(parcel, f5.CREATOR);
                zzbo.zzc(parcel);
                listY = b(string7, string8, zZzf2, f5Var8);
                parcel2.writeNoException();
                parcel2.writeTypedList(listY);
                return true;
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                boolean zZzf3 = zzbo.zzf(parcel);
                zzbo.zzc(parcel);
                listY = b0(string9, string10, string11, zZzf3);
                parcel2.writeNoException();
                parcel2.writeTypedList(listY);
                return true;
            case 16:
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                f5 f5Var9 = (f5) zzbo.zza(parcel, f5.CREATOR);
                zzbo.zzc(parcel);
                listY = s0(string12, string13, f5Var9);
                parcel2.writeNoException();
                parcel2.writeTypedList(listY);
                return true;
            case LangUtils.HASH_SEED /* 17 */:
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                zzbo.zzc(parcel);
                listY = l0(string14, string15, string16);
                parcel2.writeNoException();
                parcel2.writeTypedList(listY);
                return true;
            case 18:
                f5 f5Var10 = (f5) zzbo.zza(parcel, f5.CREATOR);
                zzbo.zzc(parcel);
                T0(f5Var10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) zzbo.zza(parcel, Bundle.CREATOR);
                f5 f5Var11 = (f5) zzbo.zza(parcel, f5.CREATOR);
                zzbo.zzc(parcel);
                z0(bundle, f5Var11);
                parcel2.writeNoException();
                return true;
            case 20:
                f5 f5Var12 = (f5) zzbo.zza(parcel, f5.CREATOR);
                zzbo.zzc(parcel);
                j0(f5Var12);
                parcel2.writeNoException();
                return true;
        }
    }
}
