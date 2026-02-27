package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: loaded from: classes3.dex */
public final class O implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int iU = 0;
        int iU2 = 0;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            int iL = y4.b.l(iS);
            if (iL == 1) {
                iU = y4.b.u(parcel, iS);
            } else if (iL == 2) {
                account = (Account) y4.b.e(parcel, iS, Account.CREATOR);
            } else if (iL == 3) {
                iU2 = y4.b.u(parcel, iS);
            } else if (iL != 4) {
                y4.b.A(parcel, iS);
            } else {
                googleSignInAccount = (GoogleSignInAccount) y4.b.e(parcel, iS, GoogleSignInAccount.CREATOR);
            }
        }
        y4.b.k(parcel, iB);
        return new N(iU, account, iU2, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new N[i9];
    }
}
