package com.google.ads.interactivemedia.v3.internal;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class ph implements aae {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C1333s f24047a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final aae f24049c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C1333s f24051e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final aam f24048b = new aam();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1333s f24050d = f24047a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f24052f = new byte[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f24053g = 0;

    static {
        r rVar = new r();
        rVar.ae("application/id3");
        f24047a = rVar.v();
        r rVar2 = new r();
        rVar2.ae("application/x-emsg");
        rVar2.v();
    }

    public ph(aae aaeVar, int i9) {
        this.f24049c = aaeVar;
    }

    private final void c(int i9) {
        byte[] bArr = this.f24052f;
        if (bArr.length < i9) {
            this.f24052f = Arrays.copyOf(bArr, i9 + (i9 >> 1));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aae
    public final /* synthetic */ int a(InterfaceC1310k interfaceC1310k, int i9, boolean z9) {
        return fz.h(this, interfaceC1310k, i9, z9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aae
    public final void b(C1333s c1333s) {
        this.f24051e = c1333s;
        this.f24049c.b(this.f24050d);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aae
    public final /* synthetic */ void e(cj cjVar, int i9) {
        fz.i(this, cjVar, i9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aae
    public final void f(long j9, int i9, int i10, int i11, aad aadVar) {
        af.s(this.f24051e);
        int i12 = this.f24053g - i11;
        cj cjVar = new cj(Arrays.copyOfRange(this.f24052f, i12 - i10, i12));
        byte[] bArr = this.f24052f;
        System.arraycopy(bArr, i12, bArr, 0, i11);
        this.f24053g = i11;
        if (!cq.V(this.f24051e.f24467l, this.f24050d.f24467l)) {
            if (!"application/x-emsg".equals(this.f24051e.f24467l)) {
                cd.e("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: ".concat(String.valueOf(this.f24051e.f24467l)));
                return;
            }
            aal aalVarC = aam.c(cjVar);
            C1333s c1333sB = aalVarC.b();
            if (c1333sB == null || !cq.V(this.f24050d.f24467l, c1333sB.f24467l)) {
                cd.e("HlsSampleStreamWrapper", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", this.f24050d.f24467l, aalVarC.b()));
                return;
            }
            cjVar = new cj((byte[]) af.s(aalVarC.b() != null ? aalVarC.f18668e : null));
        }
        int iA = cjVar.a();
        this.f24049c.e(cjVar, iA);
        this.f24049c.f(j9, i9, iA, i11, aadVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aae
    public final int h(InterfaceC1310k interfaceC1310k, int i9, boolean z9) throws IOException {
        c(this.f24053g + i9);
        int iA = interfaceC1310k.a(this.f24052f, this.f24053g, i9);
        if (iA != -1) {
            this.f24053g += iA;
            return iA;
        }
        if (z9) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aae
    public final void i(cj cjVar, int i9) {
        c(this.f24053g + i9);
        cjVar.A(this.f24052f, this.f24053g, i9);
        this.f24053g += i9;
    }
}
