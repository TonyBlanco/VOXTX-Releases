package de.blinkt.openvpn.api;

import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import de.blinkt.openvpn.api.b;
import h8.C1868a;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes4.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: de.blinkt.openvpn.api.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0315a extends Binder implements a {
        public AbstractBinderC0315a() {
            attachInterface(this, "de.blinkt.openvpn.api.IOpenVPNAPIService");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Binder
        public boolean onTransact(int i9, Parcel parcel, Parcel parcel2, int i10) {
            Parcelable parcelableY0;
            int iL;
            if (i9 >= 1 && i9 <= 16777215) {
                parcel.enforceInterface("de.blinkt.openvpn.api.IOpenVPNAPIService");
            }
            if (i9 == 1598968902) {
                parcel2.writeString("de.blinkt.openvpn.api.IOpenVPNAPIService");
                return true;
            }
            switch (i9) {
                case 1:
                    List listR0 = r0();
                    parcel2.writeNoException();
                    b.e(parcel2, listR0, 1);
                    return true;
                case 2:
                    u(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    iL = L(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(iL);
                    return true;
                case 4:
                    k(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcelableY0 = Y0(parcel.readString());
                    parcel2.writeNoException();
                    b.f(parcel2, parcelableY0, 1);
                    return true;
                case 6:
                    parcelableY0 = D();
                    parcel2.writeNoException();
                    b.f(parcel2, parcelableY0, 1);
                    return true;
                case 7:
                    disconnect();
                    parcel2.writeNoException();
                    return true;
                case 8:
                    pause();
                    parcel2.writeNoException();
                    return true;
                case 9:
                    resume();
                    parcel2.writeNoException();
                    return true;
                case 10:
                    R(b.a.A(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 11:
                    w(b.a.A(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 12:
                    F0(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 13:
                    iL = O0((ParcelFileDescriptor) b.d(parcel, ParcelFileDescriptor.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(iL);
                    return true;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    parcelableY0 = t(parcel.readString(), parcel.readInt() != 0, parcel.readString());
                    parcel2.writeNoException();
                    b.f(parcel2, parcelableY0, 1);
                    return true;
                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                    q0(parcel.readString(), (Bundle) b.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i9, parcel, parcel2, i10);
            }
        }
    }

    public static class b {
        public static Object d(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static void e(Parcel parcel, List list, int i9) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i10 = 0; i10 < size; i10++) {
                f(parcel, (Parcelable) list.get(i10), i9);
            }
        }

        public static void f(Parcel parcel, Parcelable parcelable, int i9) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i9);
            }
        }
    }

    Intent D();

    void F0(String str);

    boolean L(String str, String str2);

    boolean O0(ParcelFileDescriptor parcelFileDescriptor);

    void R(de.blinkt.openvpn.api.b bVar);

    Intent Y0(String str);

    void disconnect();

    void k(String str);

    void pause();

    void q0(String str, Bundle bundle);

    List r0();

    void resume();

    C1868a t(String str, boolean z9, String str2);

    void u(String str);

    void w(de.blinkt.openvpn.api.b bVar);
}
