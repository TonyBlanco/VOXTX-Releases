package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.internal.bom;
import com.google.ads.interactivemedia.v3.internal.bon;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bon<MessageType extends bon<MessageType, BuilderType>, BuilderType extends bom<MessageType, BuilderType>> implements brs {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f21854b = 0;

    public int at(bsi bsiVar) {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.brs
    public final bpb au() {
        try {
            int iAx = ax();
            bpb bpbVar = bpb.f21870b;
            byte[] bArr = new byte[iAx];
            bpk bpkVarX = bpk.X(bArr);
            br(bpd.b(bpkVarX));
            return bpd.a(bpkVarX, bArr);
        } catch (IOException e9) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e9);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.brs
    public final byte[] av() {
        try {
            byte[] bArr = new byte[ax()];
            bpk bpkVarX = bpk.X(bArr);
            br(bpkVarX);
            bpkVarX.Y();
            return bArr;
        } catch (IOException e9) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e9);
        }
    }
}
