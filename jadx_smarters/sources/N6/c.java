package N6;

import x6.q;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f5364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q[] f5365c;

    public c(int i9, int[] iArr, int i10, int i11, int i12) {
        this.f5363a = i9;
        this.f5364b = iArr;
        float f9 = i10;
        float f10 = i12;
        this.f5365c = new q[]{new q(f9, f10), new q(i11, f10)};
    }

    public q[] a() {
        return this.f5365c;
    }

    public int[] b() {
        return this.f5364b;
    }

    public int c() {
        return this.f5363a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && this.f5363a == ((c) obj).f5363a;
    }

    public int hashCode() {
        return this.f5363a;
    }
}
