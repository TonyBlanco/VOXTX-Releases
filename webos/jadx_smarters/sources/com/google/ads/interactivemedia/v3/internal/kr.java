package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class kr implements jb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f23553c = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f23554d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private iz f23555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private iz f23556f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private iz f23557g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private iz f23558h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f23559i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private kq f23560j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ByteBuffer f23561k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ShortBuffer f23562l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ByteBuffer f23563m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f23564n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f23565o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f23566p;

    public kr() {
        iz izVar = iz.f23328a;
        this.f23555e = izVar;
        this.f23556f = izVar;
        this.f23557g = izVar;
        this.f23558h = izVar;
        ByteBuffer byteBuffer = jb.f23338a;
        this.f23561k = byteBuffer;
        this.f23562l = byteBuffer.asShortBuffer();
        this.f23563m = byteBuffer;
        this.f23552b = -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jb
    public final iz a(iz izVar) throws ja {
        if (izVar.f23331d != 2) {
            throw new ja(izVar);
        }
        int i9 = this.f23552b;
        if (i9 == -1) {
            i9 = izVar.f23329b;
        }
        this.f23555e = izVar;
        iz izVar2 = new iz(i9, izVar.f23330c, 2);
        this.f23556f = izVar2;
        this.f23559i = true;
        return izVar2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jb
    public final ByteBuffer b() {
        int iA;
        kq kqVar = this.f23560j;
        if (kqVar != null && (iA = kqVar.a()) > 0) {
            if (this.f23561k.capacity() < iA) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iA).order(ByteOrder.nativeOrder());
                this.f23561k = byteBufferOrder;
                this.f23562l = byteBufferOrder.asShortBuffer();
            } else {
                this.f23561k.clear();
                this.f23562l.clear();
            }
            kqVar.d(this.f23562l);
            this.f23565o += (long) iA;
            this.f23561k.limit(iA);
            this.f23563m = this.f23561k;
        }
        ByteBuffer byteBuffer = this.f23563m;
        this.f23563m = jb.f23338a;
        return byteBuffer;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jb
    public final void c() {
        if (g()) {
            iz izVar = this.f23555e;
            this.f23557g = izVar;
            iz izVar2 = this.f23556f;
            this.f23558h = izVar2;
            if (this.f23559i) {
                this.f23560j = new kq(izVar.f23329b, izVar.f23330c, this.f23553c, this.f23554d, izVar2.f23329b);
            } else {
                kq kqVar = this.f23560j;
                if (kqVar != null) {
                    kqVar.c();
                }
            }
        }
        this.f23563m = jb.f23338a;
        this.f23564n = 0L;
        this.f23565o = 0L;
        this.f23566p = false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jb
    public final void d() {
        kq kqVar = this.f23560j;
        if (kqVar != null) {
            kqVar.e();
        }
        this.f23566p = true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jb
    public final void e(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            kq kqVar = this.f23560j;
            af.s(kqVar);
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f23564n += (long) iRemaining;
            kqVar.f(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jb
    public final void f() {
        this.f23553c = 1.0f;
        this.f23554d = 1.0f;
        iz izVar = iz.f23328a;
        this.f23555e = izVar;
        this.f23556f = izVar;
        this.f23557g = izVar;
        this.f23558h = izVar;
        ByteBuffer byteBuffer = jb.f23338a;
        this.f23561k = byteBuffer;
        this.f23562l = byteBuffer.asShortBuffer();
        this.f23563m = byteBuffer;
        this.f23552b = -1;
        this.f23559i = false;
        this.f23560j = null;
        this.f23564n = 0L;
        this.f23565o = 0L;
        this.f23566p = false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jb
    public final boolean g() {
        if (this.f23556f.f23329b != -1) {
            return Math.abs(this.f23553c + (-1.0f)) >= 1.0E-4f || Math.abs(this.f23554d + (-1.0f)) >= 1.0E-4f || this.f23556f.f23329b != this.f23555e.f23329b;
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jb
    public final boolean h() {
        if (!this.f23566p) {
            return false;
        }
        kq kqVar = this.f23560j;
        return kqVar == null || kqVar.a() == 0;
    }

    public final long i(long j9) {
        if (this.f23565o < 1024) {
            return (long) (((double) this.f23553c) * j9);
        }
        long j10 = this.f23564n;
        kq kqVar = this.f23560j;
        af.s(kqVar);
        long jB = j10 - ((long) kqVar.b());
        int i9 = this.f23558h.f23329b;
        int i10 = this.f23557g.f23329b;
        return i9 == i10 ? cq.w(j9, jB, this.f23565o) : cq.w(j9, jB * ((long) i9), this.f23565o * ((long) i10));
    }

    public final void j(float f9) {
        if (this.f23554d != f9) {
            this.f23554d = f9;
            this.f23559i = true;
        }
    }

    public final void k(float f9) {
        if (this.f23553c != f9) {
            this.f23553c = f9;
            this.f23559i = true;
        }
    }
}
