package kotlinx.coroutines.internal;

import G8.T0;

/* JADX INFO: loaded from: classes4.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o8.g f43738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f43739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T0[] f43740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f43741d;

    public F(o8.g gVar, int i9) {
        this.f43738a = gVar;
        this.f43739b = new Object[i9];
        this.f43740c = new T0[i9];
    }

    public final void a(T0 t02, Object obj) {
        Object[] objArr = this.f43739b;
        int i9 = this.f43741d;
        objArr[i9] = obj;
        T0[] t0Arr = this.f43740c;
        this.f43741d = i9 + 1;
        t0Arr[i9] = t02;
    }

    public final void b(o8.g gVar) {
        int length = this.f43740c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i9 = length - 1;
            T0 t02 = this.f43740c[length];
            kotlin.jvm.internal.l.b(t02);
            t02.b0(gVar, this.f43739b[length]);
            if (i9 < 0) {
                return;
            } else {
                length = i9;
            }
        }
    }
}
