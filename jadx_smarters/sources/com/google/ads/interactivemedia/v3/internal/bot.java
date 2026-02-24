package com.google.ads.interactivemedia.v3.internal;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
final class bot extends bou {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ bpb f21863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f21864b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f21865c;

    public bot(bpb bpbVar) {
        this.f21863a = bpbVar;
        this.f21865c = bpbVar.d();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.box
    public final byte a() {
        int i9 = this.f21864b;
        if (i9 >= this.f21865c) {
            throw new NoSuchElementException();
        }
        this.f21864b = i9 + 1;
        return this.f21863a.b(i9);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21864b < this.f21865c;
    }
}
