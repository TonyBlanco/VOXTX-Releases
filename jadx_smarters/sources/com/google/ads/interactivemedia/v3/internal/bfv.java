package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
final class bfv implements bam {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f21224a;

    static {
        Logger.getLogger(bfv.class.getName());
        f21224a = new byte[]{0};
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bam
    public final Class a() {
        return bag.class;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bam
    public final Class b() {
        return bag.class;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bam
    public final /* bridge */ /* synthetic */ Object c(bal balVar) throws GeneralSecurityException {
        Iterator it = balVar.d().iterator();
        while (it.hasNext()) {
            for (baj bajVar : (List) it.next()) {
                if (bajVar.b() instanceof bft) {
                    bft bftVar = (bft) bajVar.b();
                    bjj bjjVarB = bjj.b(bajVar.e());
                    if (!bjjVarB.equals(bftVar.b())) {
                        throw new GeneralSecurityException("Mac Key with parameters " + String.valueOf(bftVar.c()) + " has wrong output prefix (" + bftVar.b().toString() + ") instead of (" + bjjVarB.toString() + ")");
                    }
                }
            }
        }
        return new bfu(balVar);
    }
}
