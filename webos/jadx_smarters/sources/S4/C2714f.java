package s4;

import com.google.android.gms.common.internal.AbstractC1418q;

/* JADX INFO: renamed from: s4.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2714f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f49948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f49949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f49950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f49951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f49952e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f49953f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2714f)) {
            return false;
        }
        C2714f c2714f = (C2714f) obj;
        return this.f49948a == c2714f.f49948a && this.f49949b == c2714f.f49949b && this.f49950c == c2714f.f49950c && this.f49951d == c2714f.f49951d && this.f49952e == c2714f.f49952e && this.f49953f == c2714f.f49953f;
    }

    public final int hashCode() {
        return AbstractC1418q.c(Integer.valueOf(this.f49948a), Integer.valueOf(this.f49949b), Integer.valueOf(this.f49950c), Integer.valueOf(this.f49951d), Integer.valueOf(this.f49952e), Boolean.valueOf(this.f49953f));
    }
}
