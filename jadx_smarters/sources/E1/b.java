package E1;

import d.AbstractC1617D;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x1.d f1566a;

    public b(x1.d dVar) {
        this.f1566a = (x1.d) x1.g.c(dVar, "logger == null");
    }

    public void a(String str, Object... objArr) {
        e(3, str, null, objArr);
    }

    public void b(Throwable th, String str, Object... objArr) {
        e(3, str, th, objArr);
    }

    public void c(String str, Object... objArr) {
        e(6, str, null, objArr);
    }

    public void d(Throwable th, String str, Object... objArr) {
        e(6, str, th, objArr);
    }

    public final void e(int i9, String str, Throwable th, Object... objArr) {
        if (this.f1566a.f()) {
            AbstractC1617D.a(this.f1566a.e());
            x1.d.d(th);
            throw null;
        }
    }

    public void f(String str, Object... objArr) {
        e(5, str, null, objArr);
    }

    public void g(Throwable th, String str, Object... objArr) {
        e(5, str, th, objArr);
    }
}
