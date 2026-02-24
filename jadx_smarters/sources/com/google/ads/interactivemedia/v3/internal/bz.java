package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
final class bz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f22597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C1325p f22598b = new C1325p();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f22599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f22600d;

    public bz(Object obj) {
        this.f22597a = obj;
    }

    public final void a(int i9, bx bxVar) {
        if (this.f22600d) {
            return;
        }
        if (i9 != -1) {
            this.f22598b.b(i9);
        }
        this.f22599c = true;
        bxVar.a(this.f22597a);
    }

    public final void b(by byVar) {
        if (this.f22600d || !this.f22599c) {
            return;
        }
        C1328q c1328qA = this.f22598b.a();
        this.f22598b = new C1325p();
        this.f22599c = false;
        byVar.a(this.f22597a, c1328qA);
    }

    public final void c(by byVar) {
        this.f22600d = true;
        if (this.f22599c) {
            byVar.a(this.f22597a, this.f22598b.a());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bz.class != obj.getClass()) {
            return false;
        }
        return this.f22597a.equals(((bz) obj).f22597a);
    }

    public final int hashCode() {
        return this.f22597a.hashCode();
    }
}
