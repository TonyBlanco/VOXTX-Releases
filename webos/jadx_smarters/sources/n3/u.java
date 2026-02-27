package n3;

import d4.AbstractC1684a;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f45232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f45233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f45234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f45235e;

    public u(int i9, int i10) {
        this.f45231a = i9;
        byte[] bArr = new byte[i10 + 3];
        this.f45234d = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i9, int i10) {
        if (this.f45232b) {
            int i11 = i10 - i9;
            byte[] bArr2 = this.f45234d;
            int length = bArr2.length;
            int i12 = this.f45235e;
            if (length < i12 + i11) {
                this.f45234d = Arrays.copyOf(bArr2, (i12 + i11) * 2);
            }
            System.arraycopy(bArr, i9, this.f45234d, this.f45235e, i11);
            this.f45235e += i11;
        }
    }

    public boolean b(int i9) {
        if (!this.f45232b) {
            return false;
        }
        this.f45235e -= i9;
        this.f45232b = false;
        this.f45233c = true;
        return true;
    }

    public boolean c() {
        return this.f45233c;
    }

    public void d() {
        this.f45232b = false;
        this.f45233c = false;
    }

    public void e(int i9) {
        AbstractC1684a.g(!this.f45232b);
        boolean z9 = i9 == this.f45231a;
        this.f45232b = z9;
        if (z9) {
            this.f45235e = 3;
            this.f45233c = false;
        }
    }
}
