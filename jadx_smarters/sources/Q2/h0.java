package Q2;

import Q2.InterfaceC1027m;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 extends G {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f7858i = Float.floatToIntBits(Float.NaN);

    public static void l(int i9, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i9) * 4.656612875245797E-10d));
        if (iFloatToIntBits == f7858i) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // Q2.InterfaceC1027m
    public void b(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferK;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i9 = iLimit - iPosition;
        int i10 = this.f7578b.f7889c;
        if (i10 == 536870912) {
            byteBufferK = k((i9 / 3) * 4);
            while (iPosition < iLimit) {
                l(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferK);
                iPosition += 3;
            }
        } else {
            if (i10 != 805306368) {
                throw new IllegalStateException();
            }
            byteBufferK = k(i9);
            while (iPosition < iLimit) {
                l((byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferK);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferK.flip();
    }

    @Override // Q2.G
    public InterfaceC1027m.a g(InterfaceC1027m.a aVar) throws InterfaceC1027m.b {
        int i9 = aVar.f7889c;
        if (d4.k0.C0(i9)) {
            return i9 != 4 ? new InterfaceC1027m.a(aVar.f7887a, aVar.f7888b, 4) : InterfaceC1027m.a.f7886e;
        }
        throw new InterfaceC1027m.b(aVar);
    }
}
