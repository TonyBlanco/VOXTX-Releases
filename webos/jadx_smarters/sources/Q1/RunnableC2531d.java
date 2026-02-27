package q1;

import k1.C2132a;
import k1.C2133b;
import l1.C2173b;
import m1.C2219a;
import okhttp3.Response;
import s1.AbstractC2704b;
import s1.AbstractC2705c;

/* JADX INFO: renamed from: q1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC2531d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k1.e f46781a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f46782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2132a f46783d;

    /* JADX INFO: renamed from: q1.d$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C2132a f46784a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C2219a f46785c;

        public a(C2132a c2132a, C2219a c2219a) {
            this.f46784a = c2132a;
            this.f46785c = c2219a;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f46784a.g(this.f46785c);
            this.f46784a.m();
        }
    }

    public RunnableC2531d(C2132a c2132a) {
        this.f46783d = c2132a;
        this.f46782c = c2132a.C();
        this.f46781a = c2132a.y();
    }

    public final void a(C2132a c2132a, C2219a c2219a) {
        C2173b.b().a().a().execute(new a(c2132a, c2219a));
    }

    public final void b() {
        try {
            Response responseD = AbstractC2530c.d(this.f46783d);
            if (responseD == null) {
                a(this.f46783d, AbstractC2705c.d(new C2219a()));
            } else if (responseD.code() >= 400) {
                a(this.f46783d, AbstractC2705c.f(new C2219a(responseD), this.f46783d, responseD.code()));
            } else {
                this.f46783d.N();
            }
        } catch (Exception e9) {
            a(this.f46783d, AbstractC2705c.d(new C2219a(e9)));
        }
    }

    public final void c() {
        C2132a c2132a;
        C2219a c2219aF;
        Response responseE = null;
        try {
            try {
                responseE = AbstractC2530c.e(this.f46783d);
            } catch (Exception e9) {
                a(this.f46783d, AbstractC2705c.d(new C2219a(e9)));
            }
            if (responseE != null) {
                if (this.f46783d.B() == k1.f.OK_HTTP_RESPONSE) {
                    this.f46783d.i(responseE);
                } else if (responseE.code() >= 400) {
                    c2132a = this.f46783d;
                    c2219aF = AbstractC2705c.f(new C2219a(responseE), this.f46783d, responseE.code());
                } else {
                    C2133b c2133bH = this.f46783d.H(responseE);
                    if (c2133bH.d()) {
                        c2133bH.e(responseE);
                        this.f46783d.j(c2133bH);
                        return;
                    }
                    a(this.f46783d, c2133bH.b());
                }
            }
            c2132a = this.f46783d;
            c2219aF = AbstractC2705c.d(new C2219a());
            a(c2132a, c2219aF);
        } finally {
            AbstractC2704b.a(null, this.f46783d);
        }
    }

    public final void d() {
        C2132a c2132a;
        C2219a c2219aF;
        Response responseF = null;
        try {
            try {
                responseF = AbstractC2530c.f(this.f46783d);
            } catch (Exception e9) {
                a(this.f46783d, AbstractC2705c.d(new C2219a(e9)));
            }
            if (responseF != null) {
                if (this.f46783d.B() == k1.f.OK_HTTP_RESPONSE) {
                    this.f46783d.i(responseF);
                } else if (responseF.code() >= 400) {
                    c2132a = this.f46783d;
                    c2219aF = AbstractC2705c.f(new C2219a(responseF), this.f46783d, responseF.code());
                } else {
                    C2133b c2133bH = this.f46783d.H(responseF);
                    if (c2133bH.d()) {
                        c2133bH.e(responseF);
                        this.f46783d.j(c2133bH);
                        return;
                    }
                    a(this.f46783d, c2133bH.b());
                }
            }
            c2132a = this.f46783d;
            c2219aF = AbstractC2705c.d(new C2219a());
            a(c2132a, c2219aF);
        } finally {
            AbstractC2704b.a(null, this.f46783d);
        }
    }

    public k1.e e() {
        return this.f46781a;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f46783d.K(true);
        int iA = this.f46783d.A();
        if (iA == 0) {
            c();
        } else if (iA == 1) {
            b();
        } else if (iA == 2) {
            d();
        }
        this.f46783d.K(false);
    }
}
