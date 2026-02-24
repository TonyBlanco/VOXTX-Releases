package b4;

import b4.O;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public class O {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Comparator f17533h = new Comparator() { // from class: b4.M
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return O.g((O.b) obj, (O.b) obj2);
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Comparator f17534i = new Comparator() { // from class: b4.N
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return O.h((O.b) obj, (O.b) obj2);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17535a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17539e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f17540f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f17541g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b[] f17537c = new b[5];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f17536b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17538d = -1;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f17542a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f17543b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f17544c;

        public b() {
        }
    }

    public O(int i9) {
        this.f17535a = i9;
    }

    public static /* synthetic */ int g(b bVar, b bVar2) {
        return bVar.f17542a - bVar2.f17542a;
    }

    public static /* synthetic */ int h(b bVar, b bVar2) {
        return Float.compare(bVar.f17544c, bVar2.f17544c);
    }

    public void c(int i9, float f9) {
        b bVar;
        int i10;
        b bVar2;
        int i11;
        d();
        int i12 = this.f17541g;
        if (i12 > 0) {
            b[] bVarArr = this.f17537c;
            int i13 = i12 - 1;
            this.f17541g = i13;
            bVar = bVarArr[i13];
        } else {
            bVar = new b();
        }
        int i14 = this.f17539e;
        this.f17539e = i14 + 1;
        bVar.f17542a = i14;
        bVar.f17543b = i9;
        bVar.f17544c = f9;
        this.f17536b.add(bVar);
        int i15 = this.f17540f + i9;
        while (true) {
            this.f17540f = i15;
            while (true) {
                int i16 = this.f17540f;
                int i17 = this.f17535a;
                if (i16 <= i17) {
                    return;
                }
                i10 = i16 - i17;
                bVar2 = (b) this.f17536b.get(0);
                i11 = bVar2.f17543b;
                if (i11 <= i10) {
                    this.f17540f -= i11;
                    this.f17536b.remove(0);
                    int i18 = this.f17541g;
                    if (i18 < 5) {
                        b[] bVarArr2 = this.f17537c;
                        this.f17541g = i18 + 1;
                        bVarArr2[i18] = bVar2;
                    }
                }
            }
            bVar2.f17543b = i11 - i10;
            i15 = this.f17540f - i10;
        }
    }

    public final void d() {
        if (this.f17538d != 1) {
            Collections.sort(this.f17536b, f17533h);
            this.f17538d = 1;
        }
    }

    public final void e() {
        if (this.f17538d != 0) {
            Collections.sort(this.f17536b, f17534i);
            this.f17538d = 0;
        }
    }

    public float f(float f9) {
        e();
        float f10 = f9 * this.f17540f;
        int i9 = 0;
        for (int i10 = 0; i10 < this.f17536b.size(); i10++) {
            b bVar = (b) this.f17536b.get(i10);
            i9 += bVar.f17543b;
            if (i9 >= f10) {
                return bVar.f17544c;
            }
        }
        if (this.f17536b.isEmpty()) {
            return Float.NaN;
        }
        return ((b) this.f17536b.get(r5.size() - 1)).f17544c;
    }

    public void i() {
        this.f17536b.clear();
        this.f17538d = -1;
        this.f17539e = 0;
        this.f17540f = 0;
    }
}
