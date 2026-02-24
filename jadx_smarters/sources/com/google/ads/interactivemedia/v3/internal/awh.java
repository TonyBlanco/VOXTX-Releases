package com.google.ads.interactivemedia.v3.internal;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
final class awh extends axq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f20847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f20848b;

    public awh(Object obj) {
        this.f20848b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f20847a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f20847a) {
            throw new NoSuchElementException();
        }
        this.f20847a = true;
        return this.f20848b;
    }
}
