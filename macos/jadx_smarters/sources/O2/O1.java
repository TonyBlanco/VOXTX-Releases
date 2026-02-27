package O2;

import O2.InterfaceC0901n;
import android.os.Bundle;
import d4.AbstractC1684a;

/* JADX INFO: loaded from: classes3.dex */
public final class O1 extends A1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f5699f = d4.k0.A0(1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f5700g = d4.k0.A0(2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final InterfaceC0901n.a f5701h = new InterfaceC0901n.a() { // from class: O2.N1
        @Override // O2.InterfaceC0901n.a
        public final InterfaceC0901n a(Bundle bundle) {
            return O1.d(bundle);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f5702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f5703e;

    public O1() {
        this.f5702d = false;
        this.f5703e = false;
    }

    public O1(boolean z9) {
        this.f5702d = true;
        this.f5703e = z9;
    }

    public static O1 d(Bundle bundle) {
        AbstractC1684a.a(bundle.getInt(A1.f5500a, -1) == 3);
        return bundle.getBoolean(f5699f, false) ? new O1(bundle.getBoolean(f5700g, false)) : new O1();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof O1)) {
            return false;
        }
        O1 o12 = (O1) obj;
        return this.f5703e == o12.f5703e && this.f5702d == o12.f5702d;
    }

    @Override // O2.InterfaceC0901n
    public Bundle h() {
        Bundle bundle = new Bundle();
        bundle.putInt(A1.f5500a, 3);
        bundle.putBoolean(f5699f, this.f5702d);
        bundle.putBoolean(f5700g, this.f5703e);
        return bundle;
    }

    public int hashCode() {
        return r5.j.b(Boolean.valueOf(this.f5702d), Boolean.valueOf(this.f5703e));
    }
}
