package Q2;

import Q2.InterfaceC1027m;
import d4.AbstractC1684a;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class H extends G {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f7585i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f7586j;

    @Override // Q2.InterfaceC1027m
    public void b(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) AbstractC1684a.e(this.f7586j);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferK = k(((iLimit - iPosition) / this.f7578b.f7890d) * this.f7579c.f7890d);
        while (iPosition < iLimit) {
            for (int i9 : iArr) {
                byteBufferK.putShort(byteBuffer.getShort((i9 * 2) + iPosition));
            }
            iPosition += this.f7578b.f7890d;
        }
        byteBuffer.position(iLimit);
        byteBufferK.flip();
    }

    @Override // Q2.G
    public InterfaceC1027m.a g(InterfaceC1027m.a aVar) throws InterfaceC1027m.b {
        int[] iArr = this.f7585i;
        if (iArr == null) {
            return InterfaceC1027m.a.f7886e;
        }
        if (aVar.f7889c != 2) {
            throw new InterfaceC1027m.b(aVar);
        }
        boolean z9 = aVar.f7888b != iArr.length;
        int i9 = 0;
        while (i9 < iArr.length) {
            int i10 = iArr[i9];
            if (i10 >= aVar.f7888b) {
                throw new InterfaceC1027m.b(aVar);
            }
            z9 |= i10 != i9;
            i9++;
        }
        return z9 ? new InterfaceC1027m.a(aVar.f7887a, iArr.length, 2) : InterfaceC1027m.a.f7886e;
    }

    @Override // Q2.G
    public void h() {
        this.f7586j = this.f7585i;
    }

    @Override // Q2.G
    public void j() {
        this.f7586j = null;
        this.f7585i = null;
    }

    public void l(int[] iArr) {
        this.f7585i = iArr;
    }
}
