package d4;

import android.util.SparseBooleanArray;

/* JADX INFO: renamed from: d4.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1701s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f39805a;

    /* JADX INFO: renamed from: d4.s$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SparseBooleanArray f39806a = new SparseBooleanArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f39807b;

        public b a(int i9) {
            AbstractC1684a.g(!this.f39807b);
            this.f39806a.append(i9, true);
            return this;
        }

        public b b(C1701s c1701s) {
            for (int i9 = 0; i9 < c1701s.d(); i9++) {
                a(c1701s.c(i9));
            }
            return this;
        }

        public b c(int... iArr) {
            for (int i9 : iArr) {
                a(i9);
            }
            return this;
        }

        public b d(int i9, boolean z9) {
            return z9 ? a(i9) : this;
        }

        public C1701s e() {
            AbstractC1684a.g(!this.f39807b);
            this.f39807b = true;
            return new C1701s(this.f39806a);
        }
    }

    public C1701s(SparseBooleanArray sparseBooleanArray) {
        this.f39805a = sparseBooleanArray;
    }

    public boolean a(int i9) {
        return this.f39805a.get(i9);
    }

    public boolean b(int... iArr) {
        for (int i9 : iArr) {
            if (a(i9)) {
                return true;
            }
        }
        return false;
    }

    public int c(int i9) {
        AbstractC1684a.c(i9, 0, d());
        return this.f39805a.keyAt(i9);
    }

    public int d() {
        return this.f39805a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1701s)) {
            return false;
        }
        C1701s c1701s = (C1701s) obj;
        if (k0.f39777a >= 24) {
            return this.f39805a.equals(c1701s.f39805a);
        }
        if (d() != c1701s.d()) {
            return false;
        }
        for (int i9 = 0; i9 < d(); i9++) {
            if (c(i9) != c1701s.c(i9)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (k0.f39777a >= 24) {
            return this.f39805a.hashCode();
        }
        int iD = d();
        for (int i9 = 0; i9 < d(); i9++) {
            iD = (iD * 31) + c(i9);
        }
        return iD;
    }
}
