package O2;

import O2.InterfaceC0901n;
import android.os.Bundle;
import d4.AbstractC1684a;

/* JADX INFO: renamed from: O2.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0921u implements InterfaceC0901n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0921u f6260f = new b(0).e();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f6261g = d4.k0.A0(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f6262h = d4.k0.A0(1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f6263i = d4.k0.A0(2);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f6264j = d4.k0.A0(3);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final InterfaceC0901n.a f6265k = new InterfaceC0901n.a() { // from class: O2.t
        @Override // O2.InterfaceC0901n.a
        public final InterfaceC0901n a(Bundle bundle) {
            return C0921u.b(bundle);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6266a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f6269e;

    /* JADX INFO: renamed from: O2.u$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6270a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f6271b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f6272c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f6273d;

        public b(int i9) {
            this.f6270a = i9;
        }

        public C0921u e() {
            AbstractC1684a.a(this.f6271b <= this.f6272c);
            return new C0921u(this);
        }

        public b f(int i9) {
            this.f6272c = i9;
            return this;
        }

        public b g(int i9) {
            this.f6271b = i9;
            return this;
        }

        public b h(String str) {
            AbstractC1684a.a(this.f6270a != 0 || str == null);
            this.f6273d = str;
            return this;
        }
    }

    public C0921u(b bVar) {
        this.f6266a = bVar.f6270a;
        this.f6267c = bVar.f6271b;
        this.f6268d = bVar.f6272c;
        this.f6269e = bVar.f6273d;
    }

    public static /* synthetic */ C0921u b(Bundle bundle) {
        int i9 = bundle.getInt(f6261g, 0);
        int i10 = bundle.getInt(f6262h, 0);
        int i11 = bundle.getInt(f6263i, 0);
        return new b(i9).g(i10).f(i11).h(bundle.getString(f6264j)).e();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0921u)) {
            return false;
        }
        C0921u c0921u = (C0921u) obj;
        return this.f6266a == c0921u.f6266a && this.f6267c == c0921u.f6267c && this.f6268d == c0921u.f6268d && d4.k0.c(this.f6269e, c0921u.f6269e);
    }

    @Override // O2.InterfaceC0901n
    public Bundle h() {
        Bundle bundle = new Bundle();
        int i9 = this.f6266a;
        if (i9 != 0) {
            bundle.putInt(f6261g, i9);
        }
        int i10 = this.f6267c;
        if (i10 != 0) {
            bundle.putInt(f6262h, i10);
        }
        int i11 = this.f6268d;
        if (i11 != 0) {
            bundle.putInt(f6263i, i11);
        }
        String str = this.f6269e;
        if (str != null) {
            bundle.putString(f6264j, str);
        }
        return bundle;
    }

    public int hashCode() {
        int i9 = (((((527 + this.f6266a) * 31) + this.f6267c) * 31) + this.f6268d) * 31;
        String str = this.f6269e;
        return i9 + (str == null ? 0 : str.hashCode());
    }
}
