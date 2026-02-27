package e4;

import O2.InterfaceC0901n;
import android.os.Bundle;
import d4.k0;

/* JADX INFO: renamed from: e4.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1737C implements InterfaceC0901n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C1737C f40172f = new C1737C(0, 0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f40173g = k0.A0(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f40174h = k0.A0(1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f40175i = k0.A0(2);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f40176j = k0.A0(3);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final InterfaceC0901n.a f40177k = new InterfaceC0901n.a() { // from class: e4.B
        @Override // O2.InterfaceC0901n.a
        public final InterfaceC0901n a(Bundle bundle) {
            return C1737C.b(bundle);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40178a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f40179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f40180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f40181e;

    public C1737C(int i9, int i10) {
        this(i9, i10, 0, 1.0f);
    }

    public C1737C(int i9, int i10, int i11, float f9) {
        this.f40178a = i9;
        this.f40179c = i10;
        this.f40180d = i11;
        this.f40181e = f9;
    }

    public static /* synthetic */ C1737C b(Bundle bundle) {
        return new C1737C(bundle.getInt(f40173g, 0), bundle.getInt(f40174h, 0), bundle.getInt(f40175i, 0), bundle.getFloat(f40176j, 1.0f));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1737C)) {
            return false;
        }
        C1737C c1737c = (C1737C) obj;
        return this.f40178a == c1737c.f40178a && this.f40179c == c1737c.f40179c && this.f40180d == c1737c.f40180d && this.f40181e == c1737c.f40181e;
    }

    @Override // O2.InterfaceC0901n
    public Bundle h() {
        Bundle bundle = new Bundle();
        bundle.putInt(f40173g, this.f40178a);
        bundle.putInt(f40174h, this.f40179c);
        bundle.putInt(f40175i, this.f40180d);
        bundle.putFloat(f40176j, this.f40181e);
        return bundle;
    }

    public int hashCode() {
        return ((((((217 + this.f40178a) * 31) + this.f40179c) * 31) + this.f40180d) * 31) + Float.floatToRawIntBits(this.f40181e);
    }
}
