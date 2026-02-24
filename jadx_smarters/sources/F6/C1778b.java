package f6;

import java.io.OutputStream;

/* JADX INFO: renamed from: f6.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1778b extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f40835a = 0;

    public long a() {
        return this.f40835a;
    }

    @Override // java.io.OutputStream
    public void write(int i9) {
        this.f40835a++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f40835a += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i9, int i10) {
        int i11;
        if (i9 < 0 || i9 > bArr.length || i10 < 0 || (i11 = i9 + i10) > bArr.length || i11 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f40835a += (long) i10;
    }
}
