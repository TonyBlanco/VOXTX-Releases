package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class xl implements wy {
    private xl() {
    }

    public /* synthetic */ xl(byte[] bArr) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wy
    public final void e() throws IOException {
        synchronized (xm.f25064a) {
            synchronized (xm.f25065b) {
                if (xm.f25066c) {
                    return;
                }
                long jA = xm.a();
                synchronized (xm.f25065b) {
                    xm.f25067d = jA;
                    xm.f25066c = true;
                }
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wy
    public final void r() {
    }
}
