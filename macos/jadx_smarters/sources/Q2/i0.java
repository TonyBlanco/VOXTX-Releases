package Q2;

import Q2.InterfaceC1027m;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 extends G {
    @Override // Q2.InterfaceC1027m
    public void b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i9 = iLimit - iPosition;
        int i10 = this.f7578b.f7889c;
        if (i10 == 3) {
            i9 *= 2;
        } else if (i10 == 4) {
            i9 /= 2;
        } else if (i10 != 268435456) {
            if (i10 != 536870912) {
                if (i10 != 805306368) {
                    throw new IllegalStateException();
                }
                i9 /= 2;
            } else {
                i9 /= 3;
                i9 *= 2;
            }
        }
        ByteBuffer byteBufferK = k(i9);
        int i11 = this.f7578b.f7889c;
        if (i11 == 3) {
            while (iPosition < iLimit) {
                byteBufferK.put((byte) 0);
                byteBufferK.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        } else if (i11 == 4) {
            while (iPosition < iLimit) {
                short sQ = (short) (d4.k0.q(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                byteBufferK.put((byte) (sQ & 255));
                byteBufferK.put((byte) ((sQ >> 8) & 255));
                iPosition += 4;
            }
        } else if (i11 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferK.put(byteBuffer.get(iPosition + 1));
                byteBufferK.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i11 == 536870912) {
            while (iPosition < iLimit) {
                byteBufferK.put(byteBuffer.get(iPosition + 1));
                byteBufferK.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else {
            if (i11 != 805306368) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                byteBufferK.put(byteBuffer.get(iPosition + 2));
                byteBufferK.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferK.flip();
    }

    @Override // Q2.G
    public InterfaceC1027m.a g(InterfaceC1027m.a aVar) throws InterfaceC1027m.b {
        int i9 = aVar.f7889c;
        if (i9 == 3 || i9 == 2 || i9 == 268435456 || i9 == 536870912 || i9 == 805306368 || i9 == 4) {
            return i9 != 2 ? new InterfaceC1027m.a(aVar.f7887a, aVar.f7888b, 2) : InterfaceC1027m.a.f7886e;
        }
        throw new InterfaceC1027m.b(aVar);
    }
}
