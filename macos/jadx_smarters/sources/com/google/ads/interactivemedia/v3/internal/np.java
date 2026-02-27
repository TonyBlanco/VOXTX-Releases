package com.google.ads.interactivemedia.v3.internal;

import android.os.Looper;
import com.facebook.ads.AdError;

/* JADX INFO: loaded from: classes3.dex */
final class np implements nt {
    @Override // com.google.ads.interactivemedia.v3.internal.nt
    public final int b(C1333s c1333s) {
        return c1333s.f24470o != null ? 1 : 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nt
    public final nm i(nn nnVar, C1333s c1333s) {
        if (c1333s.f24470o == null) {
            return null;
        }
        return new nz(new nl(new ol(), AdError.MEDIAVIEW_MISSING_ERROR_CODE));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nt
    public final /* synthetic */ ns j(nn nnVar, C1333s c1333s) {
        return ns.f23900b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nt
    public final /* synthetic */ void o() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nt
    public final /* synthetic */ void p() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nt
    public final void q(Looper looper, iw iwVar) {
    }
}
