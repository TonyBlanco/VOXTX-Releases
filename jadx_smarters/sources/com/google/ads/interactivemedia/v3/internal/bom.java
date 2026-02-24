package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.internal.bom;
import com.google.ads.interactivemedia.v3.internal.bon;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bom<MessageType extends bon<MessageType, BuilderType>, BuilderType extends bom<MessageType, BuilderType>> implements brr {
    @Override // 
    /* JADX INFO: renamed from: aQ */
    public abstract bom clone();

    public abstract bom aR(bon bonVar);

    @Override // com.google.ads.interactivemedia.v3.internal.brr
    public final /* bridge */ /* synthetic */ brr aS(brs brsVar) {
        if (ba().getClass().isInstance(brsVar)) {
            return aR((bon) brsVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.brr
    public /* bridge */ /* synthetic */ void aT(bpg bpgVar, bqb bqbVar) throws IOException {
        throw null;
    }

    public void aU(byte[] bArr, int i9, bqb bqbVar) throws bqw {
        throw null;
    }
}
