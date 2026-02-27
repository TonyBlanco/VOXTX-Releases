package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class baz extends beb {
    public baz() {
        super(bgj.class, new bax(biz.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(bgl bglVar) throws GeneralSecurityException {
        if (bglVar.a() < 12 || bglVar.a() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.beb
    public final bea a() {
        return new bay(this, bgk.class);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.beb
    public final bhq b() {
        return bhq.SYMMETRIC;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.beb
    public final /* bridge */ /* synthetic */ brs c(bpb bpbVar) throws bqw {
        return bgj.d(bpbVar, bqb.a());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.beb
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.beb
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void e(bgj bgjVar) throws GeneralSecurityException {
        bjg.b(bgjVar.a());
        bjg.a(bgjVar.f().d());
        m(bgjVar.e());
    }
}
