package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: classes3.dex */
public final class bbi extends beb {
    public bbi() {
        super(bgr.class, new bbg(azo.class));
    }

    public static /* bridge */ /* synthetic */ bdz g(int i9, int i10) {
        bif bifVarE = bgs.e();
        bifVarE.ad(i9);
        return new bdz((bgs) bifVarE.aY(), i10);
    }

    public static void h() throws GeneralSecurityException {
        if (m()) {
            bao.o(new bbi());
        }
    }

    private static boolean m() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.beb
    public final bea a() {
        return new bbh(this, bgs.class);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.beb
    public final bhq b() {
        return bhq.SYMMETRIC;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.beb
    public final /* bridge */ /* synthetic */ brs c(bpb bpbVar) throws bqw {
        return bgr.c(bpbVar, bqb.a());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.beb
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.beb
    public final /* bridge */ /* synthetic */ void e(brs brsVar) throws GeneralSecurityException {
        bgr bgrVar = (bgr) brsVar;
        bjg.b(bgrVar.a());
        bjg.a(bgrVar.d().d());
    }
}
