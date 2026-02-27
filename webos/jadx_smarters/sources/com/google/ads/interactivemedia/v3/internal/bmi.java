package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class bmi extends bkl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bkm f21706a = b(bki.DOUBLE);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bjt f21707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bkj f21708c;

    public /* synthetic */ bmi(bjt bjtVar, bkj bkjVar) {
        this.f21707b = bjtVar;
        this.f21708c = bkjVar;
    }

    public static bkm a(bkj bkjVar) {
        return bkjVar == bki.DOUBLE ? f21706a : b(bkjVar);
    }

    private static bkm b(bkj bkjVar) {
        return new bmh(bkjVar, 0);
    }

    private final Object c(boh bohVar, int i9) throws IOException {
        int i10 = i9 - 1;
        if (i10 == 5) {
            return bohVar.h();
        }
        if (i10 == 6) {
            return this.f21708c.a(bohVar);
        }
        if (i10 == 7) {
            return Boolean.valueOf(bohVar.q());
        }
        if (i10 != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(boi.a(i9)));
        }
        bohVar.m();
        return null;
    }

    private static final Object d(boh bohVar, int i9) throws IOException {
        int i10 = i9 - 1;
        if (i10 == 0) {
            bohVar.i();
            return new ArrayList();
        }
        if (i10 != 2) {
            return null;
        }
        bohVar.j();
        return new blj();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final Object read(boh bohVar) throws IOException {
        int iR = bohVar.r();
        Object objD = d(bohVar, iR);
        if (objD == null) {
            return c(bohVar, iR);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (bohVar.p()) {
                String strG = objD instanceof Map ? bohVar.g() : null;
                int iR2 = bohVar.r();
                Object objD2 = d(bohVar, iR2);
                Object objC = objD2 == null ? c(bohVar, iR2) : objD2;
                if (objD instanceof List) {
                    ((List) objD).add(objC);
                } else {
                    ((Map) objD).put(strG, objC);
                }
                if (objD2 != null) {
                    arrayDeque.addLast(objD);
                    objD = objC;
                }
            } else {
                if (objD instanceof List) {
                    bohVar.k();
                } else {
                    bohVar.l();
                }
                if (arrayDeque.isEmpty()) {
                    return objD;
                }
                objD = arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final void write(boj bojVar, Object obj) throws IOException {
        if (obj == null) {
            bojVar.g();
            return;
        }
        bkl bklVarB = this.f21707b.b(obj.getClass());
        if (!(bklVarB instanceof bmi)) {
            bklVarB.write(bojVar, obj);
        } else {
            bojVar.c();
            bojVar.e();
        }
    }
}
