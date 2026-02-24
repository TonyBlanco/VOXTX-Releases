package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class hl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hl f23172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final hl f23173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f23174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f23175d;

    static {
        hl hlVar = new hl(0L, 0L);
        f23172a = hlVar;
        new hl(Long.MAX_VALUE, Long.MAX_VALUE);
        new hl(Long.MAX_VALUE, 0L);
        new hl(0L, Long.MAX_VALUE);
        f23173b = hlVar;
    }

    public hl(long j9, long j10) {
        af.u(j9 >= 0);
        af.u(j10 >= 0);
        this.f23174c = j9;
        this.f23175d = j10;
    }

    public final long a(long j9, long j10, long j11) {
        long j12 = this.f23174c;
        if (j12 == 0 && this.f23175d == 0) {
            return j9;
        }
        long jAw = cq.aw(j9, j12);
        long jAn = cq.an(j9, this.f23175d);
        boolean z9 = jAw <= j10 && j10 <= jAn;
        boolean z10 = jAw <= j11 && j11 <= jAn;
        return (z9 && z10) ? Math.abs(j10 - j9) <= Math.abs(j11 - j9) ? j10 : j11 : z9 ? j10 : z10 ? j11 : jAw;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hl.class == obj.getClass()) {
            hl hlVar = (hl) obj;
            if (this.f23174c == hlVar.f23174c && this.f23175d == hlVar.f23175d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f23174c) * 31) + ((int) this.f23175d);
    }
}
