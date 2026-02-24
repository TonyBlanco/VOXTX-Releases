package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.atf;

/* JADX INFO: loaded from: classes3.dex */
@atf(a = ab.class)
public abstract class bk {
    public static bk create(long j9, bi biVar, bj bjVar) {
        return new ab(j9, biVar, bjVar, null);
    }

    public static bk create(long j9, bi biVar, bj bjVar, bo boVar) {
        return new ab(j9, biVar, bjVar, boVar);
    }

    public static bk create(long j9, bi biVar, bj bjVar, Throwable th) {
        return create(j9, biVar, bjVar, bo.create(th));
    }

    public abstract bi component();

    public abstract bo loggableException();

    public abstract bj method();

    public abstract long timestamp();
}
