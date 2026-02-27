package Z0;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0.e f10782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0.b f10783b;

    public class a extends C0.b {
        public a(C0.e eVar) {
            super(eVar);
        }

        @Override // C0.k
        public String d() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // C0.b
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(G0.f fVar, Z0.a aVar) {
            String str = aVar.f10780a;
            if (str == null) {
                fVar.X(1);
            } else {
                fVar.x(1, str);
            }
            String str2 = aVar.f10781b;
            if (str2 == null) {
                fVar.X(2);
            } else {
                fVar.x(2, str2);
            }
        }
    }

    public c(C0.e eVar) {
        this.f10782a = eVar;
        this.f10783b = new a(eVar);
    }

    @Override // Z0.b
    public List a(String str) {
        C0.h hVarD = C0.h.d("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            hVarD.X(1);
        } else {
            hVarD.x(1, str);
        }
        this.f10782a.b();
        Cursor cursorB = E0.c.b(this.f10782a, hVarD, false, null);
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

    @Override // Z0.b
    public boolean b(String str) {
        C0.h hVarD = C0.h.d("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            hVarD.X(1);
        } else {
            hVarD.x(1, str);
        }
        this.f10782a.b();
        boolean z9 = false;
        Cursor cursorB = E0.c.b(this.f10782a, hVarD, false, null);
        try {
            if (cursorB.moveToFirst()) {
                z9 = cursorB.getInt(0) != 0;
            }
            return z9;
        } finally {
            cursorB.close();
            hVarD.h();
        }
    }

    @Override // Z0.b
    public void c(Z0.a aVar) {
        this.f10782a.b();
        this.f10782a.c();
        try {
            this.f10783b.h(aVar);
            this.f10782a.r();
        } finally {
            this.f10782a.g();
        }
    }

    @Override // Z0.b
    public boolean d(String str) {
        C0.h hVarD = C0.h.d("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            hVarD.X(1);
        } else {
            hVarD.x(1, str);
        }
        this.f10782a.b();
        boolean z9 = false;
        Cursor cursorB = E0.c.b(this.f10782a, hVarD, false, null);
        try {
            if (cursorB.moveToFirst()) {
                z9 = cursorB.getInt(0) != 0;
            }
            return z9;
        } finally {
            cursorB.close();
            hVarD.h();
        }
    }
}
