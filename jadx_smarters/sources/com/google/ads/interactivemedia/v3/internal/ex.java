package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ex implements atq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f22867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f22868b;

    public /* synthetic */ ex(Context context, int i9) {
        this.f22868b = i9;
        this.f22867a = context;
    }

    public /* synthetic */ ex(hk hkVar, int i9) {
        this.f22868b = i9;
        this.f22867a = hkVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.atq
    public final Object a() {
        int i9 = this.f22868b;
        if (i9 == 0) {
            return new sr((Context) this.f22867a, new ze());
        }
        if (i9 == 1) {
            return this.f22867a;
        }
        if (i9 == 2) {
            return new wd((Context) this.f22867a);
        }
        if (i9 == 3) {
            return wt.i((Context) this.f22867a);
        }
        Object obj = this.f22867a;
        aqj aqjVar = aqo.f20526a;
        aqd.a().e((Context) obj);
        return null;
    }
}
