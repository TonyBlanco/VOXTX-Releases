package de.blinkt.openvpn.core;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import de.blinkt.openvpn.core.j;

/* JADX INFO: loaded from: classes4.dex */
public interface i extends IInterface {

    public static abstract class a extends Binder implements i {

        /* JADX INFO: renamed from: de.blinkt.openvpn.core.i$a$a, reason: collision with other inner class name */
        public static class C0319a implements i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f40076a;

            public C0319a(IBinder iBinder) {
                this.f40076a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f40076a;
            }

            @Override // de.blinkt.openvpn.core.i
            public void g0(String str, int i9, String str2) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("de.blinkt.openvpn.core.IServiceStatus");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i9);
                    parcelObtain.writeString(str2);
                    this.f40076a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "de.blinkt.openvpn.core.IServiceStatus");
        }

        public static i A(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("de.blinkt.openvpn.core.IServiceStatus");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof i)) ? new C0319a(iBinder) : (i) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i9, Parcel parcel, Parcel parcel2, int i10) {
            Parcelable parcelableK;
            if (i9 >= 1 && i9 <= 16777215) {
                parcel.enforceInterface("de.blinkt.openvpn.core.IServiceStatus");
            }
            if (i9 == 1598968902) {
                parcel2.writeString("de.blinkt.openvpn.core.IServiceStatus");
                return true;
            }
            if (i9 != 1) {
                if (i9 == 2) {
                    E0(j.a.A(parcel.readStrongBinder()));
                } else {
                    if (i9 == 3) {
                        String strB0 = B0();
                        parcel2.writeNoException();
                        parcel2.writeString(strB0);
                        return true;
                    }
                    if (i9 == 4) {
                        g0(parcel.readString(), parcel.readInt(), parcel.readString());
                    } else {
                        if (i9 != 5) {
                            return super.onTransact(i9, parcel, parcel2, i10);
                        }
                        parcelableK = O();
                    }
                }
                parcel2.writeNoException();
                return true;
            }
            parcelableK = K(j.a.A(parcel.readStrongBinder()));
            parcel2.writeNoException();
            b.b(parcel2, parcelableK, 1);
            return true;
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

    String B0();

    void E0(j jVar);

    ParcelFileDescriptor K(j jVar);

    E O();

    void g0(String str, int i9, String str2);
}
