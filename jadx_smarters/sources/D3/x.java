package d3;

import Q2.AbstractC1016b;
import d3.w;
import d4.AbstractC1684a;

/* JADX INFO: loaded from: classes3.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f39616a = new byte[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f39617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f39619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f39620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f39621f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f39622g;

    public void a(w wVar, w.a aVar) {
        if (this.f39618c > 0) {
            wVar.f(this.f39619d, this.f39620e, this.f39621f, this.f39622g, aVar);
            this.f39618c = 0;
        }
    }

    public void b() {
        this.f39617b = false;
        this.f39618c = 0;
    }

    public void c(w wVar, long j9, int i9, int i10, int i11, w.a aVar) {
        AbstractC1684a.h(this.f39622g <= i10 + i11, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f39617b) {
            int i12 = this.f39618c;
            int i13 = i12 + 1;
            this.f39618c = i13;
            if (i12 == 0) {
                this.f39619d = j9;
                this.f39620e = i9;
                this.f39621f = 0;
            }
            this.f39621f += i10;
            this.f39622g = i11;
            if (i13 >= 16) {
                a(wVar, aVar);
            }
        }
    }

    public void d(InterfaceC1673j interfaceC1673j) {
        if (this.f39617b) {
            return;
        }
        interfaceC1673j.s(this.f39616a, 0, 10);
        interfaceC1673j.f();
        if (AbstractC1016b.j(this.f39616a) == 0) {
            return;
        }
        this.f39617b = true;
    }
}
