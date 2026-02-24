package Y3;

import d4.AbstractC1684a;
import d4.k0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements P3.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10675a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f10676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f10677d;

    public k(List list) {
        this.f10675a = Collections.unmodifiableList(new ArrayList(list));
        this.f10676c = new long[list.size() * 2];
        for (int i9 = 0; i9 < list.size(); i9++) {
            e eVar = (e) list.get(i9);
            int i10 = i9 * 2;
            long[] jArr = this.f10676c;
            jArr[i10] = eVar.f10646b;
            jArr[i10 + 1] = eVar.f10647c;
        }
        long[] jArr2 = this.f10676c;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f10677d = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    public static /* synthetic */ int e(e eVar, e eVar2) {
        return Long.compare(eVar.f10646b, eVar2.f10646b);
    }

    @Override // P3.i
    public int a(long j9) {
        int iE = k0.e(this.f10677d, j9, false, false);
        if (iE < this.f10677d.length) {
            return iE;
        }
        return -1;
    }

    @Override // P3.i
    public List b(long j9) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i9 = 0; i9 < this.f10675a.size(); i9++) {
            long[] jArr = this.f10676c;
            int i10 = i9 * 2;
            if (jArr[i10] <= j9 && j9 < jArr[i10 + 1]) {
                e eVar = (e) this.f10675a.get(i9);
                P3.b bVar = eVar.f10645a;
                if (bVar.f7196f == -3.4028235E38f) {
                    arrayList2.add(eVar);
                } else {
                    arrayList.add(bVar);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: Y3.j
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return k.e((e) obj, (e) obj2);
            }
        });
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            arrayList.add(((e) arrayList2.get(i11)).f10645a.b().h((-1) - i11, 1).a());
        }
        return arrayList;
    }

    @Override // P3.i
    public long c(int i9) {
        AbstractC1684a.a(i9 >= 0);
        AbstractC1684a.a(i9 < this.f10677d.length);
        return this.f10677d[i9];
    }

    @Override // P3.i
    public int h() {
        return this.f10677d.length;
    }
}
