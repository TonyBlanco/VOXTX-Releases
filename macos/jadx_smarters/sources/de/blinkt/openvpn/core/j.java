package de.blinkt.openvpn.core;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public interface j extends IInterface {

    public static abstract class a extends Binder implements j {

        /* JADX INFO: renamed from: de.blinkt.openvpn.core.j$a$a, reason: collision with other inner class name */
        public static class C0320a implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f40077a;

            public C0320a(IBinder iBinder) {
                this.f40077a = iBinder;
            }

            @Override // de.blinkt.openvpn.core.j
            public void Q(k kVar) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("de.blinkt.openvpn.core.IStatusCallbacks");
                    b.b(parcelObtain, kVar, 0);
                    this.f40077a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f40077a;
            }

            @Override // de.blinkt.openvpn.core.j
            public void k0(long j9, long j10) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("de.blinkt.openvpn.core.IStatusCallbacks");
                    parcelObtain.writeLong(j9);
                    parcelObtain.writeLong(j10);
                    this.f40077a.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // de.blinkt.openvpn.core.j
            public void t0(String str, String str2, int i9, EnumC1722e enumC1722e, Intent intent) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("de.blinkt.openvpn.core.IStatusCallbacks");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(i9);
                    b.b(parcelObtain, enumC1722e, 0);
                    b.b(parcelObtain, intent, 0);
                    this.f40077a.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // de.blinkt.openvpn.core.j
            public void y0(String str) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("de.blinkt.openvpn.core.IStatusCallbacks");
                    parcelObtain.writeString(str);
                    this.f40077a.transact(4, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public static j A(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("de.blinkt.openvpn.core.IStatusCallbacks");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof j)) ? new C0320a(iBinder) : (j) iInterfaceQueryLocalInterface;
        }
    }

    public static class b {
        public static void b(Parcel parcel, Parcelable parcelable, int i9) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i9);
            }
        }
    }

    void Q(k kVar);

    void k0(long j9, long j10);

    void t0(String str, String str2, int i9, EnumC1722e enumC1722e, Intent intent);

    void y0(String str);
}
