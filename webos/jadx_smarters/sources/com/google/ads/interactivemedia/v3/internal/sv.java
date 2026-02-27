package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class sv implements cy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final cy f24547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f24548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final su f24549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f24550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f24551e;

    public sv(cy cyVar, int i9, su suVar) {
        af.u(i9 > 0);
        this.f24547a = cyVar;
        this.f24548b = i9;
        this.f24549c = suVar;
        this.f24550d = new byte[1];
        this.f24551e = i9;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.InterfaceC1310k
    public final int a(byte[] bArr, int i9, int i10) throws IOException {
        int i11 = this.f24551e;
        if (i11 == 0) {
            int i12 = 0;
            if (this.f24547a.a(this.f24550d, 0, 1) != -1) {
                int i13 = (this.f24550d[0] & 255) << 4;
                if (i13 != 0) {
                    byte[] bArr2 = new byte[i13];
                    int i14 = i13;
                    while (i14 > 0) {
                        int iA = this.f24547a.a(bArr2, i12, i14);
                        if (iA != -1) {
                            i12 += iA;
                            i14 -= iA;
                        }
                    }
                    while (i13 > 0) {
                        int i15 = i13 - 1;
                        if (bArr2[i15] != 0) {
                            break;
                        }
                        i13 = i15;
                    }
                    if (i13 > 0) {
                        this.f24549c.a(new cj(bArr2, i13));
                    }
                }
                i11 = this.f24548b;
                this.f24551e = i11;
            }
            return -1;
        }
        int iA2 = this.f24547a.a(bArr, i9, Math.min(i11, i10));
        if (iA2 != -1) {
            this.f24551e -= iA2;
        }
        return iA2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cy
    public final long b(dc dcVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cy
    public final Uri c() {
        return this.f24547a.c();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cy
    public final void d() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cy
    public final Map e() {
        return this.f24547a.e();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cy
    public final void f(dw dwVar) {
        af.s(dwVar);
        this.f24547a.f(dwVar);
    }
}
