package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public class am {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f20173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f20176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20177e;

    public am(am amVar) {
        this.f20173a = amVar.f20173a;
        this.f20174b = amVar.f20174b;
        this.f20175c = amVar.f20175c;
        this.f20176d = amVar.f20176d;
        this.f20177e = amVar.f20177e;
    }

    public am(Object obj, int i9, int i10, long j9) {
        this(obj, i9, i10, j9, -1);
    }

    private am(Object obj, int i9, int i10, long j9, int i11) {
        this.f20173a = obj;
        this.f20174b = i9;
        this.f20175c = i10;
        this.f20176d = j9;
        this.f20177e = i11;
    }

    public am(Object obj, long j9) {
        this(obj, -1, -1, j9, -1);
    }

    public am(Object obj, long j9, int i9) {
        this(obj, -1, -1, j9, i9);
    }

    public final am a(Object obj) {
        return this.f20173a.equals(obj) ? this : new am(obj, this.f20174b, this.f20175c, this.f20176d, this.f20177e);
    }

    public final boolean b() {
        return this.f20174b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof am)) {
            return false;
        }
        am amVar = (am) obj;
        return this.f20173a.equals(amVar.f20173a) && this.f20174b == amVar.f20174b && this.f20175c == amVar.f20175c && this.f20176d == amVar.f20176d && this.f20177e == amVar.f20177e;
    }

    public final int hashCode() {
        return ((((((((this.f20173a.hashCode() + 527) * 31) + this.f20174b) * 31) + this.f20175c) * 31) + ((int) this.f20176d)) * 31) + this.f20177e;
    }
}
