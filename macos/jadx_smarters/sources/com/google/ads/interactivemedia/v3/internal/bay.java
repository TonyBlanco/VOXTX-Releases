package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
final class bay extends bea {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ baz f21019a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bay(baz bazVar, Class cls) {
        super(cls);
        this.f21019a = bazVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bea
    public final /* bridge */ /* synthetic */ brs a(brs brsVar) throws GeneralSecurityException {
        bgk bgkVar = (bgk) brsVar;
        bif bifVarK = bgj.k();
        bifVarK.at(bgkVar.e());
        bifVarK.as(bpb.t(bjf.b(bgkVar.a())));
        bifVarK.au();
        return (bgj) bifVarK.aY();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bea
    public final /* bridge */ /* synthetic */ brs b(bpb bpbVar) throws bqw {
        return bgk.d(bpbVar, bqb.a());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bea
    public final /* bridge */ /* synthetic */ void d(brs brsVar) throws GeneralSecurityException {
        bgk bgkVar = (bgk) brsVar;
        bjg.a(bgkVar.a());
        baz bazVar = this.f21019a;
        baz.m(bgkVar.e());
    }
}
