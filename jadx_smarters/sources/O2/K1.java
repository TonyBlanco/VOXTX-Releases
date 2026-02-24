package O2;

import O2.InterfaceC0901n;
import android.os.Bundle;
import d4.AbstractC1684a;

/* JADX INFO: loaded from: classes3.dex */
public final class K1 extends A1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f5680f = d4.k0.A0(1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f5681g = d4.k0.A0(2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final InterfaceC0901n.a f5682h = new InterfaceC0901n.a() { // from class: O2.J1
        @Override // O2.InterfaceC0901n.a
        public final InterfaceC0901n a(Bundle bundle) {
            return K1.d(bundle);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f5684e;

    public K1(int i9) {
        AbstractC1684a.b(i9 > 0, "maxStars must be a positive integer");
        this.f5683d = i9;
        this.f5684e = -1.0f;
    }

    public K1(int i9, float f9) {
        boolean z9 = false;
        AbstractC1684a.b(i9 > 0, "maxStars must be a positive integer");
        if (f9 >= 0.0f && f9 <= i9) {
            z9 = true;
        }
        AbstractC1684a.b(z9, "starRating is out of range [0, maxStars]");
        this.f5683d = i9;
        this.f5684e = f9;
    }

    public static K1 d(Bundle bundle) {
        AbstractC1684a.a(bundle.getInt(A1.f5500a, -1) == 2);
        int i9 = bundle.getInt(f5680f, 5);
        float f9 = bundle.getFloat(f5681g, -1.0f);
        return f9 == -1.0f ? new K1(i9) : new K1(i9, f9);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof K1)) {
            return false;
        }
        K1 k12 = (K1) obj;
        return this.f5683d == k12.f5683d && this.f5684e == k12.f5684e;
    }

    @Override // O2.InterfaceC0901n
    public Bundle h() {
        Bundle bundle = new Bundle();
        bundle.putInt(A1.f5500a, 2);
        bundle.putInt(f5680f, this.f5683d);
        bundle.putFloat(f5681g, this.f5684e);
        return bundle;
    }

    public int hashCode() {
        return r5.j.b(Integer.valueOf(this.f5683d), Float.valueOf(this.f5684e));
    }
}
