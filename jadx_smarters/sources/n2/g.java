package n2;

import n2.f;

/* JADX INFO: loaded from: classes.dex */
public class g implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f.a f44897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f44898b;

    public g(f.a aVar) {
        this.f44897a = aVar;
    }

    @Override // n2.d
    public c a(boolean z9, boolean z10) {
        if (z9 || !z10) {
            return e.c();
        }
        if (this.f44898b == null) {
            this.f44898b = new f(this.f44897a);
        }
        return this.f44898b;
    }
}
