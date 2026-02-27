package I8;

import G8.AbstractC0589p;
import G8.P;
import kotlinx.coroutines.internal.m;
import kotlinx.coroutines.internal.y;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends r implements p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f2989e;

    public i(Throwable th) {
        this.f2989e = th;
    }

    @Override // I8.r
    public y B(m.b bVar) {
        return AbstractC0589p.f2355a;
    }

    @Override // I8.p
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public i a() {
        return this;
    }

    @Override // I8.r
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public i A() {
        return this;
    }

    public final Throwable F() {
        Throwable th = this.f2989e;
        return th == null ? new j("Channel was closed") : th;
    }

    public final Throwable G() {
        Throwable th = this.f2989e;
        return th == null ? new k("Channel was closed") : th;
    }

    @Override // I8.p
    public void d(Object obj) {
    }

    @Override // I8.p
    public y f(Object obj, m.b bVar) {
        return AbstractC0589p.f2355a;
    }

    @Override // kotlinx.coroutines.internal.m
    public String toString() {
        return "Closed@" + P.b(this) + '[' + this.f2989e + ']';
    }

    @Override // I8.r
    public void z() {
    }
}
