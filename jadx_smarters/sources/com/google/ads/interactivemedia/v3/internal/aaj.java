package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aaj {
    public final ao a(ef efVar) {
        ByteBuffer byteBuffer = efVar.f22774b;
        af.s(byteBuffer);
        boolean z9 = false;
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            z9 = true;
        }
        af.u(z9);
        if (efVar.f()) {
            return null;
        }
        return b(byteBuffer);
    }

    public abstract ao b(ByteBuffer byteBuffer);
}
