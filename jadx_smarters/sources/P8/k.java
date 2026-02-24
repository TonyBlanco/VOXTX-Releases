package P8;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes4.dex */
public class k extends e {
    public k(i iVar, d dVar, long j9) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(dVar.f7361a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j10 = dVar.f7363c + (j9 * ((long) dVar.f7365e));
        this.f7370a = iVar.k(byteBufferAllocate, j10);
        this.f7371b = iVar.i(byteBufferAllocate, 8 + j10);
        this.f7372c = iVar.i(byteBufferAllocate, 16 + j10);
        this.f7373d = iVar.i(byteBufferAllocate, j10 + 40);
    }
}
