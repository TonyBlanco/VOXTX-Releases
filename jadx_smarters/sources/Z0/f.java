package Z0;

import android.database.Cursor;

/* JADX INFO: loaded from: classes.dex */
public final class f implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0.e f10787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0.b f10788b;

    public class a extends C0.b {
        public a(C0.e eVar) {
            super(eVar);
        }

        @Override // C0.k
        public String d() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // C0.b
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(G0.f fVar, d dVar) {
            String str = dVar.f10785a;
            if (str == null) {
                fVar.X(1);
            } else {
                fVar.x(1, str);
            }
            Long l9 = dVar.f10786b;
            if (l9 == null) {
                fVar.X(2);
            } else {
                fVar.A(2, l9.longValue());
            }
        }
    }

    public f(C0.e eVar) {
        this.f10787a = eVar;
        this.f10788b = new a(eVar);
    }

    @Override // Z0.e
    public void a(d dVar) {
        this.f10787a.b();
        this.f10787a.c();
        try {
            this.f10788b.h(dVar);
            this.f10787a.r();
        } finally {
            this.f10787a.g();
        }
    }

    @Override // Z0.e
    public Long b(String str) {
        C0.h hVarD = C0.h.d("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            hVarD.X(1);
        } else {
            hVarD.x(1, str);
        }
        this.f10787a.b();
        Long lValueOf = null;
        Cursor cursorB = E0.c.b(this.f10787a, hVarD, false, null);
        try {
            if (cursorB.moveToFirst() && !cursorB.isNull(0)) {
                lValueOf = Long.valueOf(cursorB.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorB.close();
            hVarD.h();
        }
    }
}
