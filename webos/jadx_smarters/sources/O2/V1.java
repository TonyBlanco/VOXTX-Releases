package O2;

import O2.InterfaceC0901n;
import O2.V1;
import android.os.Bundle;
import d4.AbstractC1684a;
import d4.AbstractC1687d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import r5.AbstractC2679h;
import s5.AbstractC2743y;
import w5.AbstractC2929a;

/* JADX INFO: loaded from: classes3.dex */
public final class V1 implements InterfaceC0901n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final V1 f5907c = new V1(AbstractC2743y.z());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f5908d = d4.k0.A0(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final InterfaceC0901n.a f5909e = new InterfaceC0901n.a() { // from class: O2.T1
        @Override // O2.InterfaceC0901n.a
        public final InterfaceC0901n a(Bundle bundle) {
            return V1.i(bundle);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC2743y f5910a;

    public static final class a implements InterfaceC0901n {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f5911g = d4.k0.A0(0);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f5912h = d4.k0.A0(1);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f5913i = d4.k0.A0(3);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f5914j = d4.k0.A0(4);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final InterfaceC0901n.a f5915k = new InterfaceC0901n.a() { // from class: O2.U1
            @Override // O2.InterfaceC0901n.a
            public final InterfaceC0901n a(Bundle bundle) {
                return V1.a.m(bundle);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5916a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final B3.g0 f5917c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f5918d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f5919e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean[] f5920f;

        public a(B3.g0 g0Var, boolean z9, int[] iArr, boolean[] zArr) {
            int i9 = g0Var.f581a;
            this.f5916a = i9;
            boolean z10 = false;
            AbstractC1684a.a(i9 == iArr.length && i9 == zArr.length);
            this.f5917c = g0Var;
            if (z9 && i9 > 1) {
                z10 = true;
            }
            this.f5918d = z10;
            this.f5919e = (int[]) iArr.clone();
            this.f5920f = (boolean[]) zArr.clone();
        }

        public static /* synthetic */ a m(Bundle bundle) {
            B3.g0 g0Var = (B3.g0) B3.g0.f580i.a((Bundle) AbstractC1684a.e(bundle.getBundle(f5911g)));
            return new a(g0Var, bundle.getBoolean(f5914j, false), (int[]) AbstractC2679h.a(bundle.getIntArray(f5912h), new int[g0Var.f581a]), (boolean[]) AbstractC2679h.a(bundle.getBooleanArray(f5913i), new boolean[g0Var.f581a]));
        }

        public B3.g0 b() {
            return this.f5917c;
        }

        public C0936z0 c(int i9) {
            return this.f5917c.c(i9);
        }

        public int d(int i9) {
            return this.f5919e[i9];
        }

        public int e() {
            return this.f5917c.f583d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f5918d == aVar.f5918d && this.f5917c.equals(aVar.f5917c) && Arrays.equals(this.f5919e, aVar.f5919e) && Arrays.equals(this.f5920f, aVar.f5920f);
        }

        public boolean f() {
            return this.f5918d;
        }

        public boolean g() {
            return AbstractC2929a.b(this.f5920f, true);
        }

        @Override // O2.InterfaceC0901n
        public Bundle h() {
            Bundle bundle = new Bundle();
            bundle.putBundle(f5911g, this.f5917c.h());
            bundle.putIntArray(f5912h, this.f5919e);
            bundle.putBooleanArray(f5913i, this.f5920f);
            bundle.putBoolean(f5914j, this.f5918d);
            return bundle;
        }

        public int hashCode() {
            return (((((this.f5917c.hashCode() * 31) + (this.f5918d ? 1 : 0)) * 31) + Arrays.hashCode(this.f5919e)) * 31) + Arrays.hashCode(this.f5920f);
        }

        public boolean i(boolean z9) {
            for (int i9 = 0; i9 < this.f5919e.length; i9++) {
                if (l(i9, z9)) {
                    return true;
                }
            }
            return false;
        }

        public boolean j(int i9) {
            return this.f5920f[i9];
        }

        public boolean k(int i9) {
            return l(i9, false);
        }

        public boolean l(int i9, boolean z9) {
            int i10 = this.f5919e[i9];
            return i10 == 4 || (z9 && i10 == 3);
        }
    }

    public V1(List list) {
        this.f5910a = AbstractC2743y.r(list);
    }

    public static /* synthetic */ V1 i(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f5908d);
        return new V1(parcelableArrayList == null ? AbstractC2743y.z() : AbstractC1687d.d(a.f5915k, parcelableArrayList));
    }

    public boolean b(int i9) {
        for (int i10 = 0; i10 < this.f5910a.size(); i10++) {
            if (((a) this.f5910a.get(i10)).e() == i9) {
                return true;
            }
        }
        return false;
    }

    public AbstractC2743y c() {
        return this.f5910a;
    }

    public boolean d() {
        return this.f5910a.isEmpty();
    }

    public boolean e(int i9) {
        for (int i10 = 0; i10 < this.f5910a.size(); i10++) {
            a aVar = (a) this.f5910a.get(i10);
            if (aVar.g() && aVar.e() == i9) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || V1.class != obj.getClass()) {
            return false;
        }
        return this.f5910a.equals(((V1) obj).f5910a);
    }

    public boolean f(int i9) {
        return g(i9, false);
    }

    public boolean g(int i9, boolean z9) {
        for (int i10 = 0; i10 < this.f5910a.size(); i10++) {
            if (((a) this.f5910a.get(i10)).e() == i9 && ((a) this.f5910a.get(i10)).i(z9)) {
                return true;
            }
        }
        return false;
    }

    @Override // O2.InterfaceC0901n
    public Bundle h() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(f5908d, AbstractC1687d.i(this.f5910a));
        return bundle;
    }

    public int hashCode() {
        return this.f5910a.hashCode();
    }
}
