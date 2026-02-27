package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
final class bob extends bkl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final bkm f21814a = new bnz(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bkl f21815b;

    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final /* bridge */ /* synthetic */ Object read(boh bohVar) throws IOException {
        Date date = (Date) this.f21815b.read(bohVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final /* bridge */ /* synthetic */ void write(boj bojVar, Object obj) throws IOException {
        this.f21815b.write(bojVar, (Timestamp) obj);
    }
}
