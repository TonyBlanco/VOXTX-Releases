package Q2;

import Q2.InterfaceC1027m;
import d4.AbstractC1684a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import s5.AbstractC2743y;

/* JADX INFO: renamed from: Q2.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1026l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC2743y f7879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f7880b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ByteBuffer[] f7881c = new ByteBuffer[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC1027m.a f7882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InterfaceC1027m.a f7883e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f7884f;

    public C1026l(AbstractC2743y abstractC2743y) {
        this.f7879a = abstractC2743y;
        InterfaceC1027m.a aVar = InterfaceC1027m.a.f7886e;
        this.f7882d = aVar;
        this.f7883e = aVar;
        this.f7884f = false;
    }

    public InterfaceC1027m.a a(InterfaceC1027m.a aVar) throws InterfaceC1027m.b {
        if (aVar.equals(InterfaceC1027m.a.f7886e)) {
            throw new InterfaceC1027m.b(aVar);
        }
        for (int i9 = 0; i9 < this.f7879a.size(); i9++) {
            InterfaceC1027m interfaceC1027m = (InterfaceC1027m) this.f7879a.get(i9);
            InterfaceC1027m.a aVarE = interfaceC1027m.e(aVar);
            if (interfaceC1027m.isActive()) {
                AbstractC1684a.g(!aVarE.equals(InterfaceC1027m.a.f7886e));
                aVar = aVarE;
            }
        }
        this.f7883e = aVar;
        return aVar;
    }

    public void b() {
        this.f7880b.clear();
        this.f7882d = this.f7883e;
        this.f7884f = false;
        for (int i9 = 0; i9 < this.f7879a.size(); i9++) {
            InterfaceC1027m interfaceC1027m = (InterfaceC1027m) this.f7879a.get(i9);
            interfaceC1027m.flush();
            if (interfaceC1027m.isActive()) {
                this.f7880b.add(interfaceC1027m);
            }
        }
        this.f7881c = new ByteBuffer[this.f7880b.size()];
        for (int i10 = 0; i10 <= c(); i10++) {
            this.f7881c[i10] = ((InterfaceC1027m) this.f7880b.get(i10)).a();
        }
    }

    public final int c() {
        return this.f7881c.length - 1;
    }

    public ByteBuffer d() {
        if (!f()) {
            return InterfaceC1027m.f7885a;
        }
        ByteBuffer byteBuffer = this.f7881c[c()];
        if (!byteBuffer.hasRemaining()) {
            g(InterfaceC1027m.f7885a);
        }
        return byteBuffer;
    }

    public boolean e() {
        return this.f7884f && ((InterfaceC1027m) this.f7880b.get(c())).d() && !this.f7881c[c()].hasRemaining();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1026l)) {
            return false;
        }
        C1026l c1026l = (C1026l) obj;
        if (this.f7879a.size() != c1026l.f7879a.size()) {
            return false;
        }
        for (int i9 = 0; i9 < this.f7879a.size(); i9++) {
            if (this.f7879a.get(i9) != c1026l.f7879a.get(i9)) {
                return false;
            }
        }
        return true;
    }

    public boolean f() {
        return !this.f7880b.isEmpty();
    }

    public final void g(ByteBuffer byteBuffer) {
        boolean z9;
        for (boolean z10 = true; z10; z10 = z9) {
            z9 = false;
            int i9 = 0;
            while (i9 <= c()) {
                if (!this.f7881c[i9].hasRemaining()) {
                    InterfaceC1027m interfaceC1027m = (InterfaceC1027m) this.f7880b.get(i9);
                    if (!interfaceC1027m.d()) {
                        ByteBuffer byteBuffer2 = i9 > 0 ? this.f7881c[i9 - 1] : byteBuffer.hasRemaining() ? byteBuffer : InterfaceC1027m.f7885a;
                        long jRemaining = byteBuffer2.remaining();
                        interfaceC1027m.b(byteBuffer2);
                        this.f7881c[i9] = interfaceC1027m.a();
                        z9 |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.f7881c[i9].hasRemaining();
                    } else if (!this.f7881c[i9].hasRemaining() && i9 < c()) {
                        ((InterfaceC1027m) this.f7880b.get(i9 + 1)).c();
                    }
                }
                i9++;
            }
        }
    }

    public void h() {
        if (!f() || this.f7884f) {
            return;
        }
        this.f7884f = true;
        ((InterfaceC1027m) this.f7880b.get(0)).c();
    }

    public int hashCode() {
        return this.f7879a.hashCode();
    }

    public void i(ByteBuffer byteBuffer) {
        if (!f() || this.f7884f) {
            return;
        }
        g(byteBuffer);
    }

    public void j() {
        for (int i9 = 0; i9 < this.f7879a.size(); i9++) {
            InterfaceC1027m interfaceC1027m = (InterfaceC1027m) this.f7879a.get(i9);
            interfaceC1027m.flush();
            interfaceC1027m.reset();
        }
        this.f7881c = new ByteBuffer[0];
        InterfaceC1027m.a aVar = InterfaceC1027m.a.f7886e;
        this.f7882d = aVar;
        this.f7883e = aVar;
        this.f7884f = false;
    }
}
