package z3;

import O2.H0;
import b4.C1227s;
import c4.C1257c;
import c4.C1265k;
import d4.AbstractC1684a;
import d4.Q;
import d4.k0;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import z3.InterfaceC3021A;

/* JADX INFO: renamed from: z3.F, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3026F implements InterfaceC3021A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f52664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1227s f52665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1257c f52666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1265k f52667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InterfaceC3021A.a f52668e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Q f52669f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f52670g;

    /* JADX INFO: renamed from: z3.F$a */
    public class a extends Q {
        public a() {
        }

        @Override // d4.Q
        public void c() {
            C3026F.this.f52667d.b();
        }

        @Override // d4.Q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Void d() throws IOException {
            C3026F.this.f52667d.a();
            return null;
        }
    }

    public C3026F(H0 h02, C1257c.C0215c c0215c, Executor executor) {
        this.f52664a = (Executor) AbstractC1684a.e(executor);
        AbstractC1684a.e(h02.f5528c);
        C1227s c1227sA = new C1227s.b().i(h02.f5528c.f5625a).f(h02.f5528c.f5630g).b(4).a();
        this.f52665b = c1227sA;
        C1257c c1257cC = c0215c.c();
        this.f52666c = c1257cC;
        this.f52667d = new C1265k(c1257cC, c1227sA, null, new C1265k.a() { // from class: z3.E
            @Override // c4.C1265k.a
            public final void a(long j9, long j10, long j11) {
                this.f52663a.d(j9, j10, j11);
            }
        });
        c0215c.h();
    }

    @Override // z3.InterfaceC3021A
    public void a(InterfaceC3021A.a aVar) {
        this.f52668e = aVar;
        boolean z9 = false;
        while (!z9) {
            try {
                if (this.f52670g) {
                    break;
                }
                this.f52669f = new a();
                this.f52664a.execute(this.f52669f);
                try {
                    this.f52669f.get();
                    z9 = true;
                } catch (ExecutionException e9) {
                    Throwable th = (Throwable) AbstractC1684a.e(e9.getCause());
                    if (th instanceof IOException) {
                        throw ((IOException) th);
                    }
                    k0.g1(th);
                }
            } finally {
                ((Q) AbstractC1684a.e(this.f52669f)).a();
            }
        }
    }

    @Override // z3.InterfaceC3021A
    public void cancel() {
        this.f52670g = true;
        Q q9 = this.f52669f;
        if (q9 != null) {
            q9.cancel(true);
        }
    }

    public final void d(long j9, long j10, long j11) {
        InterfaceC3021A.a aVar = this.f52668e;
        if (aVar == null) {
            return;
        }
        aVar.a(j9, j10, (j9 == -1 || j9 == 0) ? -1.0f : (j10 * 100.0f) / j9);
    }

    @Override // z3.InterfaceC3021A
    public void remove() {
        this.f52666c.t().j(this.f52666c.u().a(this.f52665b));
    }
}
