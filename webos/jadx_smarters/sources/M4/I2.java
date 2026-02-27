package M4;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class I2 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f4273A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f4274B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f4275C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public long f4276D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public String f4277E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f4278F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public long f4279G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public long f4280H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0776l2 f4281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f4283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f4284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f4285e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f4286f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f4287g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f4288h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f4289i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f4290j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f4291k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f4292l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f4293m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f4294n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f4295o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f4296p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f4297q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Boolean f4298r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f4299s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public List f4300t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f4301u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f4302v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f4303w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f4304x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f4305y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f4306z;

    public I2(C0776l2 c0776l2, String str) {
        com.google.android.gms.common.internal.r.m(c0776l2);
        com.google.android.gms.common.internal.r.g(str);
        this.f4281a = c0776l2;
        this.f4282b = str;
        c0776l2.f().h();
    }

    public final long A() {
        this.f4281a.f().h();
        return 0L;
    }

    public final void B(String str) {
        this.f4281a.f().h();
        this.f4278F |= !AbstractC0752h2.a(this.f4277E, str);
        this.f4277E = str;
    }

    public final void C(long j9) {
        this.f4281a.f().h();
        this.f4278F |= this.f4289i != j9;
        this.f4289i = j9;
    }

    public final void D(long j9) {
        com.google.android.gms.common.internal.r.a(j9 >= 0);
        this.f4281a.f().h();
        this.f4278F |= this.f4287g != j9;
        this.f4287g = j9;
    }

    public final void E(long j9) {
        this.f4281a.f().h();
        this.f4278F |= this.f4288h != j9;
        this.f4288h = j9;
    }

    public final void F(boolean z9) {
        this.f4281a.f().h();
        this.f4278F |= this.f4295o != z9;
        this.f4295o = z9;
    }

    public final void G(Boolean bool) {
        this.f4281a.f().h();
        this.f4278F |= !AbstractC0752h2.a(this.f4298r, bool);
        this.f4298r = bool;
    }

    public final void H(String str) {
        this.f4281a.f().h();
        this.f4278F |= !AbstractC0752h2.a(this.f4285e, str);
        this.f4285e = str;
    }

    public final void I(List list) {
        this.f4281a.f().h();
        if (AbstractC0752h2.a(this.f4300t, list)) {
            return;
        }
        this.f4278F = true;
        this.f4300t = list != null ? new ArrayList(list) : null;
    }

    public final void J(String str) {
        this.f4281a.f().h();
        this.f4278F |= !AbstractC0752h2.a(this.f4301u, str);
        this.f4301u = str;
    }

    public final void K(long j9) {
        this.f4281a.f().h();
        this.f4278F |= this.f4304x != j9;
        this.f4304x = j9;
    }

    public final void L(boolean z9) {
        this.f4281a.f().h();
        this.f4278F |= this.f4302v != z9;
        this.f4302v = z9;
    }

    public final void M(long j9) {
        this.f4281a.f().h();
        this.f4278F |= this.f4303w != j9;
        this.f4303w = j9;
    }

    public final boolean N() {
        this.f4281a.f().h();
        return this.f4296p;
    }

    public final boolean O() {
        this.f4281a.f().h();
        return this.f4295o;
    }

    public final boolean P() {
        this.f4281a.f().h();
        return this.f4278F;
    }

    public final boolean Q() {
        this.f4281a.f().h();
        return this.f4302v;
    }

    public final long R() {
        this.f4281a.f().h();
        return this.f4291k;
    }

    public final long S() {
        this.f4281a.f().h();
        return this.f4279G;
    }

    public final long T() {
        this.f4281a.f().h();
        return this.f4274B;
    }

    public final long U() {
        this.f4281a.f().h();
        return this.f4275C;
    }

    public final long V() {
        this.f4281a.f().h();
        return this.f4273A;
    }

    public final long W() {
        this.f4281a.f().h();
        return this.f4306z;
    }

    public final long X() {
        this.f4281a.f().h();
        return this.f4276D;
    }

    public final long Y() {
        this.f4281a.f().h();
        return this.f4305y;
    }

    public final long Z() {
        this.f4281a.f().h();
        return this.f4294n;
    }

    public final String a() {
        this.f4281a.f().h();
        return this.f4284d;
    }

    public final long a0() {
        this.f4281a.f().h();
        return this.f4299s;
    }

    public final String b() {
        this.f4281a.f().h();
        return this.f4277E;
    }

    public final long b0() {
        this.f4281a.f().h();
        return this.f4280H;
    }

    public final String c() {
        this.f4281a.f().h();
        return this.f4285e;
    }

    public final long c0() {
        this.f4281a.f().h();
        return this.f4293m;
    }

    public final String d() {
        this.f4281a.f().h();
        return this.f4301u;
    }

    public final long d0() {
        this.f4281a.f().h();
        return this.f4289i;
    }

    public final List e() {
        this.f4281a.f().h();
        return this.f4300t;
    }

    public final long e0() {
        this.f4281a.f().h();
        return this.f4287g;
    }

    public final void f() {
        this.f4281a.f().h();
        this.f4278F = false;
    }

    public final long f0() {
        this.f4281a.f().h();
        return this.f4288h;
    }

    public final void g() {
        this.f4281a.f().h();
        long j9 = this.f4287g + 1;
        if (j9 > 2147483647L) {
            this.f4281a.d().w().b("Bundle index overflow. appId", C0858z1.z(this.f4282b));
            j9 = 0;
        }
        this.f4278F = true;
        this.f4287g = j9;
    }

    public final long g0() {
        this.f4281a.f().h();
        return this.f4304x;
    }

    public final void h(String str) {
        this.f4281a.f().h();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f4278F |= true ^ AbstractC0752h2.a(this.f4297q, str);
        this.f4297q = str;
    }

    public final long h0() {
        this.f4281a.f().h();
        return this.f4303w;
    }

    public final void i(boolean z9) {
        this.f4281a.f().h();
        this.f4278F |= this.f4296p != z9;
        this.f4296p = z9;
    }

    public final Boolean i0() {
        this.f4281a.f().h();
        return this.f4298r;
    }

    public final void j(String str) {
        this.f4281a.f().h();
        this.f4278F |= !AbstractC0752h2.a(this.f4283c, str);
        this.f4283c = str;
    }

    public final String j0() {
        this.f4281a.f().h();
        return this.f4297q;
    }

    public final void k(String str) {
        this.f4281a.f().h();
        this.f4278F |= !AbstractC0752h2.a(this.f4292l, str);
        this.f4292l = str;
    }

    public final String k0() {
        this.f4281a.f().h();
        String str = this.f4277E;
        B(null);
        return str;
    }

    public final void l(String str) {
        this.f4281a.f().h();
        this.f4278F |= !AbstractC0752h2.a(this.f4290j, str);
        this.f4290j = str;
    }

    public final String l0() {
        this.f4281a.f().h();
        return this.f4282b;
    }

    public final void m(long j9) {
        this.f4281a.f().h();
        this.f4278F |= this.f4291k != j9;
        this.f4291k = j9;
    }

    public final String m0() {
        this.f4281a.f().h();
        return this.f4283c;
    }

    public final void n(long j9) {
        this.f4281a.f().h();
        this.f4278F |= this.f4279G != j9;
        this.f4279G = j9;
    }

    public final String n0() {
        this.f4281a.f().h();
        return this.f4292l;
    }

    public final void o(long j9) {
        this.f4281a.f().h();
        this.f4278F |= this.f4274B != j9;
        this.f4274B = j9;
    }

    public final String o0() {
        this.f4281a.f().h();
        return this.f4290j;
    }

    public final void p(long j9) {
        this.f4281a.f().h();
        this.f4278F |= this.f4275C != j9;
        this.f4275C = j9;
    }

    public final String p0() {
        this.f4281a.f().h();
        return this.f4286f;
    }

    public final void q(long j9) {
        this.f4281a.f().h();
        this.f4278F |= this.f4273A != j9;
        this.f4273A = j9;
    }

    public final void r(long j9) {
        this.f4281a.f().h();
        this.f4278F |= this.f4306z != j9;
        this.f4306z = j9;
    }

    public final void s(long j9) {
        this.f4281a.f().h();
        this.f4278F |= this.f4276D != j9;
        this.f4276D = j9;
    }

    public final void t(long j9) {
        this.f4281a.f().h();
        this.f4278F |= this.f4305y != j9;
        this.f4305y = j9;
    }

    public final void u(long j9) {
        this.f4281a.f().h();
        this.f4278F |= this.f4294n != j9;
        this.f4294n = j9;
    }

    public final void v(long j9) {
        this.f4281a.f().h();
        this.f4278F |= this.f4299s != j9;
        this.f4299s = j9;
    }

    public final void w(long j9) {
        this.f4281a.f().h();
        this.f4278F |= this.f4280H != j9;
        this.f4280H = j9;
    }

    public final void x(String str) {
        this.f4281a.f().h();
        this.f4278F |= !AbstractC0752h2.a(this.f4286f, str);
        this.f4286f = str;
    }

    public final void y(String str) {
        this.f4281a.f().h();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f4278F |= true ^ AbstractC0752h2.a(this.f4284d, str);
        this.f4284d = str;
    }

    public final void z(long j9) {
        this.f4281a.f().h();
        this.f4278F |= this.f4293m != j9;
        this.f4293m = j9;
    }
}
