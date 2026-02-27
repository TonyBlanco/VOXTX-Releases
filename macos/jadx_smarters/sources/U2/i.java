package U2;

import d4.AbstractC1684a;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Thread f9712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f9713b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque f9714c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque f9715d = new ArrayDeque();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g[] f9716e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.google.android.exoplayer2.decoder.a[] f9717f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9718g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f9719h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g f9720i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f f9721j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f9722k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f9723l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f9724m;

    public class a extends Thread {
        public a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            i.this.t();
        }
    }

    public i(g[] gVarArr, com.google.android.exoplayer2.decoder.a[] aVarArr) {
        this.f9716e = gVarArr;
        this.f9718g = gVarArr.length;
        for (int i9 = 0; i9 < this.f9718g; i9++) {
            this.f9716e[i9] = g();
        }
        this.f9717f = aVarArr;
        this.f9719h = aVarArr.length;
        for (int i10 = 0; i10 < this.f9719h; i10++) {
            this.f9717f[i10] = h();
        }
        a aVar = new a("ExoPlayer:SimpleDecoder");
        this.f9712a = aVar;
        aVar.start();
    }

    public final boolean f() {
        return !this.f9714c.isEmpty() && this.f9719h > 0;
    }

    @Override // U2.d
    public final void flush() {
        synchronized (this.f9713b) {
            try {
                this.f9722k = true;
                this.f9724m = 0;
                g gVar = this.f9720i;
                if (gVar != null) {
                    q(gVar);
                    this.f9720i = null;
                }
                while (!this.f9714c.isEmpty()) {
                    q((g) this.f9714c.removeFirst());
                }
                while (!this.f9715d.isEmpty()) {
                    ((com.google.android.exoplayer2.decoder.a) this.f9715d.removeFirst()).release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract g g();

    public abstract com.google.android.exoplayer2.decoder.a h();

    public abstract f i(Throwable th);

    public abstract f j(g gVar, com.google.android.exoplayer2.decoder.a aVar, boolean z9);

    public final boolean k() {
        f fVarI;
        synchronized (this.f9713b) {
            while (!this.f9723l && !f()) {
                try {
                    this.f9713b.wait();
                } finally {
                }
            }
            if (this.f9723l) {
                return false;
            }
            g gVar = (g) this.f9714c.removeFirst();
            com.google.android.exoplayer2.decoder.a[] aVarArr = this.f9717f;
            int i9 = this.f9719h - 1;
            this.f9719h = i9;
            com.google.android.exoplayer2.decoder.a aVar = aVarArr[i9];
            boolean z9 = this.f9722k;
            this.f9722k = false;
            if (gVar.isEndOfStream()) {
                aVar.addFlag(4);
            } else {
                if (gVar.isDecodeOnly()) {
                    aVar.addFlag(Integer.MIN_VALUE);
                }
                if (gVar.isFirstSample()) {
                    aVar.addFlag(134217728);
                }
                try {
                    fVarI = j(gVar, aVar, z9);
                } catch (OutOfMemoryError | RuntimeException e9) {
                    fVarI = i(e9);
                }
                if (fVarI != null) {
                    synchronized (this.f9713b) {
                        this.f9721j = fVarI;
                    }
                    return false;
                }
            }
            synchronized (this.f9713b) {
                try {
                    if (this.f9722k) {
                        aVar.release();
                    } else if (aVar.isDecodeOnly()) {
                        this.f9724m++;
                        aVar.release();
                    } else {
                        aVar.skippedOutputBufferCount = this.f9724m;
                        this.f9724m = 0;
                        this.f9715d.addLast(aVar);
                    }
                    q(gVar);
                } finally {
                }
            }
            return true;
        }
    }

    @Override // U2.d
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final g d() {
        g gVar;
        synchronized (this.f9713b) {
            o();
            AbstractC1684a.g(this.f9720i == null);
            int i9 = this.f9718g;
            if (i9 == 0) {
                gVar = null;
            } else {
                g[] gVarArr = this.f9716e;
                int i10 = i9 - 1;
                this.f9718g = i10;
                gVar = gVarArr[i10];
            }
            this.f9720i = gVar;
        }
        return gVar;
    }

    @Override // U2.d
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final com.google.android.exoplayer2.decoder.a b() {
        synchronized (this.f9713b) {
            try {
                o();
                if (this.f9715d.isEmpty()) {
                    return null;
                }
                return (com.google.android.exoplayer2.decoder.a) this.f9715d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n() {
        if (f()) {
            this.f9713b.notify();
        }
    }

    public final void o() throws f {
        f fVar = this.f9721j;
        if (fVar != null) {
            throw fVar;
        }
    }

    @Override // U2.d
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void c(g gVar) {
        synchronized (this.f9713b) {
            o();
            AbstractC1684a.a(gVar == this.f9720i);
            this.f9714c.addLast(gVar);
            n();
            this.f9720i = null;
        }
    }

    public final void q(g gVar) {
        gVar.clear();
        g[] gVarArr = this.f9716e;
        int i9 = this.f9718g;
        this.f9718g = i9 + 1;
        gVarArr[i9] = gVar;
    }

    public void r(com.google.android.exoplayer2.decoder.a aVar) {
        synchronized (this.f9713b) {
            s(aVar);
            n();
        }
    }

    @Override // U2.d
    public void release() {
        synchronized (this.f9713b) {
            this.f9723l = true;
            this.f9713b.notify();
        }
        try {
            this.f9712a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public final void s(com.google.android.exoplayer2.decoder.a aVar) {
        aVar.clear();
        com.google.android.exoplayer2.decoder.a[] aVarArr = this.f9717f;
        int i9 = this.f9719h;
        this.f9719h = i9 + 1;
        aVarArr[i9] = aVar;
    }

    public final void t() {
        do {
            try {
            } catch (InterruptedException e9) {
                throw new IllegalStateException(e9);
            }
        } while (k());
    }

    public final void u(int i9) {
        AbstractC1684a.g(this.f9718g == this.f9716e.length);
        for (g gVar : this.f9716e) {
            gVar.e(i9);
        }
    }
}
