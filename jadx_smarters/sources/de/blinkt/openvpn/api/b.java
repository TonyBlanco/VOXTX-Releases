package de.blinkt.openvpn.api;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public interface b extends IInterface {

    public static abstract class a extends Binder implements b {

        /* JADX INFO: renamed from: de.blinkt.openvpn.api.b$a$a, reason: collision with other inner class name */
        public static class C0316a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f39948a;

            public C0316a(IBinder iBinder) {
                this.f39948a = iBinder;
            }

            @Override // de.blinkt.openvpn.api.b
            public void U(String str, String str2, String str3, String str4) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("de.blinkt.openvpn.api.IOpenVPNStatusCallback");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    parcelObtain.writeString(str4);
                    this.f39948a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f39948a;
            }
        }

        public static b A(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("de.blinkt.openvpn.api.IOpenVPNStatusCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new C0316a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }
    }

    void U(String str, String str2, String str3, String str4);
}
