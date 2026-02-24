package l6;

import l6.C2199a;
import l6.C2201c;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static d f44222a = a().a();

    public static abstract class a {
        public abstract d a();

        public abstract a b(String str);

        public abstract a c(long j9);

        public abstract a d(String str);

        public abstract a e(String str);

        public abstract a f(String str);

        public abstract a g(C2201c.a aVar);

        public abstract a h(long j9);
    }

    public static a a() {
        return new C2199a.b().h(0L).g(C2201c.a.ATTEMPT_MIGRATION).c(0L);
    }

    public abstract String b();

    public abstract long c();

    public abstract String d();

    public abstract String e();

    public abstract String f();

    public abstract C2201c.a g();

    public abstract long h();

    public boolean i() {
        return g() == C2201c.a.REGISTER_ERROR;
    }

    public boolean j() {
        return g() == C2201c.a.NOT_GENERATED || g() == C2201c.a.ATTEMPT_MIGRATION;
    }

    public boolean k() {
        return g() == C2201c.a.REGISTERED;
    }

    public boolean l() {
        return g() == C2201c.a.UNREGISTERED;
    }

    public boolean m() {
        return g() == C2201c.a.ATTEMPT_MIGRATION;
    }

    public abstract a n();

    public d o(String str, long j9, long j10) {
        return n().b(str).c(j9).h(j10).a();
    }

    public d p() {
        return n().b(null).a();
    }

    public d q(String str) {
        return n().e(str).g(C2201c.a.REGISTER_ERROR).a();
    }

    public d r() {
        return n().g(C2201c.a.NOT_GENERATED).a();
    }

    public d s(String str, String str2, long j9, String str3, long j10) {
        return n().d(str).g(C2201c.a.REGISTERED).b(str3).f(str2).c(j10).h(j9).a();
    }

    public d t(String str) {
        return n().d(str).g(C2201c.a.UNREGISTERED).a();
    }
}
