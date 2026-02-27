package P8;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes4.dex */
public class g extends d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i f7375j;

    public g(boolean z9, i iVar) {
        this.f7361a = z9;
        this.f7375j = iVar;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(z9 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f7362b = iVar.h(byteBufferAllocate, 16L);
        this.f7363c = iVar.k(byteBufferAllocate, 28L);
        this.f7364d = iVar.k(byteBufferAllocate, 32L);
        this.f7365e = iVar.h(byteBufferAllocate, 42L);
        this.f7366f = iVar.h(byteBufferAllocate, 44L);
        this.f7367g = iVar.h(byteBufferAllocate, 46L);
        this.f7368h = iVar.h(byteBufferAllocate, 48L);
        this.f7369i = iVar.h(byteBufferAllocate, 50L);
    }

    @Override // P8.d
    public c a(long j9, int i9) {
        return new a(this.f7375j, this, j9, i9);
    }

    @Override // P8.d
    public e b(long j9) {
        return new j(this.f7375j, this, j9);
    }

    @Override // P8.d
    public f c(int i9) {
        return new l(this.f7375j, this, i9);
    }
}
