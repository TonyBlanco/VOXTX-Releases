package Q2;

import Q2.InterfaceC1027m;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 extends G {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f7872i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f7873j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f7874k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7875l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f7876m = d4.k0.f39782f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f7877n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f7878o;

    @Override // Q2.G, Q2.InterfaceC1027m
    public ByteBuffer a() {
        int i9;
        if (super.d() && (i9 = this.f7877n) > 0) {
            k(i9).put(this.f7876m, 0, this.f7877n).flip();
            this.f7877n = 0;
        }
        return super.a();
    }

    @Override // Q2.InterfaceC1027m
    public void b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i9 = iLimit - iPosition;
        if (i9 == 0) {
            return;
        }
        int iMin = Math.min(i9, this.f7875l);
        this.f7878o += (long) (iMin / this.f7578b.f7890d);
        this.f7875l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f7875l > 0) {
            return;
        }
        int i10 = i9 - iMin;
        int length = (this.f7877n + i10) - this.f7876m.length;
        ByteBuffer byteBufferK = k(length);
        int iR = d4.k0.r(length, 0, this.f7877n);
        byteBufferK.put(this.f7876m, 0, iR);
        int iR2 = d4.k0.r(length - iR, 0, i10);
        byteBuffer.limit(byteBuffer.position() + iR2);
        byteBufferK.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i11 = i10 - iR2;
        int i12 = this.f7877n - iR;
        this.f7877n = i12;
        byte[] bArr = this.f7876m;
        System.arraycopy(bArr, iR, bArr, 0, i12);
        byteBuffer.get(this.f7876m, this.f7877n, i11);
        this.f7877n += i11;
        byteBufferK.flip();
    }

    @Override // Q2.G, Q2.InterfaceC1027m
    public boolean d() {
        return super.d() && this.f7877n == 0;
    }

    @Override // Q2.G
    public InterfaceC1027m.a g(InterfaceC1027m.a aVar) throws InterfaceC1027m.b {
        if (aVar.f7889c != 2) {
            throw new InterfaceC1027m.b(aVar);
        }
        this.f7874k = true;
        return (this.f7872i == 0 && this.f7873j == 0) ? InterfaceC1027m.a.f7886e : aVar;
    }

    @Override // Q2.G
    public void h() {
        if (this.f7874k) {
            this.f7874k = false;
            int i9 = this.f7873j;
            int i10 = this.f7578b.f7890d;
            this.f7876m = new byte[i9 * i10];
            this.f7875l = this.f7872i * i10;
        }
        this.f7877n = 0;
    }

    @Override // Q2.G
    public void i() {
        if (this.f7874k) {
            int i9 = this.f7877n;
            if (i9 > 0) {
                this.f7878o += (long) (i9 / this.f7578b.f7890d);
            }
            this.f7877n = 0;
        }
    }

    @Override // Q2.G
    public void j() {
        this.f7876m = d4.k0.f39782f;
    }

    public long l() {
        return this.f7878o;
    }

    public void m() {
        this.f7878o = 0L;
    }

    public void n(int i9, int i10) {
        this.f7872i = i9;
        this.f7873j = i10;
    }
}
