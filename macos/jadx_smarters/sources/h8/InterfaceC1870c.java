package h8;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: h8.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC1870c extends IInterface {

    /* JADX INFO: renamed from: h8.c$a */
    public static abstract class a extends Binder implements InterfaceC1870c {

        /* JADX INFO: renamed from: h8.c$a$a, reason: collision with other inner class name */
        public static class C0343a implements InterfaceC1870c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f41708a;

            public C0343a(IBinder iBinder) {
                this.f41708a = iBinder;
            }

            @Override // h8.InterfaceC1870c
            public byte[] I0(String str, byte[] bArr, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("de.blinkt.openvpn.api.ExternalCertificateProvider");
                    parcelObtain.writeString(str);
                    parcelObtain.writeByteArray(bArr);
                    b.b(parcelObtain, bundle, 0);
                    this.f41708a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createByteArray();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f41708a;
            }

            @Override // h8.InterfaceC1870c
            public byte[] getCertificateChain(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("de.blinkt.openvpn.api.ExternalCertificateProvider");
                    parcelObtain.writeString(str);
                    this.f41708a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createByteArray();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // h8.InterfaceC1870c
            public byte[] x(String str, byte[] bArr) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("de.blinkt.openvpn.api.ExternalCertificateProvider");
                    parcelObtain.writeString(str);
                    parcelObtain.writeByteArray(bArr);
                    this.f41708a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createByteArray();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static InterfaceC1870c A(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("de.blinkt.openvpn.api.ExternalCertificateProvider");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC1870c)) ? new C0343a(iBinder) : (InterfaceC1870c) iInterfaceQueryLocalInterface;
        }
    }

    /* JADX INFO: renamed from: h8.c$b */
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

    byte[] I0(String str, byte[] bArr, Bundle bundle);

    byte[] getCertificateChain(String str);

    byte[] x(String str, byte[] bArr);
}
