package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import okhttp3.internal.ws.WebSocketProtocol;
import org.chromium.net.UrlRequest;
import w4.C2916d;

/* JADX INFO: loaded from: classes3.dex */
public final class n0 implements Parcelable.Creator {
    public static void a(C1408g c1408g, Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.l(parcel, 1, c1408g.f26820f);
        y4.c.l(parcel, 2, c1408g.f26821g);
        y4.c.l(parcel, 3, c1408g.f26822h);
        y4.c.t(parcel, 4, c1408g.f26823i, false);
        y4.c.k(parcel, 5, c1408g.f26824j, false);
        y4.c.w(parcel, 6, c1408g.f26825k, i9, false);
        y4.c.e(parcel, 7, c1408g.f26826l, false);
        y4.c.r(parcel, 8, c1408g.f26827m, i9, false);
        y4.c.w(parcel, 10, c1408g.f26828n, i9, false);
        y4.c.w(parcel, 11, c1408g.f26829o, i9, false);
        y4.c.c(parcel, 12, c1408g.f26830p);
        y4.c.l(parcel, 13, c1408g.f26831q);
        y4.c.c(parcel, 14, c1408g.f26832r);
        y4.c.t(parcel, 15, c1408g.zza(), false);
        y4.c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        Scope[] scopeArr = C1408g.f26818t;
        Bundle bundle = new Bundle();
        C2916d[] c2916dArr = C1408g.f26819u;
        C2916d[] c2916dArr2 = c2916dArr;
        String strF = null;
        IBinder iBinderT = null;
        Account account = null;
        String strF2 = null;
        int iU = 0;
        int iU2 = 0;
        int iU3 = 0;
        boolean zM = false;
        int iU4 = 0;
        boolean zM2 = false;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            switch (y4.b.l(iS)) {
                case 1:
                    iU = y4.b.u(parcel, iS);
                    break;
                case 2:
                    iU2 = y4.b.u(parcel, iS);
                    break;
                case 3:
                    iU3 = y4.b.u(parcel, iS);
                    break;
                case 4:
                    strF = y4.b.f(parcel, iS);
                    break;
                case 5:
                    iBinderT = y4.b.t(parcel, iS);
                    break;
                case 6:
                    scopeArr = (Scope[]) y4.b.i(parcel, iS, Scope.CREATOR);
                    break;
                case 7:
                    bundle = y4.b.a(parcel, iS);
                    break;
                case 8:
                    account = (Account) y4.b.e(parcel, iS, Account.CREATOR);
                    break;
                case 9:
                default:
                    y4.b.A(parcel, iS);
                    break;
                case 10:
                    c2916dArr = (C2916d[]) y4.b.i(parcel, iS, C2916d.CREATOR);
                    break;
                case 11:
                    c2916dArr2 = (C2916d[]) y4.b.i(parcel, iS, C2916d.CREATOR);
                    break;
                case 12:
                    zM = y4.b.m(parcel, iS);
                    break;
                case 13:
                    iU4 = y4.b.u(parcel, iS);
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    zM2 = y4.b.m(parcel, iS);
                    break;
                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                    strF2 = y4.b.f(parcel, iS);
                    break;
            }
        }
        y4.b.k(parcel, iB);
        return new C1408g(iU, iU2, iU3, strF, iBinderT, scopeArr, bundle, account, c2916dArr, c2916dArr2, zM, iU4, zM2, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new C1408g[i9];
    }
}
