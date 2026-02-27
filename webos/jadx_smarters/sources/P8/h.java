package P8;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes4.dex */
public class h extends d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i f7376j;

    public h(boolean z9, i iVar) {
        this.f7361a = z9;
        this.f7376j = iVar;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(z9 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f7362b = iVar.h(byteBufferAllocate, 16L);
        this.f7363c = iVar.i(byteBufferAllocate, 32L);
        this.f7364d = iVar.i(byteBufferAllocate, 40L);
        this.f7365e = iVar.h(byteBufferAllocate, 54L);
        this.f7366f = iVar.h(byteBufferAllocate, 56L);
        this.f7367g = iVar.h(byteBufferAllocate, 58L);
        this.f7368h = iVar.h(byteBufferAllocate, 60L);
        this.f7369i = iVar.h(byteBufferAllocate, 62L);
    }

    @Override // P8.d
    public c a(long j9, int i9) {
        return new b(this.f7376j, this, j9, i9);
    }

    @Override // P8.d
    public e b(long j9) {
        return new k(this.f7376j, this, j9);
    }

    @Override // P8.d
    public f c(int i9) {
        return new m(this.f7376j, this, i9);
    }
}
