package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
final class azx implements azv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final beb f20968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f20969b;

    public azx(beb bebVar, Class cls) {
        if (!bebVar.l().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", bebVar.toString(), cls.getName()));
        }
        this.f20968a = bebVar;
        this.f20969b = cls;
    }

    public azx(bep bepVar, Class cls) {
        this((beb) bepVar, cls);
    }

    private final azw g() {
        return new azw(this.f20968a.a());
    }

    private final Object h(brs brsVar) throws GeneralSecurityException {
        if (Void.class.equals(this.f20969b)) {
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        }
        this.f20968a.e(brsVar);
        return this.f20968a.k(brsVar, this.f20969b);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.azv
    public final bhr a(bpb bpbVar) throws GeneralSecurityException {
        try {
            brs brsVarA = g().a(bpbVar);
            bif bifVarJ = bhr.j();
            bifVarJ.q(f());
            bifVarJ.r(brsVarA.au());
            bifVarJ.p(this.f20968a.b());
            return (bhr) bifVarJ.aY();
        } catch (bqw e9) {
            throw new GeneralSecurityException("Unexpected proto", e9);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.azv
    public final brs b(bpb bpbVar) throws GeneralSecurityException {
        try {
            return g().a(bpbVar);
        } catch (bqw e9) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.f20968a.a().e().getName()), e9);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.azv
    public final Class c() {
        return this.f20969b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.azv
    public final Object d(bpb bpbVar) throws GeneralSecurityException {
        try {
            return h(this.f20968a.c(bpbVar));
        } catch (bqw e9) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.f20968a.j().getName()), e9);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.azv
    public final Object e(brs brsVar) throws GeneralSecurityException {
        String strConcat = "Expected proto of type ".concat(this.f20968a.j().getName());
        if (this.f20968a.j().isInstance(brsVar)) {
            return h(brsVar);
        }
        throw new GeneralSecurityException(strConcat);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.azv
    public final String f() {
        return this.f20968a.d();
    }
}
