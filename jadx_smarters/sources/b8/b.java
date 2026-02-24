package B8;

import java.util.NoSuchElementException;
import l8.x;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f760a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f763e;

    public b(int i9, int i10, int i11) {
        this.f760a = i11;
        this.f761c = i10;
        boolean z9 = false;
        if (i11 <= 0 ? i9 >= i10 : i9 <= i10) {
            z9 = true;
        }
        this.f762d = z9;
        this.f763e = z9 ? i9 : i10;
    }

    @Override // l8.x
    public int b() {
        int i9 = this.f763e;
        if (i9 != this.f761c) {
            this.f763e = this.f760a + i9;
        } else {
            if (!this.f762d) {
                throw new NoSuchElementException();
            }
            this.f762d = false;
        }
        return i9;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f762d;
    }
}
