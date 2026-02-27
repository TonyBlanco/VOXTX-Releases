package O2;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import d4.AbstractC1684a;
import java.util.List;
import s5.AbstractC2743y;

/* JADX INFO: renamed from: O2.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC0898m extends Binder {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f6130c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC2743y f6131a;

    static {
        f6130c = d4.k0.f39777a >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : 65536;
    }

    public BinderC0898m(List list) {
        this.f6131a = AbstractC2743y.r(list);
    }

    public static AbstractC2743y a(IBinder iBinder) {
        int i9;
        AbstractC2743y.a aVarP = AbstractC2743y.p();
        int i10 = 1;
        int i11 = 0;
        while (i10 != 0) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInt(i11);
                try {
                    iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                    while (true) {
                        i9 = parcelObtain2.readInt();
                        if (i9 == 1) {
                            aVarP.a((Bundle) AbstractC1684a.e(parcelObtain2.readBundle()));
                            i11++;
                        }
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    i10 = i9;
                } catch (RemoteException e9) {
                    throw new RuntimeException(e9);
                }
            } catch (Throwable th) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th;
            }
        }
        return aVarP.k();
    }

    @Override // android.os.Binder
    public boolean onTransact(int i9, Parcel parcel, Parcel parcel2, int i10) {
        if (i9 != 1) {
            return super.onTransact(i9, parcel, parcel2, i10);
        }
        if (parcel2 == null) {
            return false;
        }
        int size = this.f6131a.size();
        int i11 = parcel.readInt();
        while (i11 < size && parcel2.dataSize() < f6130c) {
            parcel2.writeInt(1);
            parcel2.writeBundle((Bundle) this.f6131a.get(i11));
            i11++;
        }
        parcel2.writeInt(i11 < size ? 2 : 0);
        return true;
    }
}
