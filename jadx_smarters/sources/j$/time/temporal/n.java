package j$.time.temporal;

import j$.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final t f42146a = new s(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final t f42147b = new s(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final t f42148c = new s(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final t f42149d = new s(3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final t f42150e = new s(4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final t f42151f = new s(5);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final t f42152g = new s(6);

    public static int a(o oVar, r rVar) {
        w wVarL = oVar.l(rVar);
        if (!wVarL.h()) {
            throw new v("Invalid field " + rVar + " for get() method, use getLong() instead");
        }
        long jQ = oVar.q(rVar);
        if (wVarL.i(jQ)) {
            return (int) jQ;
        }
        throw new j$.time.c("Invalid value for " + rVar + " (valid values " + wVarL + "): " + jQ);
    }

    public static m b(m mVar, long j9, u uVar) {
        long j10;
        if (j9 == Long.MIN_VALUE) {
            mVar = mVar.e(Long.MAX_VALUE, uVar);
            j10 = 1;
        } else {
            j10 = -j9;
        }
        return mVar.e(j10, uVar);
    }

    public static Object c(o oVar, t tVar) {
        if (tVar == f42146a || tVar == f42147b || tVar == f42148c) {
            return null;
        }
        return tVar.a(oVar);
    }

    public static w d(o oVar, r rVar) {
        if (!(rVar instanceof a)) {
            Objects.a(rVar, "field");
            return rVar.t(oVar);
        }
        if (oVar.f(rVar)) {
            return ((a) rVar).i();
        }
        throw new v(j$.time.d.a("Unsupported field: ", rVar));
    }

    public static t e() {
        return f42147b;
    }

    public static t f() {
        return f42151f;
    }

    public static t g() {
        return f42152g;
    }

    public static t h() {
        return f42149d;
    }

    public static t i() {
        return f42148c;
    }

    public static t j() {
        return f42150e;
    }

    public static t k() {
        return f42146a;
    }
}
