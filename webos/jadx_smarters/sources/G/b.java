package G;

import android.graphics.Insets;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f2103e = new b(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2107d;

    public static class a {
        public static Insets a(int i9, int i10, int i11, int i12) {
            return Insets.of(i9, i10, i11, i12);
        }
    }

    public b(int i9, int i10, int i11, int i12) {
        this.f2104a = i9;
        this.f2105b = i10;
        this.f2106c = i11;
        this.f2107d = i12;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f2104a, bVar2.f2104a), Math.max(bVar.f2105b, bVar2.f2105b), Math.max(bVar.f2106c, bVar2.f2106c), Math.max(bVar.f2107d, bVar2.f2107d));
    }

    public static b b(int i9, int i10, int i11, int i12) {
        return (i9 == 0 && i10 == 0 && i11 == 0 && i12 == 0) ? f2103e : new b(i9, i10, i11, i12);
    }

    public static b c(Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static b d(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public Insets e() {
        return a.a(this.f2104a, this.f2105b, this.f2106c, this.f2107d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f2107d == bVar.f2107d && this.f2104a == bVar.f2104a && this.f2106c == bVar.f2106c && this.f2105b == bVar.f2105b;
    }

    public int hashCode() {
        return (((((this.f2104a * 31) + this.f2105b) * 31) + this.f2106c) * 31) + this.f2107d;
    }

    public String toString() {
        return "Insets{left=" + this.f2104a + ", top=" + this.f2105b + ", right=" + this.f2106c + ", bottom=" + this.f2107d + '}';
    }
}
