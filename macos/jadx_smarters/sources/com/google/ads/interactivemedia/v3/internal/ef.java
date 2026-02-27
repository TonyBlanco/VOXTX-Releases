package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class ef extends dz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ec f22773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer f22774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f22775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f22776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ByteBuffer f22777e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f22778f;

    static {
        aj.b("media3.decoder");
    }

    public ef() {
        this(1);
    }

    public ef(int i9) {
        this.f22773a = new ec();
        this.f22778f = i9;
    }

    private final ByteBuffer l(int i9) {
        int i10 = this.f22778f;
        if (i10 == 1) {
            return ByteBuffer.allocate(i9);
        }
        if (i10 == 2) {
            return ByteBuffer.allocateDirect(i9);
        }
        ByteBuffer byteBuffer = this.f22774b;
        throw new ee(byteBuffer == null ? 0 : byteBuffer.capacity(), i9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.dz
    public void b() {
        super.b();
        ByteBuffer byteBuffer = this.f22774b;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f22777e;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f22775c = false;
    }

    public final void i(int i9) {
        ByteBuffer byteBuffer = this.f22774b;
        if (byteBuffer == null) {
            this.f22774b = l(i9);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i10 = i9 + iPosition;
        if (iCapacity >= i10) {
            this.f22774b = byteBuffer;
            return;
        }
        ByteBuffer byteBufferL = l(i10);
        byteBufferL.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferL.put(byteBuffer);
        }
        this.f22774b = byteBufferL;
    }

    public final void j() {
        ByteBuffer byteBuffer = this.f22774b;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f22777e;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean k() {
        return d(1073741824);
    }
}
