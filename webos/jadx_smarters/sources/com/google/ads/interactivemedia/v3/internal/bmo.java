package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class bmo<T> extends bkl<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final bjt f21730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bke f21731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bjx f21732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final bof f21733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final bkm f21734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final bmm f21735f = new bmm();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f21736g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile bkl f21737h;

    public bmo(bke bkeVar, bjx bjxVar, bjt bjtVar, bof bofVar, bkm bkmVar, boolean z9) {
        this.f21731b = bkeVar;
        this.f21732c = bjxVar;
        this.f21730a = bjtVar;
        this.f21733d = bofVar;
        this.f21734e = bkmVar;
        this.f21736g = z9;
    }

    public static bkm a(bof bofVar, Object obj) {
        return new bmn(obj, bofVar, bofVar.d() == bofVar.c());
    }

    private final bkl b() {
        bkl bklVar = this.f21737h;
        if (bklVar != null) {
            return bklVar;
        }
        bkl bklVarC = this.f21730a.c(this.f21734e, this.f21733d);
        this.f21737h = bklVarC;
        return bklVarC;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final T read(boh bohVar) throws IOException {
        if (this.f21732c == null) {
            return (T) b().read(bohVar);
        }
        bjy bjyVarA = blo.a(bohVar);
        if (this.f21736g && (bjyVarA instanceof bka)) {
            return null;
        }
        return (T) this.f21732c.a();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final void write(boj bojVar, T t9) throws IOException {
        bke bkeVar = this.f21731b;
        if (bkeVar == null) {
            b().write(bojVar, t9);
        } else if (this.f21736g && t9 == null) {
            bojVar.g();
        } else {
            blo.b(bkeVar.a(t9), bojVar);
        }
    }
}
