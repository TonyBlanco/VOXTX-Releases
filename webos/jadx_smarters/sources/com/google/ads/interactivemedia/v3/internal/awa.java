package com.google.ads.interactivemedia.v3.internal;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
final class awa extends avr {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Comparator f20837a;

    public awa(awb awbVar) {
        super(awbVar);
        this.f20837a = awbVar.comparator();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avr
    public final /* bridge */ /* synthetic */ avq a(int i9) {
        return new avz(this.f20837a);
    }
}
