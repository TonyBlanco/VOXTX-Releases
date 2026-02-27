package p3;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: p3.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2406l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f46286a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f46287b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f46288c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f46289d = new int[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f46290e;

    public C2406l() {
        this.f46290e = r0.length - 1;
    }

    public void a(int i9) {
        if (this.f46288c == this.f46289d.length) {
            c();
        }
        int i10 = (this.f46287b + 1) & this.f46290e;
        this.f46287b = i10;
        this.f46289d[i10] = i9;
        this.f46288c++;
    }

    public void b() {
        this.f46286a = 0;
        this.f46287b = -1;
        this.f46288c = 0;
    }

    public final void c() {
        int[] iArr = this.f46289d;
        int length = iArr.length << 1;
        if (length < 0) {
            throw new IllegalStateException();
        }
        int[] iArr2 = new int[length];
        int length2 = iArr.length;
        int i9 = this.f46286a;
        int i10 = length2 - i9;
        System.arraycopy(iArr, i9, iArr2, 0, i10);
        System.arraycopy(this.f46289d, 0, iArr2, i10, i9);
        this.f46286a = 0;
        this.f46287b = this.f46288c - 1;
        this.f46289d = iArr2;
        this.f46290e = iArr2.length - 1;
    }

    public boolean d() {
        return this.f46288c == 0;
    }

    public int e() {
        int i9 = this.f46288c;
        if (i9 == 0) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f46289d;
        int i10 = this.f46286a;
        int i11 = iArr[i10];
        this.f46286a = (i10 + 1) & this.f46290e;
        this.f46288c = i9 - 1;
        return i11;
    }
}
