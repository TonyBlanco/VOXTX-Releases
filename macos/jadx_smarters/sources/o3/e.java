package o3;

import com.google.android.exoplayer2.extractor.g;
import d3.u;
import d4.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f45808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f45809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f45810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f45811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f45812e;

    public e(c cVar, int i9, long j9, long j10) {
        this.f45808a = cVar;
        this.f45809b = i9;
        this.f45810c = j9;
        long j11 = (j10 - j9) / ((long) cVar.f45803e);
        this.f45811d = j11;
        this.f45812e = a(j11);
    }

    public final long a(long j9) {
        return k0.c1(j9 * ((long) this.f45809b), 1000000L, this.f45808a.f45801c);
    }

    @Override // com.google.android.exoplayer2.extractor.g
    public g.a e(long j9) {
        long jS = k0.s((((long) this.f45808a.f45801c) * j9) / (((long) this.f45809b) * 1000000), 0L, this.f45811d - 1);
        long j10 = this.f45810c + (((long) this.f45808a.f45803e) * jS);
        long jA = a(jS);
        u uVar = new u(jA, j10);
        if (jA >= j9 || jS == this.f45811d - 1) {
            return new g.a(uVar);
        }
        long j11 = jS + 1;
        return new g.a(uVar, new u(a(j11), this.f45810c + (((long) this.f45808a.f45803e) * j11)));
    }

    @Override // com.google.android.exoplayer2.extractor.g
    public boolean g() {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.g
    public long i() {
        return this.f45812e;
    }
}
