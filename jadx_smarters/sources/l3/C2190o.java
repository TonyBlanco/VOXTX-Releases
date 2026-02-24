package l3;

import O2.C0936z0;

/* JADX INFO: renamed from: l3.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2190o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f44033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f44034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f44035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0936z0 f44036f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f44037g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long[] f44038h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long[] f44039i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f44040j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p[] f44041k;

    public C2190o(int i9, int i10, long j9, long j10, long j11, C0936z0 c0936z0, int i11, p[] pVarArr, int i12, long[] jArr, long[] jArr2) {
        this.f44031a = i9;
        this.f44032b = i10;
        this.f44033c = j9;
        this.f44034d = j10;
        this.f44035e = j11;
        this.f44036f = c0936z0;
        this.f44037g = i11;
        this.f44041k = pVarArr;
        this.f44040j = i12;
        this.f44038h = jArr;
        this.f44039i = jArr2;
    }

    public p a(int i9) {
        p[] pVarArr = this.f44041k;
        if (pVarArr == null) {
            return null;
        }
        return pVarArr[i9];
    }
}
