package w4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.y0;
import y4.AbstractC2985a;

/* JADX INFO: loaded from: classes3.dex */
public final class J extends AbstractC2985a {
    public static final Parcelable.Creator<J> CREATOR = new K();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f51634f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AbstractBinderC2912A f51635g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f51636h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f51637i;

    public J(String str, IBinder iBinder, boolean z9, boolean z10) {
        this.f51634f = str;
        B b9 = null;
        if (iBinder != null) {
            try {
                F4.a aVarZzd = y0.A(iBinder).zzd();
                byte[] bArr = aVarZzd == null ? null : (byte[]) F4.b.E(aVarZzd);
                if (bArr != null) {
                    b9 = new B(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e9) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e9);
            }
        }
        this.f51635g = b9;
        this.f51636h = z9;
        this.f51637i = z10;
    }

    public J(String str, AbstractBinderC2912A abstractBinderC2912A, boolean z9, boolean z10) {
        this.f51634f = str;
        this.f51635g = abstractBinderC2912A;
        this.f51636h = z9;
        this.f51637i = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        String str = this.f51634f;
        int iA = y4.c.a(parcel);
        y4.c.t(parcel, 1, str, false);
        AbstractBinderC2912A abstractBinderC2912A = this.f51635g;
        if (abstractBinderC2912A == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            abstractBinderC2912A = null;
        }
        y4.c.k(parcel, 2, abstractBinderC2912A, false);
        y4.c.c(parcel, 3, this.f51636h);
        y4.c.c(parcel, 4, this.f51637i);
        y4.c.b(parcel, iA);
    }
}
