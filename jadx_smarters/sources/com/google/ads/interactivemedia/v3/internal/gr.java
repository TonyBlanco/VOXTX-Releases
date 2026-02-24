package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
final class gr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final te f23080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f23081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f23082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f23083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f23084e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f23085f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f23086g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f23087h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f23088i;

    public gr(te teVar, long j9, long j10, long j11, long j12, boolean z9, boolean z10, boolean z11, boolean z12) {
        af.u(!z12 || z10);
        af.u(!z11 || z10);
        af.u(true);
        this.f23080a = teVar;
        this.f23081b = j9;
        this.f23082c = j10;
        this.f23083d = j11;
        this.f23084e = j12;
        this.f23085f = false;
        this.f23086g = z10;
        this.f23087h = z11;
        this.f23088i = z12;
    }

    public final gr a(long j9) {
        return j9 == this.f23082c ? this : new gr(this.f23080a, this.f23081b, j9, this.f23083d, this.f23084e, false, this.f23086g, this.f23087h, this.f23088i);
    }

    public final gr b(long j9) {
        return j9 == this.f23081b ? this : new gr(this.f23080a, j9, this.f23082c, this.f23083d, this.f23084e, false, this.f23086g, this.f23087h, this.f23088i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gr.class == obj.getClass()) {
            gr grVar = (gr) obj;
            if (this.f23081b == grVar.f23081b && this.f23082c == grVar.f23082c && this.f23083d == grVar.f23083d && this.f23084e == grVar.f23084e && this.f23086g == grVar.f23086g && this.f23087h == grVar.f23087h && this.f23088i == grVar.f23088i && cq.V(this.f23080a, grVar.f23080a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.f23080a.hashCode() + 527) * 31) + ((int) this.f23081b)) * 31) + ((int) this.f23082c)) * 31) + ((int) this.f23083d)) * 31) + ((int) this.f23084e)) * 961) + (this.f23086g ? 1 : 0)) * 31) + (this.f23087h ? 1 : 0)) * 31) + (this.f23088i ? 1 : 0);
    }
}
