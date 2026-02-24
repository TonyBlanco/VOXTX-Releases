package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class vj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f24845b;

    public vj(long j9, long j10) {
        this.f24844a = j9;
        this.f24845b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vj)) {
            return false;
        }
        vj vjVar = (vj) obj;
        return this.f24844a == vjVar.f24844a && this.f24845b == vjVar.f24845b;
    }

    public final int hashCode() {
        return (((int) this.f24844a) * 31) + ((int) this.f24845b);
    }
}
