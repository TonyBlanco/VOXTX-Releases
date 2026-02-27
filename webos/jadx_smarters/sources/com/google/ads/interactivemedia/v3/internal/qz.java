package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
final class qz extends ef {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f24317f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f24318g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f24319h;

    public qz() {
        super(2);
        this.f24319h = 32;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ef, com.google.ads.interactivemedia.v3.internal.dz
    public final void b() {
        super.b();
        this.f24318g = 0;
    }

    public final int l() {
        return this.f24318g;
    }

    public final long m() {
        return this.f24317f;
    }

    public final void n(int i9) {
        af.u(true);
        this.f24319h = i9;
    }

    public final boolean o(ef efVar) {
        ByteBuffer byteBuffer;
        af.u(!efVar.k());
        af.u(!efVar.e());
        af.u(!efVar.g());
        if (p()) {
            if (this.f24318g >= this.f24319h || efVar.f() != f()) {
                return false;
            }
            ByteBuffer byteBuffer2 = efVar.f22774b;
            if (byteBuffer2 != null && (byteBuffer = this.f22774b) != null && byteBuffer.position() + byteBuffer2.remaining() > 3072000) {
                return false;
            }
        }
        int i9 = this.f24318g;
        this.f24318g = i9 + 1;
        if (i9 == 0) {
            this.f22776d = efVar.f22776d;
            if (efVar.h()) {
                c(1);
            }
        }
        if (efVar.f()) {
            c(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer3 = efVar.f22774b;
        if (byteBuffer3 != null) {
            i(byteBuffer3.remaining());
            this.f22774b.put(byteBuffer3);
        }
        this.f24317f = efVar.f22776d;
        return true;
    }

    public final boolean p() {
        return this.f24318g > 0;
    }
}
