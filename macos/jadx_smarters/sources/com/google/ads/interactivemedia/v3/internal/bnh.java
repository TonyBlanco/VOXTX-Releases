package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class bnh extends bkl {
    private static final bjy b(boh bohVar, int i9) throws IOException {
        int i10 = i9 - 1;
        if (i10 == 5) {
            return new bkd(bohVar.h());
        }
        if (i10 == 6) {
            return new bkd(new blb(bohVar.h()));
        }
        if (i10 == 7) {
            return new bkd(Boolean.valueOf(bohVar.q()));
        }
        if (i10 != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(boi.a(i9)));
        }
        bohVar.m();
        return bka.f21595a;
    }

    private static final bjy c(boh bohVar, int i9) throws IOException {
        int i10 = i9 - 1;
        if (i10 == 0) {
            bohVar.i();
            return new bjw();
        }
        if (i10 != 2) {
            return null;
        }
        bohVar.j();
        return new bkb();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void write(boj bojVar, bjy bjyVar) throws IOException {
        if (bjyVar == null || (bjyVar instanceof bka)) {
            bojVar.g();
            return;
        }
        if (bjyVar instanceof bkd) {
            bkd bkdVar = (bkd) bjyVar;
            if (bkdVar.e()) {
                bojVar.k(bkdVar.a());
                return;
            } else if (bkdVar.d()) {
                bojVar.m(bkdVar.c());
                return;
            } else {
                bojVar.l(bkdVar.b());
                return;
            }
        }
        if (bjyVar instanceof bjw) {
            bojVar.b();
            Iterator it = ((bjw) bjyVar).iterator();
            while (it.hasNext()) {
                write(bojVar, (bjy) it.next());
            }
            bojVar.d();
            return;
        }
        if (!(bjyVar instanceof bkb)) {
            throw new IllegalArgumentException("Couldn't write ".concat(String.valueOf(bjyVar.getClass())));
        }
        bojVar.c();
        for (Map.Entry entry : ((bkb) bjyVar).a()) {
            bojVar.f((String) entry.getKey());
            write(bojVar, (bjy) entry.getValue());
        }
        bojVar.e();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final /* bridge */ /* synthetic */ Object read(boh bohVar) throws IOException {
        if (bohVar instanceof bmc) {
            return ((bmc) bohVar).d();
        }
        int iR = bohVar.r();
        bjy bjyVarC = c(bohVar, iR);
        if (bjyVarC == null) {
            return b(bohVar, iR);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (bohVar.p()) {
                String strG = bjyVarC instanceof bkb ? bohVar.g() : null;
                int iR2 = bohVar.r();
                bjy bjyVarC2 = c(bohVar, iR2);
                bjy bjyVarB = bjyVarC2 == null ? b(bohVar, iR2) : bjyVarC2;
                if (bjyVarC instanceof bjw) {
                    ((bjw) bjyVarC).a(bjyVarB);
                } else {
                    ((bkb) bjyVarC).b(strG, bjyVarB);
                }
                if (bjyVarC2 != null) {
                    arrayDeque.addLast(bjyVarC);
                    bjyVarC = bjyVarB;
                }
            } else {
                if (bjyVarC instanceof bjw) {
                    bohVar.k();
                } else {
                    bohVar.l();
                }
                if (arrayDeque.isEmpty()) {
                    return bjyVarC;
                }
                bjyVarC = (bjy) arrayDeque.removeLast();
            }
        }
    }
}
