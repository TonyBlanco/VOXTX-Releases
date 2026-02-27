package F6;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f2044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f2045b;

    public d(a aVar) {
        this.f2044a = aVar;
        ArrayList arrayList = new ArrayList();
        this.f2045b = arrayList;
        arrayList.add(new b(aVar, new int[]{1}));
    }

    public final b a(int i9) {
        if (i9 >= this.f2045b.size()) {
            List list = this.f2045b;
            b bVarI = (b) list.get(list.size() - 1);
            for (int size = this.f2045b.size(); size <= i9; size++) {
                a aVar = this.f2044a;
                bVarI = bVarI.i(new b(aVar, new int[]{1, aVar.c((size - 1) + aVar.d())}));
                this.f2045b.add(bVarI);
            }
        }
        return (b) this.f2045b.get(i9);
    }

    public void b(int[] iArr, int i9) {
        if (i9 == 0) {
            throw new IllegalArgumentException("No error correction bytes");
        }
        int length = iArr.length - i9;
        if (length <= 0) {
            throw new IllegalArgumentException("No data bytes provided");
        }
        b bVarA = a(i9);
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        int[] iArrE = new b(this.f2044a, iArr2).j(i9, 1).b(bVarA)[1].e();
        int length2 = i9 - iArrE.length;
        for (int i10 = 0; i10 < length2; i10++) {
            iArr[length + i10] = 0;
        }
        System.arraycopy(iArrE, 0, iArr, length + length2, iArrE.length);
    }
}
