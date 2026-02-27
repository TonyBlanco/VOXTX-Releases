package Z0;

import d.AbstractC1617D;

/* JADX INFO: loaded from: classes.dex */
public final class o implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0.e f10802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0.b f10803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0.k f10804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0.k f10805d;

    public class a extends C0.b {
        public a(C0.e eVar) {
            super(eVar);
        }

        @Override // C0.k
        public String d() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // C0.b
        public /* bridge */ /* synthetic */ void g(G0.f fVar, Object obj) {
            AbstractC1617D.a(obj);
            i(fVar, null);
        }

        public void i(G0.f fVar, m mVar) {
            throw null;
        }
    }

    public class b extends C0.k {
        public b(C0.e eVar) {
            super(eVar);
        }

        @Override // C0.k
        public String d() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    public class c extends C0.k {
        public c(C0.e eVar) {
            super(eVar);
        }

        @Override // C0.k
        public String d() {
            return "DELETE FROM WorkProgress";
        }
    }

    public o(C0.e eVar) {
        this.f10802a = eVar;
        this.f10803b = new a(eVar);
        this.f10804c = new b(eVar);
        this.f10805d = new c(eVar);
    }

    @Override // Z0.n
    public void a(String str) {
        this.f10802a.b();
        G0.f fVarA = this.f10804c.a();
        if (str == null) {
            fVarA.X(1);
        } else {
            fVarA.x(1, str);
        }
        this.f10802a.c();
        try {
            fVarA.E();
            this.f10802a.r();
        } finally {
            this.f10802a.g();
            this.f10804c.f(fVarA);
        }
    }

    @Override // Z0.n
    public void b() {
        this.f10802a.b();
        G0.f fVarA = this.f10805d.a();
        this.f10802a.c();
        try {
            fVarA.E();
            this.f10802a.r();
        } finally {
            this.f10802a.g();
            this.f10805d.f(fVarA);
        }
    }
}
