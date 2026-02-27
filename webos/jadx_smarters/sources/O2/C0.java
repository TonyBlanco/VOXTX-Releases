package O2;

import O2.InterfaceC0901n;
import android.os.Bundle;
import d4.AbstractC1684a;

/* JADX INFO: loaded from: classes3.dex */
public final class C0 extends A1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f5504f = d4.k0.A0(1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f5505g = d4.k0.A0(2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final InterfaceC0901n.a f5506h = new InterfaceC0901n.a() { // from class: O2.B0
        @Override // O2.InterfaceC0901n.a
        public final InterfaceC0901n a(Bundle bundle) {
            return C0.d(bundle);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f5507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f5508e;

    public C0() {
        this.f5507d = false;
        this.f5508e = false;
    }

    public C0(boolean z9) {
        this.f5507d = true;
        this.f5508e = z9;
    }

    public static C0 d(Bundle bundle) {
        AbstractC1684a.a(bundle.getInt(A1.f5500a, -1) == 0);
        return bundle.getBoolean(f5504f, false) ? new C0(bundle.getBoolean(f5505g, false)) : new C0();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0)) {
            return false;
        }
        C0 c02 = (C0) obj;
        return this.f5508e == c02.f5508e && this.f5507d == c02.f5507d;
    }

    @Override // O2.InterfaceC0901n
    public Bundle h() {
        Bundle bundle = new Bundle();
        bundle.putInt(A1.f5500a, 0);
        bundle.putBoolean(f5504f, this.f5507d);
        bundle.putBoolean(f5505g, this.f5508e);
        return bundle;
    }

    public int hashCode() {
        return r5.j.b(Boolean.valueOf(this.f5507d), Boolean.valueOf(this.f5508e));
    }
}
