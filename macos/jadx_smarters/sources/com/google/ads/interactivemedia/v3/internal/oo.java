package com.google.ads.interactivemedia.v3.internal;

import java.io.EOFException;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class oo implements ox {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f23933b = {8, 13, 11, 2, 0, 1, 7};

    private static void b(int i9, List list) {
        int[] iArr = f23933b;
        for (int i10 = 0; i10 < 7; i10++) {
            if (iArr[i10] == i9) {
                Integer numValueOf = Integer.valueOf(i9);
                if (list.contains(numValueOf)) {
                    return;
                }
                list.add(numValueOf);
                return;
            }
        }
    }

    private static boolean c(zh zhVar, zi ziVar) throws IOException {
        try {
            boolean zC = zhVar.C(ziVar);
            ziVar.h();
            return zC;
        } catch (EOFException unused) {
            ziVar.h();
            return false;
        } catch (Throwable th) {
            ziVar.h();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.ads.interactivemedia.v3.internal.on a(android.net.Uri r18, com.google.ads.interactivemedia.v3.internal.C1333s r19, java.util.List r20, com.google.ads.interactivemedia.v3.internal.co r21, java.util.Map r22, com.google.ads.interactivemedia.v3.internal.zi r23) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.oo.a(android.net.Uri, com.google.ads.interactivemedia.v3.internal.s, java.util.List, com.google.ads.interactivemedia.v3.internal.co, java.util.Map, com.google.ads.interactivemedia.v3.internal.zi):com.google.ads.interactivemedia.v3.internal.on");
    }
}
