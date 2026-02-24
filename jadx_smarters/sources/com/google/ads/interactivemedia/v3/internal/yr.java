package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class yr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f25196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f25198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f25199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f25200e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f25201f;

    private yr(List list, int i9, int i10, int i11, float f9, String str) {
        this.f25196a = list;
        this.f25197b = i9;
        this.f25198c = i10;
        this.f25199d = i11;
        this.f25200e = f9;
        this.f25201f = str;
    }

    public static yr a(cj cjVar) throws as {
        String strA;
        int i9;
        int i10;
        float f9;
        try {
            cjVar.G(4);
            int i11 = (cjVar.i() & 3) + 1;
            if (i11 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int i12 = cjVar.i() & 31;
            for (int i13 = 0; i13 < i12; i13++) {
                arrayList.add(b(cjVar));
            }
            int i14 = cjVar.i();
            for (int i15 = 0; i15 < i14; i15++) {
                arrayList.add(b(cjVar));
            }
            if (i12 > 0) {
                zv zvVarC = zw.c((byte[]) arrayList.get(0), i11, ((byte[]) arrayList.get(0)).length);
                int i16 = zvVarC.f25303e;
                int i17 = zvVarC.f25304f;
                float f10 = zvVarC.f25305g;
                strA = bo.a(zvVarC.f25299a, zvVarC.f25300b, zvVarC.f25301c);
                i9 = i16;
                i10 = i17;
                f9 = f10;
            } else {
                strA = null;
                i9 = -1;
                i10 = -1;
                f9 = 1.0f;
            }
            return new yr(arrayList, i11, i9, i10, f9, strA);
        } catch (ArrayIndexOutOfBoundsException e9) {
            throw as.a("Error parsing AVC config", e9);
        }
    }

    private static byte[] b(cj cjVar) {
        int iM = cjVar.m();
        int iC = cjVar.c();
        cjVar.G(iM);
        return bo.c(cjVar.H(), iC, iM);
    }
}
