package f4;

import O2.AbstractC0892k;
import O2.C0936z0;
import O2.D1;
import d4.M;
import d4.k0;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: f4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1774b extends AbstractC0892k {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final U2.g f40607q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final M f40608r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f40609s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public InterfaceC1773a f40610t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f40611u;

    public C1774b() {
        super(6);
        this.f40607q = new U2.g(1);
        this.f40608r = new M();
    }

    @Override // O2.AbstractC0892k
    public void G() {
        T();
    }

    @Override // O2.AbstractC0892k
    public void I(long j9, boolean z9) {
        this.f40611u = Long.MIN_VALUE;
        T();
    }

    @Override // O2.AbstractC0892k
    public void O(C0936z0[] c0936z0Arr, long j9, long j10) {
        this.f40609s = j10;
    }

    public final float[] S(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f40608r.S(byteBuffer.array(), byteBuffer.limit());
        this.f40608r.U(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i9 = 0; i9 < 3; i9++) {
            fArr[i9] = Float.intBitsToFloat(this.f40608r.u());
        }
        return fArr;
    }

    public final void T() {
        InterfaceC1773a interfaceC1773a = this.f40610t;
        if (interfaceC1773a != null) {
            interfaceC1773a.c();
        }
    }

    @Override // O2.E1
    public int a(C0936z0 c0936z0) {
        return D1.a("application/x-camera-motion".equals(c0936z0.f6467m) ? 4 : 0);
    }

    @Override // O2.C1
    public boolean d() {
        return h();
    }

    @Override // O2.C1
    public boolean e() {
        return true;
    }

    @Override // O2.C1, O2.E1
    public String getName() {
        return "CameraMotionRenderer";
    }

    @Override // O2.AbstractC0892k, O2.C0932x1.b
    public void n(int i9, Object obj) {
        if (i9 == 8) {
            this.f40610t = (InterfaceC1773a) obj;
        } else {
            super.n(i9, obj);
        }
    }

    @Override // O2.C1
    public void u(long j9, long j10) {
        while (!h() && this.f40611u < 100000 + j9) {
            this.f40607q.clear();
            if (P(B(), this.f40607q, 0) != -4 || this.f40607q.isEndOfStream()) {
                return;
            }
            U2.g gVar = this.f40607q;
            this.f40611u = gVar.f9701f;
            if (this.f40610t != null && !gVar.isDecodeOnly()) {
                this.f40607q.i();
                float[] fArrS = S((ByteBuffer) k0.j(this.f40607q.f9699d));
                if (fArrS != null) {
                    ((InterfaceC1773a) k0.j(this.f40610t)).b(this.f40611u - this.f40609s, fArrS);
                }
            }
        }
    }
}
