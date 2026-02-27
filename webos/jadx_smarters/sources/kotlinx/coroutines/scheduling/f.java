package kotlinx.coroutines.scheduling;

import G8.AbstractC0586n0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f extends AbstractC0586n0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f43812e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f43813f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f43814g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f43815h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f43816i = f0();

    public f(int i9, int i10, long j9, String str) {
        this.f43812e = i9;
        this.f43813f = i10;
        this.f43814g = j9;
        this.f43815h = str;
    }

    @Override // G8.H
    public void c0(o8.g gVar, Runnable runnable) {
        a.h(this.f43816i, runnable, null, false, 6, null);
    }

    public final a f0() {
        return new a(this.f43812e, this.f43813f, this.f43814g, this.f43815h);
    }

    public final void g0(Runnable runnable, i iVar, boolean z9) {
        this.f43816i.g(runnable, iVar, z9);
    }
}
