package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
final class akh implements ayr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f20024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ akl f20025b;

    public akh(akl aklVar, String str) {
        this.f20025b = aklVar;
        this.f20024a = str;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ayr
    public final void a(Throwable th) {
        com.google.ads.interactivemedia.v3.impl.data.m.b("Failure to make Native-layer network request", th);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ayr
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.f20025b.f20029b.o(new ajr(ajp.nativeXhr, ajq.nativeResponse, this.f20024a, (com.google.ads.interactivemedia.v3.impl.data.br) obj));
    }
}
