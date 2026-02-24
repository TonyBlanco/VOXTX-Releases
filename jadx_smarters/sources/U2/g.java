package U2;

import O2.AbstractC0928w0;
import O2.C0936z0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class g extends U2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0936z0 f9697a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f9698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ByteBuffer f9699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f9700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f9701f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteBuffer f9702g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f9703h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f9704i;

    public static final class a extends IllegalStateException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9705a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f9706c;

        public a(int i9, int i10) {
            super("Buffer too small (" + i9 + " < " + i10 + ")");
            this.f9705a = i9;
            this.f9706c = i10;
        }
    }

    static {
        AbstractC0928w0.a("goog.exo.decoder");
    }

    public g(int i9) {
        this(i9, 0);
    }

    public g(int i9, int i10) {
        this.f9698c = new c();
        this.f9703h = i9;
        this.f9704i = i10;
    }

    public static g l() {
        return new g(0);
    }

    @Override // U2.a
    public void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.f9699d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f9702g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f9700e = false;
    }

    public final ByteBuffer d(int i9) {
        int i10 = this.f9703h;
        if (i10 == 1) {
            return ByteBuffer.allocate(i9);
        }
        if (i10 == 2) {
            return ByteBuffer.allocateDirect(i9);
        }
        ByteBuffer byteBuffer = this.f9699d;
        throw new a(byteBuffer == null ? 0 : byteBuffer.capacity(), i9);
    }

    public void e(int i9) {
        int i10 = i9 + this.f9704i;
        ByteBuffer byteBuffer = this.f9699d;
        if (byteBuffer == null) {
            this.f9699d = d(i10);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i11 = i10 + iPosition;
        if (iCapacity >= i11) {
            this.f9699d = byteBuffer;
            return;
        }
        ByteBuffer byteBufferD = d(i11);
        byteBufferD.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferD.put(byteBuffer);
        }
        this.f9699d = byteBufferD;
    }

    public final void i() {
        ByteBuffer byteBuffer = this.f9699d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f9702g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean j() {
        return getFlag(1073741824);
    }

    public void n(int i9) {
        ByteBuffer byteBuffer = this.f9702g;
        if (byteBuffer == null || byteBuffer.capacity() < i9) {
            this.f9702g = ByteBuffer.allocate(i9);
        } else {
            this.f9702g.clear();
        }
    }
}
