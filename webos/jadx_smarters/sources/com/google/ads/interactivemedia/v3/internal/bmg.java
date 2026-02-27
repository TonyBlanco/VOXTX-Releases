package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class bmg extends bkl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bkm f21702a = b(bki.LAZILY_PARSED_NUMBER);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bkj f21703b;

    private bmg(bkj bkjVar) {
        this.f21703b = bkjVar;
    }

    public static bkm a(bkj bkjVar) {
        return bkjVar == bki.LAZILY_PARSED_NUMBER ? f21702a : b(bkjVar);
    }

    private static bkm b(bkj bkjVar) {
        return new bmh(new bmg(bkjVar), 1);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final /* bridge */ /* synthetic */ Object read(boh bohVar) throws IOException {
        int iR = bohVar.r();
        int i9 = iR - 1;
        if (i9 == 5 || i9 == 6) {
            return this.f21703b.a(bohVar);
        }
        if (i9 == 8) {
            bohVar.m();
            return null;
        }
        throw new bkf("Expecting number, got: " + boi.a(iR) + "; at path " + bohVar.e());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final /* synthetic */ void write(boj bojVar, Object obj) throws IOException {
        bojVar.k((Number) obj);
    }
}
