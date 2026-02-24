package Q2;

import d4.AbstractC1684a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ByteBuffer f7781a = InterfaceC1027m.f7885a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7783c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7782b = 2;

    public void a(U2.g gVar) {
        AbstractC1684a.e(gVar.f9699d);
        if (gVar.f9699d.limit() - gVar.f9699d.position() == 0) {
            return;
        }
        this.f7781a = b(gVar.f9699d);
        gVar.clear();
        gVar.e(this.f7781a.remaining());
        gVar.f9699d.put(this.f7781a);
        gVar.i();
    }

    public final ByteBuffer b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i9 = iLimit - iPosition;
        int i10 = (i9 + 255) / 255;
        ByteBuffer byteBufferC = c(i10 + 27 + i9);
        byteBufferC.put((byte) 79);
        byteBufferC.put((byte) 103);
        byteBufferC.put((byte) 103);
        byteBufferC.put((byte) 83);
        byteBufferC.put((byte) 0);
        byteBufferC.put((byte) 0);
        int iH = this.f7783c + d0.h(byteBuffer);
        this.f7783c = iH;
        byteBufferC.putLong(iH);
        byteBufferC.putInt(0);
        byteBufferC.putInt(this.f7782b);
        this.f7782b++;
        byteBufferC.putInt(0);
        byteBufferC.put((byte) i10);
        for (int i11 = 0; i11 < i10; i11++) {
            if (i9 >= 255) {
                byteBufferC.put((byte) -1);
                i9 -= 255;
            } else {
                byteBufferC.put((byte) i9);
                i9 = 0;
            }
        }
        while (iPosition < iLimit) {
            byteBufferC.put(byteBuffer.get(iPosition));
            iPosition++;
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferC.flip();
        byteBufferC.putInt(22, d4.k0.u(byteBufferC.array(), byteBufferC.arrayOffset(), byteBufferC.limit() - byteBufferC.position(), 0));
        byteBufferC.position(0);
        return byteBufferC;
    }

    public final ByteBuffer c(int i9) {
        if (this.f7781a.capacity() < i9) {
            this.f7781a = ByteBuffer.allocate(i9).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f7781a.clear();
        }
        return this.f7781a;
    }

    public void d() {
        this.f7781a = InterfaceC1027m.f7885a;
        this.f7783c = 0;
        this.f7782b = 2;
    }
}
