package P8;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes4.dex */
public class l extends f {
    public l(i iVar, d dVar, int i9) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(dVar.f7361a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f7374a = iVar.k(byteBufferAllocate, dVar.f7364d + ((long) (i9 * dVar.f7367g)) + 28);
    }
}
