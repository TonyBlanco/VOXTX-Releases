package D3;

import B3.X;
import D3.g;
import d3.C1671h;
import d3.w;
import d4.AbstractC1681B;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements g.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f1356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X[] f1357b;

    public c(int[] iArr, X[] xArr) {
        this.f1356a = iArr;
        this.f1357b = xArr;
    }

    public int[] a() {
        int[] iArr = new int[this.f1357b.length];
        int i9 = 0;
        while (true) {
            X[] xArr = this.f1357b;
            if (i9 >= xArr.length) {
                return iArr;
            }
            iArr[i9] = xArr[i9].G();
            i9++;
        }
    }

    public void b(long j9) {
        for (X x9 : this.f1357b) {
            x9.a0(j9);
        }
    }

    @Override // D3.g.b
    public w e(int i9, int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = this.f1356a;
            if (i11 >= iArr.length) {
                AbstractC1681B.d("BaseMediaChunkOutput", "Unmatched track of type: " + i10);
                return new C1671h();
            }
            if (i10 == iArr[i11]) {
                return this.f1357b[i11];
            }
            i11++;
        }
    }
}
