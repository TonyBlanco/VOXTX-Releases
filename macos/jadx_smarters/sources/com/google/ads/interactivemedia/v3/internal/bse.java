package com.google.ads.interactivemedia.v3.internal;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
final class bse extends bou {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final bsg f22207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    box f22208b = b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ bsh f22209c;

    public bse(bsh bshVar) {
        this.f22209c = bshVar;
        this.f22207a = new bsg(bshVar);
    }

    private final box b() {
        bsg bsgVar = this.f22207a;
        if (bsgVar.hasNext()) {
            return bsgVar.next().iterator();
        }
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.box
    public final byte a() {
        box boxVar = this.f22208b;
        if (boxVar == null) {
            throw new NoSuchElementException();
        }
        byte bA = boxVar.a();
        if (!this.f22208b.hasNext()) {
            this.f22208b = b();
        }
        return bA;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f22208b != null;
    }
}
