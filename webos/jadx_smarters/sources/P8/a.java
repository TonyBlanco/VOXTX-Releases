package P8;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes4.dex */
public class a extends c {
    public a(i iVar, d dVar, long j9, int i9) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(dVar.f7361a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j10 = j9 + ((long) (i9 * 8));
        this.f7359a = iVar.k(byteBufferAllocate, j10);
        this.f7360b = iVar.k(byteBufferAllocate, j10 + 4);
    }
}
