package F0;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1180j;
import androidx.savedstate.Recreator;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f1806d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f1807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f1808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1809c;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final d a(e owner) {
            l.e(owner, "owner");
            return new d(owner, null);
        }
    }

    public d(e eVar) {
        this.f1807a = eVar;
        this.f1808b = new c();
    }

    public /* synthetic */ d(e eVar, g gVar) {
        this(eVar);
    }

    public static final d a(e eVar) {
        return f1806d.a(eVar);
    }

    public final c b() {
        return this.f1808b;
    }

    public final void c() {
        AbstractC1180j lifecycle = this.f1807a.getLifecycle();
        l.d(lifecycle, "owner.lifecycle");
        if (lifecycle.b() != AbstractC1180j.c.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        lifecycle.a(new Recreator(this.f1807a));
        this.f1808b.e(lifecycle);
        this.f1809c = true;
    }

    public final void d(Bundle bundle) {
        if (!this.f1809c) {
            c();
        }
        AbstractC1180j lifecycle = this.f1807a.getLifecycle();
        l.d(lifecycle, "owner.lifecycle");
        if (!lifecycle.b().isAtLeast(AbstractC1180j.c.STARTED)) {
            this.f1808b.f(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.b()).toString());
    }

    public final void e(Bundle outBundle) {
        l.e(outBundle, "outBundle");
        this.f1808b.g(outBundle);
    }
}
