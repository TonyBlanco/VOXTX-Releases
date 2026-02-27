package d4;

import android.view.Surface;

/* JADX INFO: loaded from: classes3.dex */
public final class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Surface f39736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f39738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f39739d;

    public V(Surface surface, int i9, int i10) {
        this(surface, i9, i10, 0);
    }

    public V(Surface surface, int i9, int i10, int i11) {
        AbstractC1684a.b(i11 == 0 || i11 == 90 || i11 == 180 || i11 == 270, "orientationDegrees must be 0, 90, 180, or 270");
        this.f39736a = surface;
        this.f39737b = i9;
        this.f39738c = i10;
        this.f39739d = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V)) {
            return false;
        }
        V v9 = (V) obj;
        return this.f39737b == v9.f39737b && this.f39738c == v9.f39738c && this.f39739d == v9.f39739d && this.f39736a.equals(v9.f39736a);
    }

    public int hashCode() {
        return (((((this.f39736a.hashCode() * 31) + this.f39737b) * 31) + this.f39738c) * 31) + this.f39739d;
    }
}
