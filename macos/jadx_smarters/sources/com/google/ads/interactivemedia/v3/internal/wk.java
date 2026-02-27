package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class wk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hj[] f24977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final we[] f24978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bk f24979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f24980e;

    public wk(hj[] hjVarArr, we[] weVarArr, bk bkVar, Object obj) {
        this.f24977b = hjVarArr;
        this.f24978c = (we[]) weVarArr.clone();
        this.f24979d = bkVar;
        this.f24980e = obj;
        this.f24976a = hjVarArr.length;
    }

    public final boolean a(wk wkVar, int i9) {
        return wkVar != null && cq.V(this.f24977b[i9], wkVar.f24977b[i9]) && cq.V(this.f24978c[i9], wkVar.f24978c[i9]);
    }

    public final boolean b(int i9) {
        return this.f24977b[i9] != null;
    }
}
