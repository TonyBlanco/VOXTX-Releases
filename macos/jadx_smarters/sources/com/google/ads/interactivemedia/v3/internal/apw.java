package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.RemoteException;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.http.util.LangUtils;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes3.dex */
public abstract class apw extends apq implements apx {
    public apw() {
        super("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apq
    public final boolean a(int i9, Parcel parcel, Parcel parcel2) throws RemoteException {
        String strJ;
        boolean zP;
        aro aroVarD;
        switch (i9) {
            case 1:
                parcel2.writeNoException();
                strJ = j();
                parcel2.writeString(strJ);
                return true;
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                apr.b(parcel);
                n(string, string2);
                parcel2.writeNoException();
                return true;
            case 3:
                aro aroVarB = arn.b(parcel.readStrongBinder());
                apr.b(parcel);
                zP = p(aroVarB);
                parcel2.writeNoException();
                apr.c(parcel2, zP);
                return true;
            case 4:
                aro aroVarB2 = arn.b(parcel.readStrongBinder());
                apr.b(parcel);
                zP = q(aroVarB2);
                parcel2.writeNoException();
                apr.c(parcel2, zP);
                return true;
            case 5:
                String string3 = parcel.readString();
                apr.b(parcel);
                o(string3);
                parcel2.writeNoException();
                return true;
            case 6:
                aro aroVarB3 = arn.b(parcel.readStrongBinder());
                aro aroVarB4 = arn.b(parcel.readStrongBinder());
                apr.b(parcel);
                aroVarD = d(aroVarB3, aroVarB4);
                parcel2.writeNoException();
                apr.e(parcel2, aroVarD);
                return true;
            case 7:
                aro aroVarB5 = arn.b(parcel.readStrongBinder());
                apr.b(parcel);
                strJ = f(aroVarB5);
                parcel2.writeNoException();
                parcel2.writeString(strJ);
                return true;
            case 8:
                aro aroVarB6 = arn.b(parcel.readStrongBinder());
                String string4 = parcel.readString();
                apr.b(parcel);
                strJ = e(aroVarB6, string4);
                parcel2.writeNoException();
                parcel2.writeString(strJ);
                return true;
            case 9:
                aro aroVarB7 = arn.b(parcel.readStrongBinder());
                apr.b(parcel);
                l(aroVarB7);
                parcel2.writeNoException();
                return true;
            case 10:
                aro aroVarB8 = arn.b(parcel.readStrongBinder());
                aro aroVarB9 = arn.b(parcel.readStrongBinder());
                apr.b(parcel);
                aroVarD = c(aroVarB8, aroVarB9);
                parcel2.writeNoException();
                apr.e(parcel2, aroVarD);
                return true;
            case 11:
                String string5 = parcel.readString();
                boolean zF = apr.f(parcel);
                apr.b(parcel);
                zP = s(string5, zF);
                parcel2.writeNoException();
                apr.c(parcel2, zP);
                return true;
            case 12:
                aro aroVarB10 = arn.b(parcel.readStrongBinder());
                byte[] bArrCreateByteArray = parcel.createByteArray();
                apr.b(parcel);
                strJ = g(aroVarB10, bArrCreateByteArray);
                parcel2.writeNoException();
                parcel2.writeString(strJ);
                return true;
            case 13:
                aro aroVarB11 = arn.b(parcel.readStrongBinder());
                apr.b(parcel);
                strJ = i(aroVarB11);
                parcel2.writeNoException();
                parcel2.writeString(strJ);
                return true;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                aro aroVarB12 = arn.b(parcel.readStrongBinder());
                aro aroVarB13 = arn.b(parcel.readStrongBinder());
                aro aroVarB14 = arn.b(parcel.readStrongBinder());
                apr.b(parcel);
                strJ = k(aroVarB12, aroVarB13, aroVarB14);
                parcel2.writeNoException();
                parcel2.writeString(strJ);
                return true;
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                aro aroVarB15 = arn.b(parcel.readStrongBinder());
                apr.b(parcel);
                m(aroVarB15);
                parcel2.writeNoException();
                return true;
            case 16:
            default:
                return false;
            case LangUtils.HASH_SEED /* 17 */:
                aro aroVarB16 = arn.b(parcel.readStrongBinder());
                aro aroVarB17 = arn.b(parcel.readStrongBinder());
                aro aroVarB18 = arn.b(parcel.readStrongBinder());
                aro aroVarB19 = arn.b(parcel.readStrongBinder());
                apr.b(parcel);
                strJ = h(aroVarB16, aroVarB17, aroVarB18, aroVarB19);
                parcel2.writeNoException();
                parcel2.writeString(strJ);
                return true;
            case 18:
                zP = r();
                parcel2.writeNoException();
                apr.c(parcel2, zP);
                return true;
            case 19:
                zP = t();
                parcel2.writeNoException();
                apr.c(parcel2, zP);
                return true;
            case 20:
                int iB = b();
                parcel2.writeNoException();
                parcel2.writeInt(iB);
                return true;
        }
    }
}
