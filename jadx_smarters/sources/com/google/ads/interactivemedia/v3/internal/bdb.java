package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class bdb implements bir {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f21079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f21080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private bgp f21081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private bgh f21082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f21083e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private bgt f21084f;

    public bdb(bht bhtVar) throws GeneralSecurityException {
        String strE = bhtVar.e();
        this.f21079a = strE;
        if (strE.equals(bar.f21015b)) {
            try {
                bgq bgqVarC = bgq.c(bhtVar.d(), bqb.a());
                this.f21081c = (bgp) bao.c(bhtVar);
                this.f21080b = bgqVarC.a();
                return;
            } catch (bqw e9) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e9);
            }
        }
        if (strE.equals(bar.f21014a)) {
            try {
                bgi bgiVarB = bgi.b(bhtVar.d(), bqb.a());
                this.f21082d = (bgh) bao.c(bhtVar);
                this.f21083e = bgiVarB.c().a();
                this.f21080b = this.f21083e + bgiVarB.d().a();
                return;
            } catch (bqw e10) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e10);
            }
        }
        if (!strE.equals(bcm.f21055a)) {
            throw new GeneralSecurityException("unsupported AEAD DEM key type: ".concat(String.valueOf(strE)));
        }
        try {
            bgu bguVarC = bgu.c(bhtVar.d(), bqb.a());
            this.f21084f = (bgt) bao.c(bhtVar);
            this.f21080b = bguVarC.a();
        } catch (bqw e11) {
            throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e11);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bir
    public final int a() {
        return this.f21080b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bir
    public final bdy b(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length != this.f21080b) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        }
        if (this.f21079a.equals(bar.f21015b)) {
            bif bifVarG = bgp.g();
            bifVarG.be(this.f21081c);
            bifVarG.ah(bpb.u(bArr, 0, this.f21080b));
            return new bdy((azo) bao.g(this.f21079a, (bgp) bifVarG.aY(), azo.class));
        }
        if (!this.f21079a.equals(bar.f21014a)) {
            if (!this.f21079a.equals(bcm.f21055a)) {
                throw new GeneralSecurityException("unknown DEM key type");
            }
            bif bifVarG2 = bgt.g();
            bifVarG2.be(this.f21084f);
            bifVarG2.ab(bpb.u(bArr, 0, this.f21080b));
            return new bdy((azr) bao.g(this.f21079a, (bgt) bifVarG2.aY(), azr.class));
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, this.f21083e);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, this.f21083e, this.f21080b);
        bif bifVarK = bgj.k();
        bifVarK.be(this.f21082d.d());
        bifVarK.as(bpb.t(bArrCopyOfRange));
        bgj bgjVar = (bgj) bifVarK.aY();
        bif bifVarK2 = bhg.k();
        bifVarK2.be(this.f21082d.e());
        bifVarK2.G(bpb.t(bArrCopyOfRange2));
        bhg bhgVar = (bhg) bifVarK2.aY();
        bif bifVarJ = bgh.j();
        bifVarJ.az(this.f21082d.a());
        bifVarJ.ax(bgjVar);
        bifVarJ.ay(bhgVar);
        return new bdy((azo) bao.g(this.f21079a, (bgh) bifVarJ.aY(), azo.class));
    }
}
