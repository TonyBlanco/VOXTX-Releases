package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
final class bbr extends bea {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ bbs f21028a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbr(bbs bbsVar, Class cls) {
        super(cls);
        this.f21028a = bbsVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bea
    public final /* bridge */ /* synthetic */ brs a(brs brsVar) throws GeneralSecurityException {
        bif bifVarG = bib.g();
        bifVarG.c((bic) brsVar);
        bifVarG.d();
        return (bib) bifVarG.aY();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bea
    public final /* bridge */ /* synthetic */ brs b(bpb bpbVar) throws bqw {
        return bic.d(bpbVar, bqb.a());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bea
    public final /* bridge */ /* synthetic */ void d(brs brsVar) throws GeneralSecurityException {
        bic bicVar = (bic) brsVar;
        if (bicVar.e().isEmpty() || !bicVar.f()) {
            throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
        }
    }
}
