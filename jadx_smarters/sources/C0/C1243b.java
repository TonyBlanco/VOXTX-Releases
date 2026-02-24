package c0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: c0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1243b extends AbstractC1244c {
    public static C1243b h(ByteBuffer byteBuffer) {
        return i(byteBuffer, new C1243b());
    }

    public static C1243b i(ByteBuffer byteBuffer, C1243b c1243b) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return c1243b.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public C1243b f(int i9, ByteBuffer byteBuffer) {
        g(i9, byteBuffer);
        return this;
    }

    public void g(int i9, ByteBuffer byteBuffer) {
        c(i9, byteBuffer);
    }

    public C1242a j(C1242a c1242a, int i9) {
        int iB = b(6);
        if (iB != 0) {
            return c1242a.f(a(d(iB) + (i9 * 4)), this.f18179b);
        }
        return null;
    }

    public int k() {
        int iB = b(6);
        if (iB != 0) {
            return e(iB);
        }
        return 0;
    }

    public int l() {
        int iB = b(4);
        if (iB != 0) {
            return this.f18179b.getInt(iB + this.f18178a);
        }
        return 0;
    }
}
