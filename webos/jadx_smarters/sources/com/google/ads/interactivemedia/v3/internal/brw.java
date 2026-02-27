package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class brw implements bsi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final brs f22191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f22192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bto f22193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final bsr f22194d;

    private brw(bto btoVar, bsr bsrVar, brs brsVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f22193c = btoVar;
        this.f22192b = bsr.q(brsVar);
        this.f22194d = bsrVar;
        this.f22191a = brsVar;
    }

    public static brw c(bto btoVar, bsr bsrVar, brs brsVar) {
        return new brw(btoVar, bsrVar, brsVar, null, null, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsi
    public final int a(Object obj) {
        int iB = ((bsx) this.f22193c.j(obj)).b();
        return this.f22192b ? iB + bsr.o(obj).c() : iB;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsi
    public final int b(Object obj) {
        int iHashCode = this.f22193c.j(obj).hashCode();
        return this.f22192b ? (iHashCode * 53) + bsr.o(obj).hashCode() : iHashCode;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsi
    public final Object e() {
        brs brsVar = this.f22191a;
        return brsVar instanceof bqn ? ((bqn) brsVar).aA() : brsVar.bp().aZ();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsi
    public final void f(Object obj) {
        this.f22193c.k(obj);
        this.f22194d.l(obj);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsi
    public final void g(Object obj, Object obj2) {
        bsk.Y(this.f22193c, obj, obj2);
        if (this.f22192b) {
            bsk.aa(this.f22194d, obj, obj2);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsi
    public final void h(Object obj, bsd bsdVar, bqb bqbVar) throws IOException {
        boolean zQ;
        bto btoVar = this.f22193c;
        Object objI = btoVar.i(obj);
        bqe bqeVarP = bsr.p(obj);
        while (bsdVar.c() != Integer.MAX_VALUE) {
            try {
                int iD = bsdVar.d();
                if (iD != btm.f22296a) {
                    if (btm.b(iD) == 2) {
                        Object objN = bsr.n(bqbVar, this.f22191a, btm.a(iD));
                        if (objN != null) {
                            bsr.r(bsdVar, objN, bqbVar, bqeVarP);
                        } else {
                            zQ = btoVar.h(objI, bsdVar);
                        }
                    } else {
                        zQ = bsdVar.Q();
                    }
                    if (!zQ) {
                        btoVar.l(obj, objI);
                        return;
                    }
                } else {
                    Object objN2 = null;
                    bpb bpbVarP = null;
                    int iJ = 0;
                    while (bsdVar.c() != Integer.MAX_VALUE) {
                        int iD2 = bsdVar.d();
                        if (iD2 == btm.f22298c) {
                            iJ = bsdVar.j();
                            objN2 = bsr.n(bqbVar, this.f22191a, iJ);
                        } else if (iD2 == btm.f22299d) {
                            if (objN2 != null) {
                                bsr.r(bsdVar, objN2, bqbVar, bqeVarP);
                            } else {
                                bpbVarP = bsdVar.p();
                            }
                        } else if (!bsdVar.Q()) {
                            break;
                        }
                    }
                    if (bsdVar.d() != btm.f22297b) {
                        throw bqw.b();
                    }
                    if (bpbVarP != null) {
                        if (objN2 != null) {
                            bsr.s(bpbVarP, objN2, bqbVar, bqeVarP);
                        } else {
                            bto.q(objI, iJ, bpbVarP);
                        }
                    }
                }
            } catch (Throwable th) {
                btoVar.l(obj, objI);
                throw th;
            }
        }
        btoVar.l(obj, objI);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c3 A[EDGE_INSN: B:57:0x00c3->B:33:0x00c3 BREAK  A[LOOP:1: B:18:0x0069->B:60:0x0069], SYNTHETIC] */
    @Override // com.google.ads.interactivemedia.v3.internal.bsi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.Object r11, byte[] r12, int r13, int r14, com.google.ads.interactivemedia.v3.internal.boq r15) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.brw.i(java.lang.Object, byte[], int, int, com.google.ads.interactivemedia.v3.internal.boq):void");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsi
    public final void j(Object obj, btn btnVar) throws IOException {
        Iterator itG = bsr.o(obj).g();
        while (itG.hasNext()) {
            Map.Entry entry = (Map.Entry) itG.next();
            bqd bqdVar = (bqd) entry.getKey();
            if (bqdVar.d() != btl.MESSAGE || bqdVar.e()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            bqdVar.g();
            btnVar.x(bqdVar.a(), entry instanceof bqz ? ((bqz) entry).a().b() : entry.getValue());
        }
        ((bsx) this.f22193c.j(obj)).j(btnVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsi
    public final boolean k(Object obj, Object obj2) {
        if (!this.f22193c.j(obj).equals(this.f22193c.j(obj2))) {
            return false;
        }
        if (this.f22192b) {
            return bsr.o(obj).equals(bsr.o(obj2));
        }
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsi
    public final boolean l(Object obj) {
        return bsr.o(obj).n();
    }
}
