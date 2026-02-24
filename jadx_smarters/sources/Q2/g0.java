package Q2;

import Q2.InterfaceC1027m;
import d4.AbstractC1684a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class g0 implements InterfaceC1027m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f7838c = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f7839d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InterfaceC1027m.a f7840e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InterfaceC1027m.a f7841f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InterfaceC1027m.a f7842g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InterfaceC1027m.a f7843h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f7844i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f0 f7845j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ByteBuffer f7846k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ShortBuffer f7847l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ByteBuffer f7848m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f7849n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f7850o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f7851p;

    public g0() {
        InterfaceC1027m.a aVar = InterfaceC1027m.a.f7886e;
        this.f7840e = aVar;
        this.f7841f = aVar;
        this.f7842g = aVar;
        this.f7843h = aVar;
        ByteBuffer byteBuffer = InterfaceC1027m.f7885a;
        this.f7846k = byteBuffer;
        this.f7847l = byteBuffer.asShortBuffer();
        this.f7848m = byteBuffer;
        this.f7837b = -1;
    }

    @Override // Q2.InterfaceC1027m
    public final ByteBuffer a() {
        int iK;
        f0 f0Var = this.f7845j;
        if (f0Var != null && (iK = f0Var.k()) > 0) {
            if (this.f7846k.capacity() < iK) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iK).order(ByteOrder.nativeOrder());
                this.f7846k = byteBufferOrder;
                this.f7847l = byteBufferOrder.asShortBuffer();
            } else {
                this.f7846k.clear();
                this.f7847l.clear();
            }
            f0Var.j(this.f7847l);
            this.f7850o += (long) iK;
            this.f7846k.limit(iK);
            this.f7848m = this.f7846k;
        }
        ByteBuffer byteBuffer = this.f7848m;
        this.f7848m = InterfaceC1027m.f7885a;
        return byteBuffer;
    }

    @Override // Q2.InterfaceC1027m
    public final void b(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            f0 f0Var = (f0) AbstractC1684a.e(this.f7845j);
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f7849n += (long) iRemaining;
            f0Var.t(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // Q2.InterfaceC1027m
    public final void c() {
        f0 f0Var = this.f7845j;
        if (f0Var != null) {
            f0Var.s();
        }
        this.f7851p = true;
    }

    @Override // Q2.InterfaceC1027m
    public final boolean d() {
        f0 f0Var;
        return this.f7851p && ((f0Var = this.f7845j) == null || f0Var.k() == 0);
    }

    @Override // Q2.InterfaceC1027m
    public final InterfaceC1027m.a e(InterfaceC1027m.a aVar) throws InterfaceC1027m.b {
        if (aVar.f7889c != 2) {
            throw new InterfaceC1027m.b(aVar);
        }
        int i9 = this.f7837b;
        if (i9 == -1) {
            i9 = aVar.f7887a;
        }
        this.f7840e = aVar;
        InterfaceC1027m.a aVar2 = new InterfaceC1027m.a(i9, aVar.f7888b, 2);
        this.f7841f = aVar2;
        this.f7844i = true;
        return aVar2;
    }

    public final long f(long j9) {
        if (this.f7850o < 1024) {
            return (long) (((double) this.f7838c) * j9);
        }
        long jL = this.f7849n - ((long) ((f0) AbstractC1684a.e(this.f7845j)).l());
        int i9 = this.f7843h.f7887a;
        int i10 = this.f7842g.f7887a;
        return i9 == i10 ? d4.k0.c1(j9, jL, this.f7850o) : d4.k0.c1(j9, jL * ((long) i9), this.f7850o * ((long) i10));
    }

    @Override // Q2.InterfaceC1027m
    public final void flush() {
        if (isActive()) {
            InterfaceC1027m.a aVar = this.f7840e;
            this.f7842g = aVar;
            InterfaceC1027m.a aVar2 = this.f7841f;
            this.f7843h = aVar2;
            if (this.f7844i) {
                this.f7845j = new f0(aVar.f7887a, aVar.f7888b, this.f7838c, this.f7839d, aVar2.f7887a);
            } else {
                f0 f0Var = this.f7845j;
                if (f0Var != null) {
                    f0Var.i();
                }
            }
        }
        this.f7848m = InterfaceC1027m.f7885a;
        this.f7849n = 0L;
        this.f7850o = 0L;
        this.f7851p = false;
    }

    public final void g(float f9) {
        if (this.f7839d != f9) {
            this.f7839d = f9;
            this.f7844i = true;
        }
    }

    public final void h(float f9) {
        if (this.f7838c != f9) {
            this.f7838c = f9;
            this.f7844i = true;
        }
    }

    @Override // Q2.InterfaceC1027m
    public final boolean isActive() {
        return this.f7841f.f7887a != -1 && (Math.abs(this.f7838c - 1.0f) >= 1.0E-4f || Math.abs(this.f7839d - 1.0f) >= 1.0E-4f || this.f7841f.f7887a != this.f7840e.f7887a);
    }

    @Override // Q2.InterfaceC1027m
    public final void reset() {
        this.f7838c = 1.0f;
        this.f7839d = 1.0f;
        InterfaceC1027m.a aVar = InterfaceC1027m.a.f7886e;
        this.f7840e = aVar;
        this.f7841f = aVar;
        this.f7842g = aVar;
        this.f7843h = aVar;
        ByteBuffer byteBuffer = InterfaceC1027m.f7885a;
        this.f7846k = byteBuffer;
        this.f7847l = byteBuffer.asShortBuffer();
        this.f7848m = byteBuffer;
        this.f7837b = -1;
        this.f7844i = false;
        this.f7845j = null;
        this.f7849n = 0L;
        this.f7850o = 0L;
        this.f7851p = false;
    }
}
