package c0;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: c0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1244c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer f18179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AbstractC1245d f18182e = AbstractC1245d.a();

    public int a(int i9) {
        return i9 + this.f18179b.getInt(i9);
    }

    public int b(int i9) {
        if (i9 < this.f18181d) {
            return this.f18179b.getShort(this.f18180c + i9);
        }
        return 0;
    }

    public void c(int i9, ByteBuffer byteBuffer) {
        short s9;
        this.f18179b = byteBuffer;
        if (byteBuffer != null) {
            this.f18178a = i9;
            int i10 = i9 - byteBuffer.getInt(i9);
            this.f18180c = i10;
            s9 = this.f18179b.getShort(i10);
        } else {
            s9 = 0;
            this.f18178a = 0;
            this.f18180c = 0;
        }
        this.f18181d = s9;
    }

    public int d(int i9) {
        int i10 = i9 + this.f18178a;
        return i10 + this.f18179b.getInt(i10) + 4;
    }

    public int e(int i9) {
        int i10 = i9 + this.f18178a;
        return this.f18179b.getInt(i10 + this.f18179b.getInt(i10));
    }
}
