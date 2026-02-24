package Z0;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0.e f10792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0.b f10793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0.k f10794c;

    public class a extends C0.b {
        public a(C0.e eVar) {
            super(eVar);
        }

        @Override // C0.k
        public String d() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        @Override // C0.b
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(G0.f fVar, g gVar) {
            String str = gVar.f10790a;
            if (str == null) {
                fVar.X(1);
            } else {
                fVar.x(1, str);
            }
            fVar.A(2, gVar.f10791b);
        }
    }

    public class b extends C0.k {
        public b(C0.e eVar) {
            super(eVar);
        }

        @Override // C0.k
        public String d() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public i(C0.e eVar) {
        this.f10792a = eVar;
        this.f10793b = new a(eVar);
        this.f10794c = new b(eVar);
    }

    @Override // Z0.h
    public g a(String str) {
        C0.h hVarD = C0.h.d("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            hVarD.X(1);
        } else {
            hVarD.x(1, str);
        }
        this.f10792a.b();
        Cursor cursorB = E0.c.b(this.f10792a, hVarD, false, null);
        try {
            return cursorB.moveToFirst() ? new g(cursorB.getString(E0.b.b(cursorB, "work_spec_id")), cursorB.getInt(E0.b.b(cursorB, "system_id"))) : null;
        } finally {
            cursorB.close();
            hVarD.h();
        }
    }

    @Override // Z0.h
    public List b() {
        C0.h hVarD = C0.h.d("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f10792a.b();
        Cursor cursorB = E0.c.b(this.f10792a, hVarD, false, null);
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

    @Override // Z0.h
    public void c(g gVar) {
        this.f10792a.b();
        this.f10792a.c();
        try {
            this.f10793b.h(gVar);
            this.f10792a.r();
        } finally {
            this.f10792a.g();
        }
    }

    @Override // Z0.h
    public void d(String str) {
        this.f10792a.b();
        G0.f fVarA = this.f10794c.a();
        if (str == null) {
            fVarA.X(1);
        } else {
            fVarA.x(1, str);
        }
        this.f10792a.c();
        try {
            fVarA.E();
            this.f10792a.r();
        } finally {
            this.f10792a.g();
            this.f10794c.f(fVarA);
        }
    }
}
