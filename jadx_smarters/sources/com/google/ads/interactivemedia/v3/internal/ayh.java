package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
final class ayh extends ayg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AtomicIntegerFieldUpdater f20937a;

    public ayh(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.f20937a = atomicIntegerFieldUpdater;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ayg
    public final int a(ayj ayjVar) {
        return this.f20937a.decrementAndGet(ayjVar);
    }
}
