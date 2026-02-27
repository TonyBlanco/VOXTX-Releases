package k3;

import android.util.Pair;
import com.google.android.exoplayer2.extractor.g;
import d3.u;
import d4.k0;
import v3.k;

/* JADX INFO: renamed from: k3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2140c implements InterfaceC2144g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f43540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f43541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f43542c;

    public C2140c(long[] jArr, long[] jArr2, long j9) {
        this.f43540a = jArr;
        this.f43541b = jArr2;
        this.f43542c = j9 == -9223372036854775807L ? k0.P0(jArr2[jArr2.length - 1]) : j9;
    }

    public static C2140c a(long j9, k kVar, long j10) {
        int length = kVar.f51323f.length;
        int i9 = length + 1;
        long[] jArr = new long[i9];
        long[] jArr2 = new long[i9];
        jArr[0] = j9;
        long j11 = 0;
        jArr2[0] = 0;
        for (int i10 = 1; i10 <= length; i10++) {
            int i11 = i10 - 1;
            j9 += (long) (kVar.f51321d + kVar.f51323f[i11]);
            j11 += (long) (kVar.f51322e + kVar.f51324g[i11]);
            jArr[i10] = j9;
            jArr2[i10] = j11;
        }
        return new C2140c(jArr, jArr2, j10);
    }

    public static Pair b(long j9, long[] jArr, long[] jArr2) {
        Long lValueOf;
        Long lValueOf2;
        int i9 = k0.i(jArr, j9, true, true);
        long j10 = jArr[i9];
        long j11 = jArr2[i9];
        int i10 = i9 + 1;
        if (i10 == jArr.length) {
            lValueOf = Long.valueOf(j10);
            lValueOf2 = Long.valueOf(j11);
        } else {
            long j12 = jArr[i10];
            long j13 = jArr2[i10];
            double d9 = j12 == j10 ? 0.0d : (j9 - j10) / (j12 - j10);
            lValueOf = Long.valueOf(j9);
            lValueOf2 = Long.valueOf(((long) (d9 * (j13 - j11))) + j11);
        }
        return Pair.create(lValueOf, lValueOf2);
    }

    @Override // k3.InterfaceC2144g
    public long c(long j9) {
        return k0.P0(((Long) b(j9, this.f43540a, this.f43541b).second).longValue());
    }

    @Override // com.google.android.exoplayer2.extractor.g
    public g.a e(long j9) {
        Pair pairB = b(k0.x1(k0.s(j9, 0L, this.f43542c)), this.f43541b, this.f43540a);
        return new g.a(new u(k0.P0(((Long) pairB.first).longValue()), ((Long) pairB.second).longValue()));
    }

    @Override // k3.InterfaceC2144g
    public long f() {
        return -1L;
    }

    @Override // com.google.android.exoplayer2.extractor.g
    public boolean g() {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.g
    public long i() {
        return this.f43542c;
    }
}
