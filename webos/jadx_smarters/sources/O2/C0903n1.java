package O2;

import O2.InterfaceC0901n;
import android.os.Bundle;
import d4.AbstractC1684a;

/* JADX INFO: renamed from: O2.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0903n1 extends A1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f6134e = d4.k0.A0(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final InterfaceC0901n.a f6135f = new InterfaceC0901n.a() { // from class: O2.m1
        @Override // O2.InterfaceC0901n.a
        public final InterfaceC0901n a(Bundle bundle) {
            return C0903n1.d(bundle);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f6136d;

    public C0903n1() {
        this.f6136d = -1.0f;
    }

    public C0903n1(float f9) {
        AbstractC1684a.b(f9 >= 0.0f && f9 <= 100.0f, "percent must be in the range of [0, 100]");
        this.f6136d = f9;
    }

    public static C0903n1 d(Bundle bundle) {
        AbstractC1684a.a(bundle.getInt(A1.f5500a, -1) == 1);
        float f9 = bundle.getFloat(f6134e, -1.0f);
        return f9 == -1.0f ? new C0903n1() : new C0903n1(f9);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0903n1) && this.f6136d == ((C0903n1) obj).f6136d;
    }

    @Override // O2.InterfaceC0901n
    public Bundle h() {
        Bundle bundle = new Bundle();
        bundle.putInt(A1.f5500a, 1);
        bundle.putFloat(f6134e, this.f6136d);
        return bundle;
    }

    public int hashCode() {
        return r5.j.b(Float.valueOf(this.f6136d));
    }
}
