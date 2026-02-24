package X6;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[][] f10466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10468c;

    public b(int i9, int i10) {
        this.f10466a = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i10, i9);
        this.f10467b = i9;
        this.f10468c = i10;
    }

    public void a(byte b9) {
        for (byte[] bArr : this.f10466a) {
            Arrays.fill(bArr, b9);
        }
    }

    public byte b(int i9, int i10) {
        return this.f10466a[i10][i9];
    }

    public byte[][] c() {
        return this.f10466a;
    }

    public int d() {
        return this.f10468c;
    }

    public int e() {
        return this.f10467b;
    }

    public void f(int i9, int i10, int i11) {
        this.f10466a[i10][i9] = (byte) i11;
    }

    public void g(int i9, int i10, boolean z9) {
        this.f10466a[i10][i9] = z9 ? (byte) 1 : (byte) 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((this.f10467b * 2 * this.f10468c) + 2);
        for (int i9 = 0; i9 < this.f10468c; i9++) {
            byte[] bArr = this.f10466a[i9];
            for (int i10 = 0; i10 < this.f10467b; i10++) {
                byte b9 = bArr[i10];
                sb.append(b9 != 0 ? b9 != 1 ? "  " : " 1" : " 0");
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
