package w4;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.T;
import com.google.android.gms.common.internal.y0;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: renamed from: w4.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC2912A extends y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f51612a;

    public AbstractBinderC2912A(byte[] bArr) {
        com.google.android.gms.common.internal.r.a(bArr.length == 25);
        this.f51612a = Arrays.hashCode(bArr);
    }

    public static byte[] E(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e9) {
            throw new AssertionError(e9);
        }
    }

    public abstract byte[] Z();

    public final boolean equals(Object obj) {
        F4.a aVarZzd;
        if (obj != null && (obj instanceof T)) {
            try {
                T t9 = (T) obj;
                if (t9.zzc() == this.f51612a && (aVarZzd = t9.zzd()) != null) {
                    return Arrays.equals(Z(), (byte[]) F4.b.E(aVarZzd));
                }
                return false;
            } catch (RemoteException e9) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e9);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f51612a;
    }

    @Override // com.google.android.gms.common.internal.T
    public final int zzc() {
        return this.f51612a;
    }

    @Override // com.google.android.gms.common.internal.T
    public final F4.a zzd() {
        return F4.b.Z(Z());
    }
}
