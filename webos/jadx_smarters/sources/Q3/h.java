package q3;

import d4.AbstractC1684a;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h implements InterfaceC2542c {
    @Override // q3.InterfaceC2542c
    public final C2540a a(C2544e c2544e) {
        ByteBuffer byteBuffer = (ByteBuffer) AbstractC1684a.e(c2544e.f9699d);
        AbstractC1684a.a(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (c2544e.isDecodeOnly()) {
            return null;
        }
        return b(c2544e, byteBuffer);
    }

    public abstract C2540a b(C2544e c2544e, ByteBuffer byteBuffer);
}
