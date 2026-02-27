package b4;

import b4.InterfaceC1211b;
import d4.AbstractC1684a;
import d4.k0;
import java.util.Arrays;

/* JADX INFO: renamed from: b4.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1228t implements InterfaceC1211b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f17621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17623e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f17624f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C1210a[] f17625g;

    public C1228t(boolean z9, int i9) {
        this(z9, i9, 0);
    }

    public C1228t(boolean z9, int i9, int i10) {
        AbstractC1684a.a(i9 > 0);
        AbstractC1684a.a(i10 >= 0);
        this.f17619a = z9;
        this.f17620b = i9;
        this.f17624f = i10;
        this.f17625g = new C1210a[i10 + 100];
        if (i10 <= 0) {
            this.f17621c = null;
            return;
        }
        this.f17621c = new byte[i10 * i9];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f17625g[i11] = new C1210a(this.f17621c, i11 * i9);
        }
    }

    @Override // b4.InterfaceC1211b
    public synchronized void a(C1210a c1210a) {
        C1210a[] c1210aArr = this.f17625g;
        int i9 = this.f17624f;
        this.f17624f = i9 + 1;
        c1210aArr[i9] = c1210a;
        this.f17623e--;
        notifyAll();
    }

    @Override // b4.InterfaceC1211b
    public synchronized C1210a b() {
        C1210a c1210a;
        try {
            this.f17623e++;
            int i9 = this.f17624f;
            if (i9 > 0) {
                C1210a[] c1210aArr = this.f17625g;
                int i10 = i9 - 1;
                this.f17624f = i10;
                c1210a = (C1210a) AbstractC1684a.e(c1210aArr[i10]);
                this.f17625g[this.f17624f] = null;
            } else {
                c1210a = new C1210a(new byte[this.f17620b], 0);
                int i11 = this.f17623e;
                C1210a[] c1210aArr2 = this.f17625g;
                if (i11 > c1210aArr2.length) {
                    this.f17625g = (C1210a[]) Arrays.copyOf(c1210aArr2, c1210aArr2.length * 2);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return c1210a;
    }

    @Override // b4.InterfaceC1211b
    public synchronized void c(InterfaceC1211b.a aVar) {
        while (aVar != null) {
            try {
                C1210a[] c1210aArr = this.f17625g;
                int i9 = this.f17624f;
                this.f17624f = i9 + 1;
                c1210aArr[i9] = aVar.a();
                this.f17623e--;
                aVar = aVar.next();
            } catch (Throwable th) {
                throw th;
            }
        }
        notifyAll();
    }

    @Override // b4.InterfaceC1211b
    public synchronized void d() {
        try {
            int i9 = 0;
            int iMax = Math.max(0, k0.l(this.f17622d, this.f17620b) - this.f17623e);
            int i10 = this.f17624f;
            if (iMax >= i10) {
                return;
            }
            if (this.f17621c != null) {
                int i11 = i10 - 1;
                while (i9 <= i11) {
                    C1210a c1210a = (C1210a) AbstractC1684a.e(this.f17625g[i9]);
                    if (c1210a.f17562a == this.f17621c) {
                        i9++;
                    } else {
                        C1210a c1210a2 = (C1210a) AbstractC1684a.e(this.f17625g[i11]);
                        if (c1210a2.f17562a != this.f17621c) {
                            i11--;
                        } else {
                            C1210a[] c1210aArr = this.f17625g;
                            c1210aArr[i9] = c1210a2;
                            c1210aArr[i11] = c1210a;
                            i11--;
                            i9++;
                        }
                    }
                }
                iMax = Math.max(iMax, i9);
                if (iMax >= this.f17624f) {
                    return;
                }
            }
            Arrays.fill(this.f17625g, iMax, this.f17624f, (Object) null);
            this.f17624f = iMax;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // b4.InterfaceC1211b
    public int e() {
        return this.f17620b;
    }

    public synchronized int f() {
        return this.f17623e * this.f17620b;
    }

    public synchronized void g() {
        if (this.f17619a) {
            h(0);
        }
    }

    public synchronized void h(int i9) {
        boolean z9 = i9 < this.f17622d;
        this.f17622d = i9;
        if (z9) {
            d();
        }
    }
}
