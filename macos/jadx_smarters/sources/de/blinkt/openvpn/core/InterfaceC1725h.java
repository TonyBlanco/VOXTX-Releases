package de.blinkt.openvpn.core;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: de.blinkt.openvpn.core.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC1725h extends IInterface {

    /* JADX INFO: renamed from: de.blinkt.openvpn.core.h$a */
    public static abstract class a extends Binder implements InterfaceC1725h {

        /* JADX INFO: renamed from: de.blinkt.openvpn.core.h$a$a, reason: collision with other inner class name */
        public static class C0318a implements InterfaceC1725h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f40075a;

            public C0318a(IBinder iBinder) {
                this.f40075a = iBinder;
            }

            @Override // de.blinkt.openvpn.core.InterfaceC1725h
            public void H0(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("de.blinkt.openvpn.core.IOpenVPNServiceInternal");
                    parcelObtain.writeString(str);
                    this.f40075a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // de.blinkt.openvpn.core.InterfaceC1725h
            public void T(boolean z9) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("de.blinkt.openvpn.core.IOpenVPNServiceInternal");
                    parcelObtain.writeInt(z9 ? 1 : 0);
                    this.f40075a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // de.blinkt.openvpn.core.InterfaceC1725h
            public boolean a(boolean z9) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("de.blinkt.openvpn.core.IOpenVPNServiceInternal");
                    parcelObtain.writeInt(z9 ? 1 : 0);
                    this.f40075a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f40075a;
            }

            @Override // de.blinkt.openvpn.core.InterfaceC1725h
            public boolean protect(int i9) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("de.blinkt.openvpn.core.IOpenVPNServiceInternal");
                    parcelObtain.writeInt(i9);
                    this.f40075a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // de.blinkt.openvpn.core.InterfaceC1725h
            public boolean s(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("de.blinkt.openvpn.core.IOpenVPNServiceInternal");
                    parcelObtain.writeString(str);
                    this.f40075a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "de.blinkt.openvpn.core.IOpenVPNServiceInternal");
        }

        public static InterfaceC1725h A(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("de.blinkt.openvpn.core.IOpenVPNServiceInternal");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC1725h)) ? new C0318a(iBinder) : (InterfaceC1725h) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Binder
        public boolean onTransact(int i9, Parcel parcel, Parcel parcel2, int i10) {
            int iProtect;
            if (i9 >= 1 && i9 <= 16777215) {
                parcel.enforceInterface("de.blinkt.openvpn.core.IOpenVPNServiceInternal");
            }
            if (i9 == 1598968902) {
                parcel2.writeString("de.blinkt.openvpn.core.IOpenVPNServiceInternal");
                return true;
            }
            switch (i9) {
                case 1:
                    iProtect = protect(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(iProtect);
                    return true;
                case 2:
                    T(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    iProtect = a(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(iProtect);
                    return true;
                case 4:
                    H0(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    iProtect = s(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(iProtect);
                    return true;
                case 6:
                    L0(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i9, parcel, parcel2, i10);
            }
        }
    }

    void H0(String str);

    void L0(String str);

    void T(boolean z9);

    boolean a(boolean z9);

    boolean protect(int i9);

    boolean s(String str);
}
