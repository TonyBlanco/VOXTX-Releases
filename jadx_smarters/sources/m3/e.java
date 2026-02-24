package m3;

import d3.AbstractC1675l;
import d3.InterfaceC1673j;
import d4.AbstractC1684a;
import d4.M;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f44344a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M f44345b = new M(new byte[65025], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f44346c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f44347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f44348e;

    public final int a(int i9) {
        int i10;
        int i11 = 0;
        this.f44347d = 0;
        do {
            int i12 = this.f44347d;
            int i13 = i9 + i12;
            f fVar = this.f44344a;
            if (i13 >= fVar.f44355g) {
                break;
            }
            int[] iArr = fVar.f44358j;
            this.f44347d = i12 + 1;
            i10 = iArr[i12 + i9];
            i11 += i10;
        } while (i10 == 255);
        return i11;
    }

    public f b() {
        return this.f44344a;
    }

    public M c() {
        return this.f44345b;
    }

    public boolean d(InterfaceC1673j interfaceC1673j) {
        int i9;
        AbstractC1684a.g(interfaceC1673j != null);
        if (this.f44348e) {
            this.f44348e = false;
            this.f44345b.Q(0);
        }
        while (!this.f44348e) {
            if (this.f44346c < 0) {
                if (!this.f44344a.c(interfaceC1673j) || !this.f44344a.a(interfaceC1673j, true)) {
                    return false;
                }
                f fVar = this.f44344a;
                int iA = fVar.f44356h;
                if ((fVar.f44350b & 1) == 1 && this.f44345b.g() == 0) {
                    iA += a(0);
                    i9 = this.f44347d;
                } else {
                    i9 = 0;
                }
                if (!AbstractC1675l.e(interfaceC1673j, iA)) {
                    return false;
                }
                this.f44346c = i9;
            }
            int iA2 = a(this.f44346c);
            int i10 = this.f44346c + this.f44347d;
            if (iA2 > 0) {
                M m9 = this.f44345b;
                m9.c(m9.g() + iA2);
                if (!AbstractC1675l.d(interfaceC1673j, this.f44345b.e(), this.f44345b.g(), iA2)) {
                    return false;
                }
                M m10 = this.f44345b;
                m10.T(m10.g() + iA2);
                this.f44348e = this.f44344a.f44358j[i10 + (-1)] != 255;
            }
            if (i10 == this.f44344a.f44355g) {
                i10 = -1;
            }
            this.f44346c = i10;
        }
        return true;
    }

    public void e() {
        this.f44344a.b();
        this.f44345b.Q(0);
        this.f44346c = -1;
        this.f44348e = false;
    }

    public void f() {
        if (this.f44345b.e().length == 65025) {
            return;
        }
        M m9 = this.f44345b;
        m9.S(Arrays.copyOf(m9.e(), Math.max(65025, this.f44345b.g())), this.f44345b.g());
    }
}
