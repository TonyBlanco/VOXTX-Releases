package c0;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: c0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1242a extends AbstractC1244c {
    public C1242a f(int i9, ByteBuffer byteBuffer) {
        g(i9, byteBuffer);
        return this;
    }

    public void g(int i9, ByteBuffer byteBuffer) {
        c(i9, byteBuffer);
    }

    public int h(int i9) {
        int iB = b(16);
        if (iB != 0) {
            return this.f18179b.getInt(d(iB) + (i9 * 4));
        }
        return 0;
    }

    public int i() {
        int iB = b(16);
        if (iB != 0) {
            return e(iB);
        }
        return 0;
    }

    public boolean j() {
        int iB = b(6);
        return (iB == 0 || this.f18179b.get(iB + this.f18178a) == 0) ? false : true;
    }

    public short k() {
        int iB = b(14);
        if (iB != 0) {
            return this.f18179b.getShort(iB + this.f18178a);
        }
        return (short) 0;
    }

    public int l() {
        int iB = b(4);
        if (iB != 0) {
            return this.f18179b.getInt(iB + this.f18178a);
        }
        return 0;
    }

    public short m() {
        int iB = b(8);
        if (iB != 0) {
            return this.f18179b.getShort(iB + this.f18178a);
        }
        return (short) 0;
    }

    public short n() {
        int iB = b(12);
        if (iB != 0) {
            return this.f18179b.getShort(iB + this.f18178a);
        }
        return (short) 0;
    }
}
