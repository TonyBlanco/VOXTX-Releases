package x6;

import org.apache.http.message.TokenParser;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f51964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f51965b;

    public i(int i9, int i10) {
        this.f51964a = i9;
        this.f51965b = i10;
    }

    public final int a() {
        return this.f51965b;
    }

    public abstract byte[] b();

    public abstract byte[] c(int i9, byte[] bArr);

    public final int d() {
        return this.f51964a;
    }

    public i e() {
        return new h(this);
    }

    public boolean f() {
        return false;
    }

    public i g() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public final String toString() {
        int i9 = this.f51964a;
        byte[] bArrC = new byte[i9];
        StringBuilder sb = new StringBuilder(this.f51965b * (i9 + 1));
        for (int i10 = 0; i10 < this.f51965b; i10++) {
            bArrC = c(i10, bArrC);
            for (int i11 = 0; i11 < this.f51964a; i11++) {
                int i12 = bArrC[i11] & 255;
                sb.append(i12 < 64 ? '#' : i12 < 128 ? '+' : i12 < 192 ? '.' : TokenParser.SP);
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
