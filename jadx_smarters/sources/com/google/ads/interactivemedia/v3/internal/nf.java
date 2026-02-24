package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
final class nf implements ns {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ nj f23862a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final nn f23863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private nm f23864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f23865e;

    public nf(nj njVar, nn nnVar) {
        this.f23862a = njVar;
        this.f23863c = nnVar;
    }

    public final /* synthetic */ void a(C1333s c1333s) {
        nj njVar = this.f23862a;
        if (njVar.f23881m == 0 || this.f23865e) {
            return;
        }
        Looper looper = njVar.f23885q;
        af.s(looper);
        this.f23864d = njVar.x(looper, this.f23863c, c1333s, false);
        this.f23862a.f23879k.add(this);
    }

    public final /* synthetic */ void b() {
        if (this.f23865e) {
            return;
        }
        nm nmVar = this.f23864d;
        if (nmVar != null) {
            nmVar.m(this.f23863c);
        }
        this.f23862a.f23879k.remove(this);
        this.f23865e = true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ns
    public final void c() {
        Handler handler = this.f23862a.f23886r;
        af.s(handler);
        cq.at(handler, new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.nd
            @Override // java.lang.Runnable
            public final void run() {
                this.f23859a.b();
            }
        });
    }
}
