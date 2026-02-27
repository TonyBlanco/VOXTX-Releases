package q5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: q5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2554a implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f46913a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f46914c = "com.google.android.play.core.integrity.protocol.IIntegrityService";

    public AbstractC2554a(IBinder iBinder, String str) {
        this.f46913a = iBinder;
    }

    public final Parcel A() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f46914c);
        return parcelObtain;
    }

    public final void E(int i9, Parcel parcel) {
        try {
            this.f46913a.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f46913a;
    }
}
