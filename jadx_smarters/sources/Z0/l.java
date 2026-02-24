package Z0;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0.e f10799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0.b f10800b;

    public class a extends C0.b {
        public a(C0.e eVar) {
            super(eVar);
        }

        @Override // C0.k
        public String d() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // C0.b
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(G0.f fVar, j jVar) {
            String str = jVar.f10797a;
            if (str == null) {
                fVar.X(1);
            } else {
                fVar.x(1, str);
            }
            String str2 = jVar.f10798b;
            if (str2 == null) {
                fVar.X(2);
            } else {
                fVar.x(2, str2);
            }
        }
    }

    public l(C0.e eVar) {
        this.f10799a = eVar;
        this.f10800b = new a(eVar);
    }

    @Override // Z0.k
    public List a(String str) {
        C0.h hVarD = C0.h.d("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            hVarD.X(1);
        } else {
            hVarD.x(1, str);
        }
        this.f10799a.b();
        Cursor cursorB = E0.c.b(this.f10799a, hVarD, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                arrayList.add(cursorB.getString(0));
            }
            return arrayList;
        } finally {
            cursorB.close();
            hVarD.h();
        }
    }

    @Override // Z0.k
    public void b(j jVar) {
        this.f10799a.b();
        this.f10799a.c();
        try {
            this.f10800b.h(jVar);
            this.f10799a.r();
        } finally {
            this.f10799a.g();
        }
    }
}
