package m3;

import O2.C0897l1;
import android.net.Uri;
import d3.AbstractC1677n;
import d3.InterfaceC1672i;
import d3.InterfaceC1673j;
import d3.InterfaceC1674k;
import d3.InterfaceC1678o;
import d3.t;
import d3.w;
import d4.AbstractC1684a;
import d4.M;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class d implements InterfaceC1672i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final InterfaceC1678o f44340d = new InterfaceC1678o() { // from class: m3.c
        @Override // d3.InterfaceC1678o
        public /* synthetic */ InterfaceC1672i[] a(Uri uri, Map map) {
            return AbstractC1677n.a(this, uri, map);
        }

        @Override // d3.InterfaceC1678o
        public final InterfaceC1672i[] b() {
            return d.e();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC1674k f44341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f44342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f44343c;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC1672i[] e() {
        return new InterfaceC1672i[]{new d()};
    }

    public static M f(M m9) {
        m9.U(0);
        return m9;
    }

    @Override // d3.InterfaceC1672i
    public void a(long j9, long j10) {
        i iVar = this.f44342b;
        if (iVar != null) {
            iVar.m(j9, j10);
        }
    }

    @Override // d3.InterfaceC1672i
    public void b(InterfaceC1674k interfaceC1674k) {
        this.f44341a = interfaceC1674k;
    }

    @Override // d3.InterfaceC1672i
    public int d(InterfaceC1673j interfaceC1673j, t tVar) throws C0897l1 {
        AbstractC1684a.i(this.f44341a);
        if (this.f44342b == null) {
            if (!g(interfaceC1673j)) {
                throw C0897l1.a("Failed to determine bitstream type", null);
            }
            interfaceC1673j.f();
        }
        if (!this.f44343c) {
            w wVarE = this.f44341a.e(0, 1);
            this.f44341a.q();
            this.f44342b.d(this.f44341a, wVarE);
            this.f44343c = true;
        }
        return this.f44342b.g(interfaceC1673j, tVar);
    }

    public final boolean g(InterfaceC1673j interfaceC1673j) {
        i hVar;
        f fVar = new f();
        if (fVar.a(interfaceC1673j, true) && (fVar.f44350b & 2) == 2) {
            int iMin = Math.min(fVar.f44357i, 8);
            M m9 = new M(iMin);
            interfaceC1673j.s(m9.e(), 0, iMin);
            if (b.p(f(m9))) {
                hVar = new b();
            } else if (j.r(f(m9))) {
                hVar = new j();
            } else if (h.o(f(m9))) {
                hVar = new h();
            }
            this.f44342b = hVar;
            return true;
        }
        return false;
    }

    @Override // d3.InterfaceC1672i
    public boolean h(InterfaceC1673j interfaceC1673j) {
        try {
            return g(interfaceC1673j);
        } catch (C0897l1 unused) {
            return false;
        }
    }

    @Override // d3.InterfaceC1672i
    public void release() {
    }
}
