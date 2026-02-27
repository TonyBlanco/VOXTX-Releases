package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class bpz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final brs f22019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final bqm f22020b;

    public bpz() {
    }

    public bpz(brs brsVar, brs brsVar2, bqm bqmVar) {
        this();
        if (brsVar == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
        if (bqmVar.f22106c == btk.f22275k && brsVar2 == null) {
            throw new IllegalArgumentException("Null messageDefaultInstance");
        }
        this.f22019a = brsVar2;
        this.f22020b = bqmVar;
    }

    public final btk a() {
        return this.f22020b.f22106c;
    }

    public final boolean b() {
        return this.f22020b.f22107d;
    }
}
