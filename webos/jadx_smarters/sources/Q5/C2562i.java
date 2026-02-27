package q5;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: q5.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2562i extends AbstractC2554a implements InterfaceC2564k {
    public C2562i(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService");
    }

    @Override // q5.InterfaceC2564k
    public final void n(Bundle bundle, InterfaceC2566m interfaceC2566m) {
        Parcel parcelA = A();
        AbstractC2559f.c(parcelA, bundle);
        AbstractC2559f.d(parcelA, interfaceC2566m);
        E(2, parcelA);
    }
}
