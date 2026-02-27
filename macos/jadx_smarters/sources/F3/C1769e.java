package f3;

import com.google.android.exoplayer2.extractor.g;
import d3.InterfaceC1673j;
import d3.u;
import d3.w;
import d4.AbstractC1684a;
import d4.k0;
import java.util.Arrays;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: renamed from: f3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1769e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f40591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f40593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f40594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f40595e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f40596f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f40597g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f40598h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f40599i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f40600j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long[] f40601k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f40602l;

    public C1769e(int i9, int i10, long j9, int i11, w wVar) {
        boolean z9 = true;
        if (i10 != 1 && i10 != 2) {
            z9 = false;
        }
        AbstractC1684a.a(z9);
        this.f40594d = j9;
        this.f40595e = i11;
        this.f40591a = wVar;
        this.f40592b = d(i9, i10 == 2 ? 1667497984 : 1651965952);
        this.f40593c = i10 == 2 ? d(i9, 1650720768) : -1;
        this.f40601k = new long[IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED];
        this.f40602l = new int[IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED];
    }

    public static int d(int i9, int i10) {
        return (((i9 % 10) + 48) << 8) | ((i9 / 10) + 48) | i10;
    }

    public void a() {
        this.f40598h++;
    }

    public void b(long j9) {
        if (this.f40600j == this.f40602l.length) {
            long[] jArr = this.f40601k;
            this.f40601k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.f40602l;
            this.f40602l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.f40601k;
        int i9 = this.f40600j;
        jArr2[i9] = j9;
        this.f40602l[i9] = this.f40599i;
        this.f40600j = i9 + 1;
    }

    public void c() {
        this.f40601k = Arrays.copyOf(this.f40601k, this.f40600j);
        this.f40602l = Arrays.copyOf(this.f40602l, this.f40600j);
    }

    public final long e(int i9) {
        return (this.f40594d * ((long) i9)) / ((long) this.f40595e);
    }

    public long f() {
        return e(this.f40598h);
    }

    public long g() {
        return e(1);
    }

    public final u h(int i9) {
        return new u(((long) this.f40602l[i9]) * g(), this.f40601k[i9]);
    }

    public g.a i(long j9) {
        int iG = (int) (j9 / g());
        int iH = k0.h(this.f40602l, iG, true, true);
        if (this.f40602l[iH] == iG) {
            return new g.a(h(iH));
        }
        u uVarH = h(iH);
        int i9 = iH + 1;
        return i9 < this.f40601k.length ? new g.a(uVarH, h(i9)) : new g.a(uVarH);
    }

    public boolean j(int i9) {
        return this.f40592b == i9 || this.f40593c == i9;
    }

    public void k() {
        this.f40599i++;
    }

    public boolean l() {
        return Arrays.binarySearch(this.f40602l, this.f40598h) >= 0;
    }

    public boolean m(InterfaceC1673j interfaceC1673j) {
        int i9 = this.f40597g;
        int iA = i9 - this.f40591a.a(interfaceC1673j, i9, false);
        this.f40597g = iA;
        boolean z9 = iA == 0;
        if (z9) {
            if (this.f40596f > 0) {
                this.f40591a.f(f(), l() ? 1 : 0, this.f40596f, 0, null);
            }
            a();
        }
        return z9;
    }

    public void n(int i9) {
        this.f40596f = i9;
        this.f40597g = i9;
    }

    public void o(long j9) {
        int i9;
        if (this.f40600j == 0) {
            i9 = 0;
        } else {
            i9 = this.f40602l[k0.i(this.f40601k, j9, true, true)];
        }
        this.f40598h = i9;
    }
}
