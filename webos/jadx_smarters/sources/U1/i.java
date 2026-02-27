package U1;

import android.util.Log;
import m2.InterfaceC2224e;

/* JADX INFO: loaded from: classes.dex */
public class i implements Runnable, X1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O1.i f9663a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f9664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final U1.a f9665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f9666e = b.CACHE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f9667f;

    public interface a extends InterfaceC2224e {
        void c(i iVar);
    }

    public enum b {
        CACHE,
        SOURCE
    }

    public i(a aVar, U1.a aVar2, O1.i iVar) {
        this.f9664c = aVar;
        this.f9665d = aVar2;
        this.f9663a = iVar;
    }

    @Override // X1.b
    public int a() {
        return this.f9663a.ordinal();
    }

    public void b() {
        this.f9667f = true;
        this.f9665d.c();
    }

    public final l c() {
        return f() ? d() : e();
    }

    public final l d() {
        l lVarF;
        try {
            lVarF = this.f9665d.f();
        } catch (Exception e9) {
            if (Log.isLoggable("EngineRunnable", 3)) {
                Log.d("EngineRunnable", "Exception decoding result from cache: " + e9);
            }
            lVarF = null;
        }
        return lVarF == null ? this.f9665d.h() : lVarF;
    }

    public final l e() {
        return this.f9665d.d();
    }

    public final boolean f() {
        return this.f9666e == b.CACHE;
    }

    public final void g(l lVar) {
        this.f9664c.f(lVar);
    }

    public final void h(Exception exc) {
        if (!f()) {
            this.f9664c.a(exc);
        } else {
            this.f9666e = b.SOURCE;
            this.f9664c.c(this);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        Exception jVar;
        if (this.f9667f) {
            return;
        }
        l lVarC = null;
        try {
            lVarC = c();
            jVar = null;
        } catch (Exception e9) {
            if (Log.isLoggable("EngineRunnable", 2)) {
                Log.v("EngineRunnable", "Exception decoding", e9);
            }
            jVar = e9;
        } catch (OutOfMemoryError e10) {
            if (Log.isLoggable("EngineRunnable", 2)) {
                Log.v("EngineRunnable", "Out Of Memory Error decoding", e10);
            }
            jVar = new j(e10);
        }
        if (this.f9667f) {
            if (lVarC != null) {
                lVarC.b();
            }
        } else if (lVarC == null) {
            h(jVar);
        } else {
            g(lVarC);
        }
    }
}
