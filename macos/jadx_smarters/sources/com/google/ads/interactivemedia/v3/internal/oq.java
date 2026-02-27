package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.util.LinkedHashMap;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public final class oq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f23934a;

    public oq() {
        this.f23934a = new op();
    }

    private oq(bht bhtVar) {
        this.f23934a = bhtVar;
    }

    public oq(cx cxVar) {
        this.f23934a = cxVar;
    }

    public oq(ECPublicKey eCPublicKey) {
        this.f23934a = eCPublicKey;
    }

    public static oq i(String str, byte[] bArr, int i9) {
        bif bifVarJ = bht.j();
        bifVarJ.n(str);
        bifVarJ.o(bpb.t(bArr));
        int i10 = i9 - 1;
        bifVarJ.m(i10 != 0 ? i10 != 1 ? bid.RAW : bid.LEGACY : bid.TINK);
        return new oq((bht) bifVarJ.aY());
    }

    public final byte[] a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return (byte[]) ((LinkedHashMap) this.f23934a).get(uri);
    }

    public final byte[] b(Uri uri) {
        return (byte[]) ((LinkedHashMap) this.f23934a).remove(uri);
    }

    public final void c(Uri uri, byte[] bArr) {
        Object obj = this.f23934a;
        af.s(uri);
    }

    public final cy d() {
        return ((df) this.f23934a).a();
    }

    public final String e() {
        return ((bht) this.f23934a).e();
    }

    public final byte[] f() {
        return ((bht) this.f23934a).d().B();
    }

    public final int g() {
        bid bidVarC = ((bht) this.f23934a).c();
        bid bidVar = bid.UNKNOWN_PREFIX;
        int iOrdinal = bidVarC.ordinal();
        int i9 = 1;
        if (iOrdinal != 1) {
            i9 = 2;
            if (iOrdinal != 2) {
                i9 = 3;
                if (iOrdinal != 3) {
                    if (iOrdinal == 4) {
                        return 4;
                    }
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
            }
        }
        return i9;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.security.interfaces.ECKey] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.security.interfaces.ECPublicKey] */
    public final bel h(String str, byte[] bArr, byte[] bArr2, int i9, int i10) throws GeneralSecurityException {
        KeyPair keyPairK = bjh.k(this.f23934a.getParams());
        ECPublicKey eCPublicKey = (ECPublicKey) keyPairK.getPublic();
        byte[] bArrO = bjh.o((ECPrivateKey) keyPairK.getPrivate(), this.f23934a);
        byte[] bArrV = bjh.v(eCPublicKey.getParams().getCurve(), i10, eCPublicKey.getW());
        byte[] bArrY = bjh.y(bArrV, bArrO);
        Mac mac = (Mac) biv.f21525b.a(str);
        if (i9 > mac.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        if (bArr == null || bArr.length == 0) {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
        } else {
            mac.init(new SecretKeySpec(bArr, str));
        }
        byte[] bArrDoFinal = mac.doFinal(bArrY);
        byte[] bArr3 = new byte[i9];
        mac.init(new SecretKeySpec(bArrDoFinal, str));
        byte[] bArrDoFinal2 = new byte[0];
        int i11 = 1;
        int i12 = 0;
        while (true) {
            mac.update(bArrDoFinal2);
            mac.update(bArr2);
            mac.update((byte) i11);
            bArrDoFinal2 = mac.doFinal();
            int length = bArrDoFinal2.length;
            int i13 = i12 + length;
            if (i13 >= i9) {
                System.arraycopy(bArrDoFinal2, 0, bArr3, i12, i9 - i12);
                return new bel(bArrV, bArr3);
            }
            System.arraycopy(bArrDoFinal2, 0, bArr3, i12, length);
            i11++;
            i12 = i13;
        }
    }
}
