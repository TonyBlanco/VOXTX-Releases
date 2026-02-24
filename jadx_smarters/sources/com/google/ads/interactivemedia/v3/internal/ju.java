package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ju implements jb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected iz f23410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected iz f23411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private iz f23412d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private iz f23413e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ByteBuffer f23414f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ByteBuffer f23415g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f23416h;

    public ju() {
        ByteBuffer byteBuffer = jb.f23338a;
        this.f23414f = byteBuffer;
        this.f23415g = byteBuffer;
        iz izVar = iz.f23328a;
        this.f23412d = izVar;
        this.f23413e = izVar;
        this.f23410b = izVar;
        this.f23411c = izVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jb
    public final iz a(iz izVar) throws ja {
        this.f23412d = izVar;
        this.f23413e = i(izVar);
        return g() ? this.f23413e : iz.f23328a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jb
    public ByteBuffer b() {
        ByteBuffer byteBuffer = this.f23415g;
        this.f23415g = jb.f23338a;
        return byteBuffer;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jb
    public final void c() {
        this.f23415g = jb.f23338a;
        this.f23416h = false;
        this.f23410b = this.f23412d;
        this.f23411c = this.f23413e;
        k();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jb
    public final void d() {
        this.f23416h = true;
        l();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jb
    public final void f() {
        c();
        this.f23414f = jb.f23338a;
        iz izVar = iz.f23328a;
        this.f23412d = izVar;
        this.f23413e = izVar;
        this.f23410b = izVar;
        this.f23411c = izVar;
        m();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jb
    public boolean g() {
        return this.f23413e != iz.f23328a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jb
    public boolean h() {
        return this.f23416h && this.f23415g == jb.f23338a;
    }

    public iz i(iz izVar) throws ja {
        throw null;
    }

    public final ByteBuffer j(int i9) {
        if (this.f23414f.capacity() < i9) {
            this.f23414f = ByteBuffer.allocateDirect(i9).order(ByteOrder.nativeOrder());
        } else {
            this.f23414f.clear();
        }
        ByteBuffer byteBuffer = this.f23414f;
        this.f23415g = byteBuffer;
        return byteBuffer;
    }

    public void k() {
    }

    public void l() {
    }

    public void m() {
    }

    public final boolean n() {
        return this.f23415g.hasRemaining();
    }
}
