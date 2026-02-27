package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.Handler;

/* JADX INFO: loaded from: classes3.dex */
public final class ale implements hk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f20122a;

    public ale(Context context) {
        this.f20122a = context;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hk
    public final hh[] a(Handler handler, yi yiVar, jj jjVar) {
        Context context = this.f20122a;
        rm rmVar = rm.f24430b;
        re reVar = re.f24363a;
        xr xrVar = new xr(context, reVar, rmVar, handler, yiVar);
        Context context2 = this.f20122a;
        iy iyVar = iy.f23324a;
        jb[] jbVarArr = new jb[0];
        ka kaVar = new ka();
        if (iyVar == null && iyVar == null) {
            throw new NullPointerException("Both parameters are null");
        }
        kaVar.c(iyVar);
        kaVar.e(new ui(jbVarArr));
        return new hh[]{xrVar, new kn(context2, reVar, rmVar, handler, jjVar, kaVar.b())};
    }
}
