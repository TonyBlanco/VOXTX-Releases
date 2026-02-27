package B3;

import android.util.SparseArray;
import d4.AbstractC1684a;
import d4.InterfaceC1692i;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1692i f565c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f564b = new SparseArray();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f563a = -1;

    public e0(InterfaceC1692i interfaceC1692i) {
        this.f565c = interfaceC1692i;
    }

    public void a(int i9, Object obj) {
        if (this.f563a == -1) {
            AbstractC1684a.g(this.f564b.size() == 0);
            this.f563a = 0;
        }
        if (this.f564b.size() > 0) {
            SparseArray sparseArray = this.f564b;
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            AbstractC1684a.a(i9 >= iKeyAt);
            if (iKeyAt == i9) {
                InterfaceC1692i interfaceC1692i = this.f565c;
                SparseArray sparseArray2 = this.f564b;
                interfaceC1692i.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f564b.append(i9, obj);
    }

    public void b() {
        for (int i9 = 0; i9 < this.f564b.size(); i9++) {
            this.f565c.accept(this.f564b.valueAt(i9));
        }
        this.f563a = -1;
        this.f564b.clear();
    }

    public void c(int i9) {
        for (int size = this.f564b.size() - 1; size >= 0 && i9 < this.f564b.keyAt(size); size--) {
            this.f565c.accept(this.f564b.valueAt(size));
            this.f564b.removeAt(size);
        }
        this.f563a = this.f564b.size() > 0 ? Math.min(this.f563a, this.f564b.size() - 1) : -1;
    }

    public void d(int i9) {
        int i10 = 0;
        while (i10 < this.f564b.size() - 1) {
            int i11 = i10 + 1;
            if (i9 < this.f564b.keyAt(i11)) {
                return;
            }
            this.f565c.accept(this.f564b.valueAt(i10));
            this.f564b.removeAt(i10);
            int i12 = this.f563a;
            if (i12 > 0) {
                this.f563a = i12 - 1;
            }
            i10 = i11;
        }
    }

    public Object e(int i9) {
        if (this.f563a == -1) {
            this.f563a = 0;
        }
        while (true) {
            int i10 = this.f563a;
            if (i10 <= 0 || i9 >= this.f564b.keyAt(i10)) {
                break;
            }
            this.f563a--;
        }
        while (this.f563a < this.f564b.size() - 1 && i9 >= this.f564b.keyAt(this.f563a + 1)) {
            this.f563a++;
        }
        return this.f564b.valueAt(this.f563a);
    }

    public Object f() {
        return this.f564b.valueAt(r0.size() - 1);
    }

    public boolean g() {
        return this.f564b.size() == 0;
    }
}
