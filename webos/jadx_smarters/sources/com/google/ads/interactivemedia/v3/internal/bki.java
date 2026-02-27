package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public enum bki implements bkj {
    DOUBLE,
    LAZILY_PARSED_NUMBER,
    LONG_OR_DOUBLE,
    BIG_DECIMAL;

    public static final Double b(boh bohVar) throws IOException {
        return Double.valueOf(bohVar.a());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkj
    public final /* synthetic */ Number a(boh bohVar) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return b(bohVar);
        }
        if (iOrdinal == 1) {
            return new blb(bohVar.h());
        }
        if (iOrdinal != 2) {
            throw null;
        }
        throw null;
    }
}
