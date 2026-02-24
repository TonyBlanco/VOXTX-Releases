package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class av {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1325p f20781a = new C1325p();

    public final aw a() {
        return new aw(this.f20781a.a());
    }

    public final void b(int i9) {
        this.f20781a.b(i9);
    }

    public final void c(aw awVar) {
        C1325p c1325p = this.f20781a;
        C1328q c1328q = awVar.f20836a;
        for (int i9 = 0; i9 < c1328q.b(); i9++) {
            c1325p.b(c1328q.a(i9));
        }
    }

    public final void d(int... iArr) {
        C1325p c1325p = this.f20781a;
        for (int i9 = 0; i9 < 21; i9++) {
            c1325p.b(iArr[i9]);
        }
    }

    public final void e(int i9, boolean z9) {
        C1325p c1325p = this.f20781a;
        if (z9) {
            c1325p.b(i9);
        }
    }
}
