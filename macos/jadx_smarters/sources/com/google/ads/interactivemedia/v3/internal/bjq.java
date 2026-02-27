package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
final class bjq extends bkl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ bkl f21567a;

    public bjq(bkl bklVar) {
        this.f21567a = bklVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final /* bridge */ /* synthetic */ Object read(boh bohVar) throws IOException {
        return new AtomicLong(((Number) this.f21567a.read(bohVar)).longValue());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final /* bridge */ /* synthetic */ void write(boj bojVar, Object obj) throws IOException {
        this.f21567a.write(bojVar, Long.valueOf(((AtomicLong) obj).get()));
    }
}
