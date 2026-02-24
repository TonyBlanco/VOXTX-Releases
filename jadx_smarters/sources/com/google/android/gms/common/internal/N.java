package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import y4.AbstractC2985a;

/* JADX INFO: loaded from: classes3.dex */
public final class N extends AbstractC2985a {
    public static final Parcelable.Creator<N> CREATOR = new O();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f26769f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Account f26770g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f26771h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final GoogleSignInAccount f26772i;

    public N(int i9, Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this.f26769f = i9;
        this.f26770g = account;
        this.f26771h = i10;
        this.f26772i = googleSignInAccount;
    }

    public N(Account account, int i9, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i9, googleSignInAccount);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int i10 = this.f26769f;
        int iA = y4.c.a(parcel);
        y4.c.l(parcel, 1, i10);
        y4.c.r(parcel, 2, this.f26770g, i9, false);
        y4.c.l(parcel, 3, this.f26771h);
        y4.c.r(parcel, 4, this.f26772i, i9, false);
        y4.c.b(parcel, iA);
    }
}
