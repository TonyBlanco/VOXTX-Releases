package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.InterfaceC1412k;
import w4.C2916d;
import y4.AbstractC2985a;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1408g extends AbstractC2985a {
    public static final Parcelable.Creator<C1408g> CREATOR = new n0();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Scope[] f26818t = new Scope[0];

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C2916d[] f26819u = new C2916d[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f26820f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f26821g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f26822h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f26823i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public IBinder f26824j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Scope[] f26825k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Bundle f26826l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Account f26827m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C2916d[] f26828n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C2916d[] f26829o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f26830p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f26831q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f26832r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f26833s;

    public C1408g(int i9, int i10, int i11, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C2916d[] c2916dArr, C2916d[] c2916dArr2, boolean z9, int i12, boolean z10, String str2) {
        scopeArr = scopeArr == null ? f26818t : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        c2916dArr = c2916dArr == null ? f26819u : c2916dArr;
        c2916dArr2 = c2916dArr2 == null ? f26819u : c2916dArr2;
        this.f26820f = i9;
        this.f26821g = i10;
        this.f26822h = i11;
        if ("com.google.android.gms".equals(str)) {
            this.f26823i = "com.google.android.gms";
        } else {
            this.f26823i = str;
        }
        if (i9 < 2) {
            this.f26827m = iBinder != null ? AbstractBinderC1402a.E(InterfaceC1412k.a.A(iBinder)) : null;
        } else {
            this.f26824j = iBinder;
            this.f26827m = account;
        }
        this.f26825k = scopeArr;
        this.f26826l = bundle;
        this.f26828n = c2916dArr;
        this.f26829o = c2916dArr2;
        this.f26830p = z9;
        this.f26831q = i12;
        this.f26832r = z10;
        this.f26833s = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        n0.a(this, parcel, i9);
    }

    public final String zza() {
        return this.f26833s;
    }
}
