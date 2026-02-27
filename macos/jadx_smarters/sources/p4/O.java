package p4;

import java.util.HashSet;
import java.util.Set;
import p4.C2434i;

/* JADX INFO: loaded from: classes3.dex */
public final class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f46412a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f46413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f46414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f46415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2434i f46416e;

    public O(C2434i c2434i, long j9) {
        this.f46416e = c2434i;
        this.f46413b = j9;
        this.f46414c = new N(this, c2434i);
    }

    public final long b() {
        return this.f46413b;
    }

    public final void d(C2434i.e eVar) {
        this.f46412a.add(eVar);
    }

    public final void e(C2434i.e eVar) {
        this.f46412a.remove(eVar);
    }

    public final void f() {
        this.f46416e.f46519b.removeCallbacks(this.f46414c);
        this.f46415d = true;
        this.f46416e.f46519b.postDelayed(this.f46414c, this.f46413b);
    }

    public final void g() {
        this.f46416e.f46519b.removeCallbacks(this.f46414c);
        this.f46415d = false;
    }

    public final boolean h() {
        return !this.f46412a.isEmpty();
    }

    public final boolean i() {
        return this.f46415d;
    }
}
