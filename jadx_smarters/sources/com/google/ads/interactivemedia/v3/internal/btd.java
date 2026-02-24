package com.google.ads.interactivemedia.v3.internal;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
final class btd extends bte {
    public btd(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bte
    public final byte a(long j9) {
        return Memory.peekByte(j9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bte
    public final double b(Object obj, long j9) {
        return Double.longBitsToDouble(m(obj, j9));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bte
    public final float c(Object obj, long j9) {
        return Float.intBitsToFloat(l(obj, j9));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bte
    public final void d(long j9, byte[] bArr, long j10, long j11) {
        Memory.peekByteArray(j9, bArr, (int) j10, (int) j11);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bte
    public final void e(Object obj, long j9, boolean z9) {
        if (btf.f22254b) {
            btf.H(obj, j9, z9 ? (byte) 1 : (byte) 0);
        } else {
            btf.I(obj, j9, z9 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bte
    public final void f(Object obj, long j9, byte b9) {
        if (btf.f22254b) {
            btf.H(obj, j9, b9);
        } else {
            btf.I(obj, j9, b9);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bte
    public final void g(Object obj, long j9, double d9) {
        q(obj, j9, Double.doubleToLongBits(d9));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bte
    public final void h(Object obj, long j9, float f9) {
        p(obj, j9, Float.floatToIntBits(f9));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bte
    public final boolean i(Object obj, long j9) {
        return btf.f22254b ? btf.x(obj, j9) : btf.y(obj, j9);
    }
}
