package Q2;

import Q2.InterfaceC1027m;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes3.dex */
public abstract class G implements InterfaceC1027m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC1027m.a f7578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC1027m.a f7579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC1027m.a f7580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InterfaceC1027m.a f7581e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ByteBuffer f7582f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteBuffer f7583g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f7584h;

    public G() {
        ByteBuffer byteBuffer = InterfaceC1027m.f7885a;
        this.f7582f = byteBuffer;
        this.f7583g = byteBuffer;
        InterfaceC1027m.a aVar = InterfaceC1027m.a.f7886e;
        this.f7580d = aVar;
        this.f7581e = aVar;
        this.f7578b = aVar;
        this.f7579c = aVar;
    }

    @Override // Q2.InterfaceC1027m
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f7583g;
        this.f7583g = InterfaceC1027m.f7885a;
        return byteBuffer;
    }

    @Override // Q2.InterfaceC1027m
    public final void c() {
        this.f7584h = true;
        i();
    }

    @Override // Q2.InterfaceC1027m
    public boolean d() {
        return this.f7584h && this.f7583g == InterfaceC1027m.f7885a;
    }

    @Override // Q2.InterfaceC1027m
    public final InterfaceC1027m.a e(InterfaceC1027m.a aVar) {
        this.f7580d = aVar;
        this.f7581e = g(aVar);
        return isActive() ? this.f7581e : InterfaceC1027m.a.f7886e;
    }

    public final boolean f() {
        return this.f7583g.hasRemaining();
    }

    @Override // Q2.InterfaceC1027m
    public final void flush() {
        this.f7583g = InterfaceC1027m.f7885a;
        this.f7584h = false;
        this.f7578b = this.f7580d;
        this.f7579c = this.f7581e;
        h();
    }

    public abstract InterfaceC1027m.a g(InterfaceC1027m.a aVar);

    public void h() {
    }

    public void i() {
    }

    @Override // Q2.InterfaceC1027m
    public boolean isActive() {
        return this.f7581e != InterfaceC1027m.a.f7886e;
    }

    public void j() {
    }

    public final ByteBuffer k(int i9) {
        if (this.f7582f.capacity() < i9) {
            this.f7582f = ByteBuffer.allocateDirect(i9).order(ByteOrder.nativeOrder());
        } else {
            this.f7582f.clear();
        }
        ByteBuffer byteBuffer = this.f7582f;
        this.f7583g = byteBuffer;
        return byteBuffer;
    }

    @Override // Q2.InterfaceC1027m
    public final void reset() {
        flush();
        this.f7582f = InterfaceC1027m.f7885a;
        InterfaceC1027m.a aVar = InterfaceC1027m.a.f7886e;
        this.f7580d = aVar;
        this.f7581e = aVar;
        this.f7578b = aVar;
        this.f7579c = aVar;
        j();
    }
}
