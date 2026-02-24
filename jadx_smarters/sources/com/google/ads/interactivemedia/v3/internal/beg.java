package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class beg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bfy f21136a = new bef(null);

    public static bgc a(bal balVar) {
        bac bacVar;
        bga bgaVar = new bga();
        bgaVar.b(balVar.b());
        Iterator it = balVar.d().iterator();
        while (it.hasNext()) {
            for (baj bajVar : (List) it.next()) {
                int iF = bajVar.f();
                int i9 = iF - 2;
                int i10 = bhs.f21407a;
                if (iF == 0) {
                    throw null;
                }
                if (i9 == 1) {
                    bacVar = bac.f20984a;
                } else if (i9 == 2) {
                    bacVar = bac.f20985b;
                } else {
                    if (i9 != 3) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    bacVar = bac.f20986c;
                }
                bgaVar.d(bacVar, bajVar.a(), bajVar.g());
            }
        }
        if (balVar.a() != null) {
            bgaVar.c(balVar.a().a());
        }
        try {
            return bgaVar.a();
        } catch (GeneralSecurityException e9) {
            throw new IllegalStateException(e9);
        }
    }
}
