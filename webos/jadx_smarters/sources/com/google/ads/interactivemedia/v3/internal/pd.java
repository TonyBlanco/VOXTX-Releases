package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class pd implements uf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f24042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pk f24043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f24044c = -1;

    public pd(pk pkVar, int i9) {
        this.f24043b = pkVar;
        this.f24042a = i9;
    }

    private final boolean f() {
        int i9 = this.f24044c;
        return (i9 == -1 || i9 == -3 || i9 == -2) ? false : true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.uf
    public final int a(go goVar, ef efVar, int i9) {
        int i10 = this.f24044c;
        if (i10 == -3) {
            efVar.a(4);
            return -4;
        }
        if (f()) {
            return this.f24043b.e(i10, goVar, efVar, i9);
        }
        return -3;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.uf
    public final int b(long j9) {
        if (f()) {
            return this.f24043b.f(this.f24044c, j9);
        }
        return 0;
    }

    public final void c() {
        af.u(this.f24044c == -1);
        this.f24044c = this.f24043b.d(this.f24042a);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.uf
    public final void d() throws IOException {
        int i9 = this.f24044c;
        if (i9 == -2) {
            throw new po(this.f24043b.h().b(this.f24042a).b(0).f24467l);
        }
        if (i9 == -1) {
            this.f24043b.q();
        } else if (i9 != -3) {
            this.f24043b.r(i9);
        }
    }

    public final void e() {
        if (this.f24044c != -1) {
            this.f24043b.B(this.f24042a);
            this.f24044c = -1;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.uf
    public final boolean g() {
        int i9 = this.f24044c;
        if (i9 != -3) {
            return f() && this.f24043b.C(i9);
        }
        return true;
    }
}
