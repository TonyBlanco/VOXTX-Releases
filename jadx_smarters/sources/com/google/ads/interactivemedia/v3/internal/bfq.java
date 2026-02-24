package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bfq implements bdv {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f21215c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ bfq f21214b = new bfq(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ bfq f21213a = new bfq(0);

    private /* synthetic */ bfq(int i9) {
        this.f21215c = i9;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bdv
    public final azu a(bes besVar, bap bapVar) throws GeneralSecurityException {
        bfk bfkVar;
        bfl bflVar;
        bfb bfbVar;
        if (this.f21215c != 0) {
            int i9 = bfd.f21176a;
            if (!((beq) besVar).g().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
            }
            try {
                bge bgeVarC = bge.c(((beq) besVar).e(), bqb.a());
                if (bgeVarC.a() != 0) {
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                }
                bfe bfeVar = new bfe(null, null);
                bfeVar.e(bgeVarC.e().d());
                bfeVar.f(bgeVarC.d().a());
                bid bidVarC = ((beq) besVar).c();
                bid bidVar = bid.UNKNOWN_PREFIX;
                int iOrdinal = bidVarC.ordinal();
                if (iOrdinal == 1) {
                    bfbVar = bfb.f21168a;
                } else if (iOrdinal == 2) {
                    bfbVar = bfb.f21170c;
                } else if (iOrdinal == 3) {
                    bfbVar = bfb.f21171d;
                } else {
                    if (iOrdinal != 4) {
                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + bidVarC.getNumber());
                    }
                    bfbVar = bfb.f21169b;
                }
                bfeVar.g(bfbVar);
                bfc bfcVarD = bfeVar.d();
                bfe bfeVar2 = new bfe(null, null, null);
                bfeVar2.j(bfcVarD);
                bfeVar2.l(vk.e(bgeVarC.e().B()));
                bfeVar2.i(((beq) besVar).f());
                return bfeVar2.h();
            } catch (bqw | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing AesCmacKey failed");
            }
        }
        int i10 = bfr.f21216a;
        if (!((beq) besVar).g().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacParameters.parseParameters");
        }
        try {
            bhg bhgVarD = bhg.d(((beq) besVar).e(), bqb.a());
            if (bhgVarD.a() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            bfj bfjVar = new bfj(null);
            bfjVar.c(bhgVarD.f().d());
            bfjVar.d(bhgVarD.e().a());
            int iE = bhgVarD.e().e();
            bid bidVar2 = bid.UNKNOWN_PREFIX;
            int i11 = bhf.f21343a;
            int i12 = iE - 2;
            if (iE == 0) {
                throw null;
            }
            if (i12 == 1) {
                bfkVar = bfk.f21192a;
            } else if (i12 == 2) {
                bfkVar = bfk.f21195d;
            } else if (i12 == 3) {
                bfkVar = bfk.f21194c;
            } else if (i12 == 4) {
                bfkVar = bfk.f21196e;
            } else {
                if (i12 != 5) {
                    throw new GeneralSecurityException("Unable to parse HashType: " + bhf.a(iE));
                }
                bfkVar = bfk.f21193b;
            }
            bfjVar.b(bfkVar);
            bid bidVarC2 = ((beq) besVar).c();
            int iOrdinal2 = bidVarC2.ordinal();
            if (iOrdinal2 == 1) {
                bflVar = bfl.f21198a;
            } else if (iOrdinal2 == 2) {
                bflVar = bfl.f21200c;
            } else if (iOrdinal2 == 3) {
                bflVar = bfl.f21201d;
            } else {
                if (iOrdinal2 != 4) {
                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + bidVarC2.getNumber());
                }
                bflVar = bfl.f21199b;
            }
            bfjVar.e(bflVar);
            bfm bfmVarA = bfjVar.a();
            bfe bfeVar3 = new bfe(null);
            bfeVar3.c(bfmVarA);
            bfeVar3.k(vk.e(bhgVarD.f().B()));
            bfeVar3.b(((beq) besVar).f());
            return bfeVar3.a();
        } catch (bqw | IllegalArgumentException unused2) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }
}
